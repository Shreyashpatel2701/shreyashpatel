package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class chatbot extends AppCompatActivity {

   public Button buttontakeappointenment;
    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatbot_layout);
        id();
        buttontakeappointenment.setOnClickListener(new btntakeappointmentclicklistener());
     imageView.setOnClickListener(new imageclicklistener());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add("add");
        menu.add("about app");

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 1: 
        }

        return super.onOptionsItemSelected(item);
    }

    private void mt(String Text){
        Toast.makeText(this,Text,Toast.LENGTH_LONG).show();
    }



    public void id(){
        buttontakeappointenment = findViewById(R.id.Bookappoinment);
        imageView = findViewById(R.id.imageViewchatbot);
    }


  class btntakeappointmentclicklistener implements View.OnClickListener{
      @Override
      public void onClick(View view) {
          Intent intent =new Intent( chatbot.this,bookappointment.class);
          startActivity(intent);
      }
  }

  class imageclicklistener implements View.OnClickListener{
      @Override
      public void onClick(View view) {
          Intent intent =new Intent( chatbot.this,gridview.class);
          startActivity(intent);
      }
  }


}



