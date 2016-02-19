package com.example.user.moodleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        b1=(Button)findViewById(R.id.assign);
        b2=(Button)findViewById(R.id.course);
        b3=(Button)findViewById(R.id.thread);
        b4=(Button)findViewById(R.id.notify);
        b1.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                Intent myIntent = new Intent(
                        Profile.this,Assignments.class);
                startActivity(myIntent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                Intent myIntent = new Intent(
                        Profile.this,Courses.class);
                startActivity(myIntent);
            }
        });

    }

}