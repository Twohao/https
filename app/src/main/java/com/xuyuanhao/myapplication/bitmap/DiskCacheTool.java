package com.xuyuanhao.myapplication.bitmap;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

import com.jakewharton.disklrucache.DiskLruCache;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Mr.xu on 2016/3/8.
 */
public class DiskCacheTool {


    //
    private static DiskLruCache mDiskLruCache;

    /**
     * 初始化
     * @param context
     */
    public static void init(Context context) {

        /**
         * Opens the cache in {@code directory}, creating a cache if none exists
         * there.
         *
         * @param directory a writable directory  缓存目录
         * @param versionCode 版本号
         * @param valueCount the number of values per cache entry. Must be positive. 1=1 默认1
         * @param maxSize the maximum number of bytes this cache should use to store  用来缓存的空间大小
         * @throws IOException if reading or writing the cache directory fails
         */

        try {
            mDiskLruCache = mDiskLruCache.open(getCacheDirectory(context),getVersonCode(context),1,4*1024*1024);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 写入缓存
     * url 作为key
     * bitmap 作为value
     */

    public static void writeDiskCache(String url,Bitmap bitmap) {

        //Each key must match the regex  [a-z0-9_-]{1,64}
        String cacheKey = getCacheKey(url);
        try {
            DiskLruCache.Editor editor = mDiskLruCache.edit(cacheKey);
            if (editor != null) {
                OutputStream outputStream = editor.newOutputStream(0);

                //将Bitmap对象压缩到输出流中
                boolean isCompressSuccess = bitmap.compress(Bitmap.CompressFormat.PNG,100,outputStream);
                if (isCompressSuccess) {
                    //如果图片成功压缩到OutputStream流中，提交数据，以便缓存到磁盘中
                    editor.commit();
                } else {
                    //否则，回滚。
                    editor.abort();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读出缓存的图片
     *
     * @param url
     * @return
     */
    public static Bitmap getCacheBitmap(String url) {
        String cacheKey = getCacheKey(url);
        try {
            DiskLruCache.Snapshot snapshot = mDiskLruCache.get(cacheKey);
            if (snapshot != null) {
                InputStream inputStream = snapshot.getInputStream(0);
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                return bitmap;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


    private static String getCacheKey(String url) {

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            md.update(url.getBytes());
            byte[] bytess = md.digest();
            StringBuffer strBuffer = new StringBuffer();
            for (int i=0; i<bytess.length; i++) {
                strBuffer.append(Integer.toHexString(Math.abs(bytess[i])));
            }

            return strBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return String.valueOf(url.hashCode());
    }

    /**
     * 获取当前应用的版本号
     * @param context
     * @return
     */
    private static int getVersonCode (Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        return 0;
    }

    /**
     * 获取缓存目录
     */

    public static File getCacheDirectory(Context context) {
        //Cache

        //外部存储的Cache目录
        if (Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED
                && !Environment.isExternalStorageRemovable()) {
            //外部存储的缓存目录
            return context.getExternalCacheDir();
        }
        //内部存储缓存目录
        return context.getCacheDir();
    }

    /**
     * 更新日志文件：主要放到Activity的onDestory
     */
    public static void flush() {

        try {
            mDiskLruCache.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭缓存
     */
    public static void close() {
        try {
            mDiskLruCache.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
