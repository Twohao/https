package com.xuyuanhao.myapplication.bitmap;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

/**
 * Created by Mr.xu on 2016/3/8.
 */
public class MemoryCacheTool {

    private static LruCache<String,Bitmap> mLruCache;

    static {
        //参数：
//        long memory = Runtime.getRuntime().maxMemory()/8;
        int cacheSize = 4 * 1024 * 1024;
        mLruCache = new LruCache<String,Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                //返回的是Bitmap对象的大小
                //By default, the cache size is measured in the number of entries. Override sizeOf(K, V) to size the cache in different units. For example, this cache is limited to 4MiB of bitmaps
                return value.getByteCount();
            }
        };
    }


    public static void putCache(String url,Bitmap bitmap) {
        mLruCache.put(url,bitmap);
    }

    public static Bitmap getCache(String url) {

        Bitmap bitmap = mLruCache.get(url);

        return bitmap;
    }
}
