package com.example.firstapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView textView;
    private EditText editText;
    private Button  buttonlogin;
    private Button  buttonnext;
    private  Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout=new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        textView=new TextView(this);
        textView.setText("welcome to opd care system");
        textView.setTextSize(40);
        //textView.setTextColor(Color.rgb(255,00,00));
        linearLayout.addView(textView);

        editText=new EditText(this);
        editText.setText("enter your name");
        editText.setTextSize(35);
        textView.setTextColor(Color.rgb(00,00,255));
        linearLayout.addView(editText);


        buttonlogin=new Button(this);
        buttonlogin.setText("Doctor");
        linearLayout.addView(buttonlogin);


        buttonnext=new Button(this);
        buttonnext.setText("paitent");
        linearLayout.addView(buttonnext);



        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent( MainActivity.this,Actnew.class);
                //Intent intent = new Intent(MainActivity.this,Actnew.class);
                intent.putExtra("name",editText.getText().toString());
                //ntent.putExtra("phone ",744729738);
               /* only for sending data to new activity  without accepting result or data from new activity
                startActivity(intent);
                */
                //starting activity for return of data from new activity
                startActivityForResult(intent,1);
            }
        });


        textView.setOnClickListener(new textclicklistener());

        buttonlogin.setOnClickListener(new buttonclicklistener());


        setContentView(linearLayout);

    }


    class buttonclicklistener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            textView.setText(editText.getText());
        }
    }

    class textclicklistener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            textView.setText("");



        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
          Bundle bundleb=data.getExtras();
          String results =bundleb.getString("gbackd","no data received");

          textView.setText( results );

    }
}