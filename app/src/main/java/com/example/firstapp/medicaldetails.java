package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class medicaldetails extends AppCompatActivity {
     private Button buttondownloadreport,buttonlogin;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicaldetails_layout);
        init();
        buttonlogin.setOnClickListener(new btnonclickdownloadlistener());
    }
    private void init () {
      buttondownloadreport = findViewById(R.id.buttondownload);
      buttonlogin = findViewById(R.id.buttonlogin);

    }

    private class btnonclickdownloadlistener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent =new Intent( medicaldetails.this,chatbot.class);
            startActivity(intent);
        }
    }
}
