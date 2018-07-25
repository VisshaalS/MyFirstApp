package com.example.myfirstapp;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class TestActivity extends AppCompatActivity {

    Button bTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

    /*    db = FirebaseFirestore.getInstance();
        auth = FirebaseAuth.getInstance();

        horizontal = findViewById(R.id.horizontalLinearLayout);
        relative  = findViewById(R.id.relative);


        db.collection("users").get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                if (!queryDocumentSnapshots.isEmpty()) {
                    List<DocumentSnapshot> userList = queryDocumentSnapshots.getDocuments();
                    for (DocumentSnapshot user : userList) {
                        String docId = user.getId();
                        String userName = user.getString("name");

                        userHeaders(userName,docId);


                    }
                }
            }
        });

    }

    private void userHeaders(String userName, final String docId){

        //making DisplayMetrics for dp conversion
        DisplayMetrics dm = getResources().getDisplayMetrics();
        float width = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 75, dm);
        float height = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 30, dm);
        float lineWidth = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,1,dm);
        float lineHeight = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 930, dm);

        //created the textView for the headers
        TextView create = new TextView(this);
        create.setText(userName);
        create.setLayoutParams(new LinearLayout.LayoutParams(Math.round(width),Math.round(height)));
        create.setBackgroundColor(Color.parseColor("#ffff00"));


        //vertical linear layout created for each header in order to add data since cant get positions.
        horizontal.addView(create);



        //code to add buttons here
        if(create.getText().toString().equals("1234")) {
            Button test = new Button(this);
            test.setText(String.valueOf(test.getLeft()));
            relative.addView(test);
        }
        db.collection("Events").whereEqualTo("user",docId).get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                if(!queryDocumentSnapshots.isEmpty()) {
                    List<DocumentSnapshot> eventList = queryDocumentSnapshots.getDocuments();
                    for(DocumentSnapshot events : eventList){
                        String day = events.getString("day");
                        String className = events.getString("className");
                        String classNumber = events.getString("classNumber");
                        String startTime = events.getString("startTime");
                        String endTime = events.getString("endTime");
                        String user = events.getString("user");

                        *//*
                        add the button here after using the createButton method that should return a button.
                        Once that is done then we add it to the ll layout and organize them.
                        Organizing potentially by either changing the collection to only getting one user.
                        Or organize by keeping this and somehow using if statements and changing.

                        change the userheaders to constraintlayout or something because linear layout
                        will not work since it put things you add in a list. Got to have the x value so
                        events can be underneath specific users.
                         *//*




                        Button but = createButton(day, className, classNumber, startTime, endTime,user,docId);
                        //maybe add the setX() here...

                        relative.addView(but);



                    }
                }
            }
        });




        //now need a line separator in between going all the way down. Need relative view for this
        View line = new View(this);
        line.setLayoutParams(new RelativeLayout.LayoutParams(Math.round(lineWidth),Math.round(lineHeight)));
        line.setBackgroundColor(Color.BLACK);
        horizontal.addView(line);




    }

    private Button createButton(String day, String className, String classNumber, String startTime, String endTime,String user,String docId) {


        //getting the current day.
        Calendar sCalendar = Calendar.getInstance();
        String currentDay = sCalendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());


        //xPos changes if user changes.
        ArrayList<String> users = new ArrayList<>();
        if(!users.contains(user)){
            users.add(user);
        }
        Integer xPos = 51+ (users.indexOf(docId) * 76);

        // startTime calculation which will be used for the set Y.
        int startHour = Integer.parseInt((startTime.substring(0,startTime.indexOf(":"))));
        int startMin = Integer.parseInt(startTime.substring(startTime.indexOf(":") + 1,startTime.length()));

        startHour = (startHour - 8) * 60;
        //need to add 30 because of the header. start will be the variable for setY
        int start = startHour + startMin + 30;

        // endTime calculation in order to determine height of the event.
        int endHour = Integer.parseInt((endTime.substring(0,endTime.indexOf(":"))));
        int endMin = Integer.parseInt(endTime.substring(endTime.indexOf(":") + 1,endTime.length()));

        endHour = (endHour -8) * 60;

        int end = endHour + endMin + 30;

        int heightVal = end - start;

        //making display metrics in order to convert pixels to dp
        DisplayMetrics dm = getResources().getDisplayMetrics();
        float x = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,xPos,dm);
        float y = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,start,dm);
        float width = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 75, dm);
        float height = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,heightVal,dm);


        //creating the button
        Button but = new Button(this);
        but.setX(x);
        but.setY(y);
        but.setText(className + "\n" + classNumber);
        but.setBackgroundColor(Color.parseColor("#ff0000"));
        but.setLayoutParams(new LinearLayout.LayoutParams(Math.round(width), Math.round(height)));

        return but;

    }
*/
    }
}
