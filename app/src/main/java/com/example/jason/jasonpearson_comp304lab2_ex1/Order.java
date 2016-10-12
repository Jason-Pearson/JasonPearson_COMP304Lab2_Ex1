package com.example.jason.jasonpearson_comp304lab2_ex1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();

        String INTENT_EXTRAS_CUISINE_CHOICE = "Cuisine: " + intent.getStringExtra(CustomerActivity.INTENT_EXTRAS_CUISINE_CHOICE); // String message = equal data from first activity <main> - via it's Key String (EXTRA.MESSAGE) - an extra from previous Intent (which equals this activity's Intent variable via getIntent)
        String INTENT_EXTRAS_CUISINE_REST = "Restaurant: " + intent.getStringExtra(CustomerActivity.INTENT_EXTRAS_CUISINE_FOOD1);
        String INTENT_EXTRAS_CUISINE_FOOD = "Food: " + intent.getStringExtra(CustomerActivity.INTENT_EXTRAS_CUISINE_FOOD2); // String message = equal data from first activity <main> - via it's Key String (EXTRA.MESSAGE) - an extra from previous Intent (which equals this activity's Intent variable via getIntent)

        String INTENT_EXTRAS_CUSTOMER_NAME = "Name: " + intent.getStringExtra(CustomerActivity.INTENT_KEY_CUSTOMER_NAME);
        String INTENT_EXTRAS_CUSTOMER_EMAIL = "Email: " + intent.getStringExtra(CustomerActivity.INTENT_KEY_CUSTOMER_EMAIL);
        String INTENT_EXTRAS_CUSTOMER_ADDRESS = "Address: " + intent.getStringExtra(CustomerActivity.INTENT_KEY_CUSTOMER_ADDRESS);
        String INTENT_EXTRAS_CUSTOMER_FAV_CHEF = "Favourite Chef: " + intent.getStringExtra(CustomerActivity.INTENT_KEY_CUSTOMER_FAV_CHEF);
        String INTENT_EXTRAS_CUSTOMER_FAV_FOOD = "Favourite Food: " + intent.getStringExtra(CustomerActivity.INTENT_KEY_CUSTOMER_FAV_FOOD);

        TextView cuisine = (TextView)findViewById(R.id.display_Cuisine);
        TextView restaurant = (TextView)findViewById(R.id.display_Restaurant);
        TextView food = (TextView)findViewById(R.id.display_Food);

        TextView name = (TextView)findViewById(R.id.display_Name);
        TextView email = (TextView)findViewById(R.id.display_Email);
        TextView address = (TextView)findViewById(R.id.display_Address);
        TextView fav_food = (TextView)findViewById(R.id.display_Fav_Food);
        TextView fav_chef = (TextView)findViewById(R.id.display_Fav_Chef);

        cuisine.setText(INTENT_EXTRAS_CUISINE_CHOICE);
        restaurant.setText(INTENT_EXTRAS_CUISINE_REST);
        food.setText(INTENT_EXTRAS_CUISINE_FOOD);

        name.setText(INTENT_EXTRAS_CUSTOMER_NAME);
        email.setText(INTENT_EXTRAS_CUSTOMER_EMAIL);
        address.setText(INTENT_EXTRAS_CUSTOMER_ADDRESS);
        fav_food.setText(INTENT_EXTRAS_CUSTOMER_FAV_FOOD);
        fav_chef.setText(INTENT_EXTRAS_CUSTOMER_FAV_CHEF);

/* - This is IF you have new views that aren't reference by anything pre-existing, to add into the layout
        ViewGroup layout = (ViewGroup) findViewById(R.id.order_Activity); // create instance of ViewGroup called layout = via id of the layout via android:id in activity_display_message.xml file (casted as ViewGroup, to call addView() method - to add TextView message

        layout.removeAllViews();
        layout.addView(cuisine);
        layout.addView(restaurant);
        layout.addView(food);

        layout.addView(name);
        layout.addView(email);
        layout.addView(address);
        layout.addView(fav_food);
        layout.addView(fav_chef);
        /*
        //make View object instances to post titles of menu item choices (I guess that's in Order class though)
        TextView textView = new TextView(this); //create message TextView element
        textView.setTextSize(40); //set its size (by pixels, width and length?)
        textView.setText(INTENT_EXTRAS_CUISINE_CHOICE + INTENT_EXTRAS_CUISINE_FOOD); // set Text = equal string Message

        //In order to add these object instances into the Customer class layout xml file
        //In order to add TextView to this activity's layout - activity_display_message.xml
        ViewGroup layout = (ViewGroup) findViewById(R.id.customer_Activity); // create instance of ViewGroup called layout = via id of the layout via android:id in activity_display_message.xml file (casted as ViewGroup, to call addView() method - to add TextView message
        layout.addView(textView); //layout instance.calls addView(display TextView message View)
*/
    }

    public void Reset(View view)
    {
        Intent intent = new Intent(Order.this, MainActivity.class);
        startActivity(intent); // in-house method, starts new Activity, taking the Intent as an argument(starts instance of DisplayMessageActivity class)

    }
}
