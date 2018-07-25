package com.example.myfirstapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.lang.reflect.Type;

import static android.graphics.Color.GREEN;

public class CalendarActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        RelativeLayout relative = findViewById(R.id.relative);


        //need this to make sure that pixels gets transferred to dp
        DisplayMetrics dm = getResources().getDisplayMetrics();
        float width = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 75, dm);
        float height = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,60,dm);

        float x = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,51,dm);
        float y = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,30,dm);
        float Monday = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,127,dm);


        //normal background doesn't work. just set the background color to something different
        Button but = new Button(this);
        but.setText("button");
        but.setX(x);
        but.setY(y);
        but.setBackgroundColor(Color.BLUE);
        but.setLayoutParams(new RelativeLayout.LayoutParams(Math.round(width), Math.round(height)));
        relative.addView(but);

        //text view works fine because it fills the background.
        TextView abc = new TextView(this);
        abc.setText("abc");
        abc.setX(Monday);
        abc.setY(y);
        abc.setBackgroundColor(GREEN);
        abc.setLayoutParams(new RelativeLayout.LayoutParams(Math.round(width), Math.round(height)));

        relative.addView(abc);

    }
}
