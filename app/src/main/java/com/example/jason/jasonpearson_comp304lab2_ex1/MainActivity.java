package com.example.jason.jasonpearson_comp304lab2_ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Cuisines (View view) {
        Intent intent = new Intent(this, DisplayCuisineActivity.class); // Intent - class object instance of class (Intent)- constructor takes two arguments (Context - this - for everything in the current Activity <Main>, Class - DisplayMessageActivity.class - encapsulates calling a class (a Different Activity)
        startActivity(intent); // in-house method, starts new Activity, taking the Intent as an argument(starts instance of DisplayMessageActivity class)

    }
}
