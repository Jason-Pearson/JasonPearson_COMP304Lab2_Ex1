package com.example.jason.jasonpearson_comp304lab2_ex1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class CustomerActivity extends AppCompatActivity {

    public final static String INTENT_KEY_CUSTOMER_NAME = "CUSTOMER.NAME";
    public final static String INTENT_KEY_CUSTOMER_EMAIL = "CUSTOMER.EMAIL";
    public final static String INTENT_KEY_CUSTOMER_ADDRESS = "CUSTOMER.ADDRESS";
    public final static String INTENT_KEY_CUSTOMER_FAV_CHEF = "CUSTOMER.FAV_CHEF";
    public final static String INTENT_KEY_CUSTOMER_FAV_FOOD = "CUSTOMER.FAV_FOOD";

    public final static String INTENT_EXTRAS_CUISINE_CHOICE = "CUSTOMER.EXTRAS.CUISINE.CHOICE";
    public final static String INTENT_EXTRAS_CUISINE_FOOD1 = "CUSTOMER.EXTRAS.CUISINE.FOOD1";
    public final static String INTENT_EXTRAS_CUISINE_FOOD2 = "CUSTOMER.EXTRAS.CUISINE.FOOD2";

    Intent intent_cuisine;

    //Button order = (Button) findViewById(R.id.order);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        intent_cuisine = getIntent(); //this intent has a method get the Intent that starts this activity - since every Activity is invoked via an Intent
        //INTENT_EXTRAS_CUISINE_CHOICE = intent.getStringExtra(DisplayCuisineActivity.INTENT_KEY_CUISINE_CHOICE); // String message = equal data from first activity <main> - via it's Key String (EXTRA.MESSAGE) - an extra from previous Intent (which equals this activity's Intent variable via getIntent)
        //INTENT_EXTRAS_CUISINE_FOOD1 = intent.getStringExtra(DisplayCuisineActivity.INTENT_KEY_CUISINE_FOOD1); // String message = equal data from first activity <main> - via it's Key String (EXTRA.MESSAGE) - an extra from previous Intent (which equals this activity's Intent variable via getIntent)
        //INTENT_EXTRAS_CUISINE_FOOD2 = intent.getStringExtra(DisplayCuisineActivity.INTENT_KEY_CUISINE_FOOD2); // String message = equal data from first activity <main> - via it's Key String (EXTRA.MESSAGE) - an extra from previous Intent (which equals this activity's Intent variable via getIntent)

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

    public void Order (View view) {

    EditText name = (EditText) findViewById(R.id.edit_Name);
    EditText email = (EditText) findViewById(R.id.edit_Email);
    EditText address = (EditText) findViewById(R.id.edit_Address);
    EditText fav_Chef = (EditText) findViewById(R.id.edit_Fav_Chef);
    EditText fav_Food = (EditText) findViewById(R.id.edit_Fav_Food);

        String string_name = name.getText().toString();
        String string_email = email.getText().toString();
        String string_address = address.getText().toString();
        String string_chef = fav_Chef.getText().toString();
        String string_food = fav_Food.getText().toString();

        if( name.getText().toString().trim().equals("")){



            name.setError( "Full name is required!" );

        }
        else if( email.getText().toString().trim().equals("")){



            email.setError( "Email address is required!" );

        }
        else if( address.getText().toString().trim().equals("")){



            address.setError( "Home address is required!" );

        }
        else if( fav_Food.getText().toString().trim().equals("")){



            fav_Food.setError( "This field is required!" );

        }
        else if( fav_Chef.getText().toString().trim().equals("")){



            fav_Chef.setError( "This field is required!" );

        }else{
            Intent intent = new Intent(CustomerActivity.this, Order.class);

            intent.putExtra(INTENT_EXTRAS_CUISINE_CHOICE, intent_cuisine.getStringExtra(DisplayCuisineActivity.INTENT_KEY_CUISINE_CHOICE));
            intent.putExtra(INTENT_EXTRAS_CUISINE_FOOD1, intent_cuisine.getStringExtra(DisplayCuisineActivity.INTENT_KEY_CUISINE_FOOD1));
            intent.putExtra(INTENT_EXTRAS_CUISINE_FOOD2, intent_cuisine.getStringExtra(DisplayCuisineActivity.INTENT_KEY_CUISINE_FOOD2));

            intent.putExtra(INTENT_KEY_CUSTOMER_NAME, string_name);
            intent.putExtra(INTENT_KEY_CUSTOMER_EMAIL, string_email);
            intent.putExtra(INTENT_KEY_CUSTOMER_ADDRESS, string_address);
            intent.putExtra(INTENT_KEY_CUSTOMER_FAV_CHEF, string_chef);
            intent.putExtra(INTENT_KEY_CUSTOMER_FAV_FOOD, string_food);

            startActivity(intent); // in-house method, starts new Activity, taking the Intent as an argument(starts instance of DisplayMessageActivity class)

        }
    }

}
