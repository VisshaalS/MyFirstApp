package com.example.myfirstapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Test2Activity extends AppCompatActivity {

    Button testColor;
    LinearLayout relative;
    TextView getColor;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        testColor = findViewById(R.id.testColor);
        getColor = findViewById(R.id.getColor);
        relative = findViewById(R.id.relative);

        testColor.setBackgroundColor(Color.parseColor("#ffff66"));

        final String[] colors = {"#ffff66","#33ccff","#0066ff"};

        testColor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                testColor.setBackgroundColor(Color.parseColor(colors[i]));
                i++;
                if(i > colors.length -1){
                    i = 0;
                }

            }
        });
        TextView get = new TextView(Test2Activity.this);
        get.setBackgroundColor(Color.parseColor(colors[i]));
        get.setText(colors[i]);
        get.setWidth(100);
        get.setHeight(100);
        relative.addView(get);


    }

}
