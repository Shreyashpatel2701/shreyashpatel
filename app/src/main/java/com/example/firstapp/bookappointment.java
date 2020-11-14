package com.example.firstapp;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class bookappointment extends AppCompatActivity{
    private Button buttonbookdate,buttonbooktime,buttonbookplace;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookappointment_layout);
        id();
        buttonbookdate.setOnClickListener(new btnbookdateclicklistener());
        buttonbooktime.setOnClickListener(new booktimeclicklistener());
    }

    public void id(){
        buttonbookdate = findViewById(R.id.appointmentdate);
        buttonbooktime = findViewById(R.id.appointmenttime);
        buttonbookplace = findViewById(R.id.appointmentplace);

    }

    class btnbookdateclicklistener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            DatePickerDialog datePickerDialog = new DatePickerDialog(bookappointment.this,
             new bookdatelistener(),
            2000,8,21
            );
             datePickerDialog.show();
        }
    }
    class bookdatelistener implements DatePickerDialog.OnDateSetListener{
        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int dateofmonth) {
            buttonbookdate.setText(dateofmonth +"-"+ (month+1) +"-" +year);

        }
    }
    class booktimeclicklistener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            TimePickerDialog timePickerDialog = new TimePickerDialog(
                    bookappointment.this,
                     new booktimelistener() ,9,45,true
            );
           timePickerDialog.show();
        }
    }
    class booktimelistener implements TimePickerDialog.OnTimeSetListener{
        @Override
        public void onTimeSet(TimePicker timePicker, int hour, int min) {
            buttonbooktime.setText(hour+"-"+min);
        }
    }
}
