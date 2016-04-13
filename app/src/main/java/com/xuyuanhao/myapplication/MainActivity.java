package com.xuyuanhao.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.xuyuanhao.myapplication.bean.ProductInfo;
import com.xuyuanhao.myapplication.http.HttpUtils;
import com.xuyuanhao.myapplication.http.RequestCallBack;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListVIew;

    private List<ProductInfo.DataEntity.ProductsEntity> dataList = new ArrayList<>();
    private MyAdapter myAdapter;

    RequestCallBack callBack = new RequestCallBack() {
        @Override
        public void onSuccess(String result,int requestCode) {
            Log.d("demo", "===" + result);

            switch (requestCode) {
                case 1:
                    Gson gson = new Gson();
                    ProductInfo productInfo = gson.fromJson(result, ProductInfo.class);
                    dataList.addAll(productInfo.getData().getProducts());
                    myAdapter.notifyDataSetChanged();
                    break;
                case 2:
                    //-----------------
                    break;
            }

        }

        @Override
        public void onFailure(String error) {

        }

        @Override
        public void error(Exception ex) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListVIew = (ListView) findViewById(R.id.list_view);
        myAdapter = new MyAdapter();
        mListVIew.setAdapter(myAdapter);

        HttpUtils.requestGet("http://apicn.seashellmall.com/product/list/?size=20&p=1", callBack, 1);

        HttpUtils.requestGet("http://apicn.seashellmall.com/product/topics", callBack, 2);




    }


    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return dataList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView  view = (TextView) convertView;
            if (view == null) {
                view = new TextView(MainActivity.this);
            }
            view.setText(dataList.get(position).getName());
            return view;
        }
    }

}
