package com.example.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Actnew extends Activity {
    private TextView txtview;
    private Button button;
    private Button button1;
    private EditText emailtext,phonetext,addresstext;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actnew_layout);
        //references= findViewById(R.id.textView);
         txtview = findViewById(R.id.txtview);
         emailtext = findViewById(R.id.editTextTextEmailAddress);
         phonetext =findViewById(R.id.editTextPhone);
         addresstext =findViewById(R.id.editTextTextPostalAddress);
         button1 =  findViewById(R.id.button1);



        // data from m.a
        final Intent intent=getIntent();
        Bundle bundle =intent.getExtras();
        String name =bundle.getString("name","not found");
        int phone=bundle.getInt("phone",900);

        txtview.setText("welcome :"+ name +"\n"+  "complete following details" );

         button1.setOnClickListener(new buttonnextclicklistener());
    }
    class buttonclicklistener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
               Intent intentb = new Intent();
               intentb.putExtra( "gbackd",emailtext.getText().toString());
               setResult(1,intentb);
               finish();
        }
    }
    class buttonnextclicklistener implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            Intent intent =new Intent( Actnew.this,medicaldetails.class);
            intent.putExtra("address",emailtext.getText().toString());
            intent.putExtra("phone",emailtext.getText().toString());
            intent.putExtra("email",emailtext.getText().toString());
            startActivity(intent);
        }
    }
}
