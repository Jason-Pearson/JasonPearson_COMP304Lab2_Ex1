package com.example.jason.jasonpearson_comp304lab2_ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class CustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        Intent intent = getIntent(); //this intent has a method get the Intent that starts this activity - since every Activity is invoked via an Intent
        String INTENT_EXTRAS_CUISINE_CHOICE = intent.getStringExtra(DisplayCuisineActivity.INTENT_KEY_CUISINE_CHOICE); // String message = equal data from first activity <main> - via it's Key String (EXTRA.MESSAGE) - an extra from previous Intent (which equals this activity's Intent variable via getIntent)
        String INTENT_EXTRAS_CUISINE_FOOD = intent.getStringExtra(DisplayCuisineActivity.INTENT_KEY_CUISINE_FOOD); // String message = equal data from first activity <main> - via it's Key String (EXTRA.MESSAGE) - an extra from previous Intent (which equals this activity's Intent variable via getIntent)

        //make View object instances to post titles of menu item choices (I guess that's in Order class though)
        TextView textView = new TextView(this); //create message TextView element
        textView.setTextSize(40); //set its size (by pixels, width and length?)
        textView.setText(INTENT_EXTRAS_CUISINE_CHOICE + INTENT_EXTRAS_CUISINE_FOOD); // set Text = equal string Message

        //In order to add these object instances into the Customer class layout xml file
        //In order to add TextView to this activity's layout - activity_display_message.xml
        ViewGroup layout = (ViewGroup) findViewById(R.id.customer_Activity); // create instance of ViewGroup called layout = via id of the layout via android:id in activity_display_message.xml file (casted as ViewGroup, to call addView() method - to add TextView message
        layout.addView(textView); //layout instance.calls addView(display TextView message View)


    }
}
