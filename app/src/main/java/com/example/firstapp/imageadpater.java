package com.example.firstapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class imageadpater extends BaseAdapter {
    private int[] mIMAGEids;
    private Context mcontext;


    public imageadpater(Context context,int [] IMAGEIDS){
        mcontext=context;
        mIMAGEids=IMAGEIDS;

    }

    @Override
    public int getCount() {
        return mIMAGEids.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView=new ImageView(mcontext);
        imageView.setLayoutParams(new GridView.LayoutParams(300,500));
        imageView.setImageResource(mIMAGEids[i]);
        return imageView;
    }
}
