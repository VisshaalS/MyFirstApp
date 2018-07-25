package com.example.myfirstapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayout linear = findViewById(R.id.horizontalLinearLayout);

        for(int i = 0; i < 10; i++) {
            TextView test = new TextView(this);
            test.setText("test");
            linear.addView(test);
            View line = new View(this);
            line.setBackgroundColor(Color.BLACK);
            linear.addView(line);
        }



    }

}
