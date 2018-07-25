package com.example.myfirstapp;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TimePicker;

public class UserInputActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);

        Spinner daySpinner = findViewById(R.id.daySpinner);
        EditText etClassName = findViewById(R.id.etClassName);
        EditText etClassNumber = findViewById(R.id.etClassNumber);
        TimePicker startTime = findViewById(R.id.startPicker);
        TimePicker endTime = findViewById(R.id.endPicker);
        Button bEnter = findViewById(R.id.bEnter);


        bEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //makes userInput go to the calendar
                Intent userToCalendar= new Intent(UserInputActivity.this,CalendarActivity.class);
                UserInputActivity.this.startActivity(userToCalendar);

            }
        });


    }
}
