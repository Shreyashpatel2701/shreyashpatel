package com.example.firstapp;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;

public class gridview extends AppCompatActivity {
      private GridView mgridView;
      private int[] mimageids={
         R.drawable.shreyash1,R.drawable.shreyash2,R.drawable.shreyash3,R.drawable.shreyash5,
              R.drawable.shreyash6,R.drawable.shreyash1,R.drawable.shreyash2,R.drawable.shreyash3,R.drawable.shreyash5,
              R.drawable.shreyash6,R.drawable.shreyash1,R.drawable.shreyash2,R.drawable.shreyash3,R.drawable.shreyash5,
              R.drawable.shreyash6,

    };
      private imageadpater mImageadpater;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_layout);
        id();
        mImageadpater = new imageadpater(this,mimageids);
        mgridView.setAdapter(mImageadpater);
    }


   private void id(){
        mgridView =findViewById(R.id.gridview);

    }
}
