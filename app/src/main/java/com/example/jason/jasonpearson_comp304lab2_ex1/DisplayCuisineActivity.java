package com.example.jason.jasonpearson_comp304lab2_ex1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.RadioButton;
import android.widget.Toast;

public class DisplayCuisineActivity extends AppCompatActivity {

    public boolean addItemIntent = false;

    public final static String INTENT_KEY_CUISINE_CHOICE = "CUISINE.CHOICE";
    public final static String INTENT_KEY_CUISINE_FOOD1 = "CUISINE.FOOD1";
    public final static String INTENT_KEY_CUISINE_FOOD2 = "CUISINE.FOOD2";

    private String cuisine = "";
    private String restaurant = "";
    private String food = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_cuisine);
    }

    public void onRadioButtonClicked(View view) {
        RadioButton rb1 = (RadioButton) findViewById(R.id.cuisineRB1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.cuisineRB2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.cuisineRB3);

        Button select = (Button) findViewById(R.id.SELECT);
        Button next = (Button) findViewById(R.id.NEXT);

        // Check which radio button was clicked
        if (rb1.isChecked()) {
            next.setVisibility(Button.INVISIBLE);
            select.setVisibility(Button.VISIBLE);
            next.setClickable(false);
            select.setClickable(true);
            Toast.makeText(this,"You chose American!", Toast.LENGTH_SHORT).show();
            cuisine = rb1.getText().toString();
        } else if (rb2.isChecked()){
            next.setVisibility(Button.INVISIBLE);
            select.setVisibility(Button.VISIBLE);
            next.setClickable(false);
            select.setClickable(true);
            Toast.makeText(this,"You chose Chinese!", Toast.LENGTH_SHORT).show();
            cuisine = rb2.getText().toString();
        }else if (rb3.isChecked()) {
            next.setVisibility(Button.INVISIBLE);
            select.setVisibility(Button.VISIBLE);
            next.setClickable(false);
            select.setClickable(true);
            Toast.makeText(this, "You chose Mexican!", Toast.LENGTH_SHORT).show();
            cuisine = rb3.getText().toString();
        }
    }

    public void Restaurants (final View view) {
        RadioButton rb1 = (RadioButton) findViewById(R.id.cuisineRB1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.cuisineRB2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.cuisineRB3);

        final Button select = (Button) findViewById(R.id.SELECT);
        final Button next = (Button) findViewById(R.id.NEXT);

        next.setVisibility(Button.INVISIBLE);
        next.setClickable(false);
        addItemIntent = false;
        restaurant = "";
        food = "";

        final PopupMenu popup_American = new PopupMenu(DisplayCuisineActivity.this, select);
        final PopupMenu popup_Chinese = new PopupMenu(DisplayCuisineActivity.this, select);
        final PopupMenu popup_Mexican = new PopupMenu(DisplayCuisineActivity.this, select);

        if (rb1.isChecked()) {
            //Inflating the Popup using xml file
            popup_American.getMenuInflater().inflate(R.menu.menu_american, popup_American.getMenu());

            //registering popup with OnMenuItemClickListener
            popup_American.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem item) {
                    //Make Toast Message upon clicking Menu item
                    Toast.makeText(DisplayCuisineActivity.this,"You chose " + item.getTitle(),Toast.LENGTH_SHORT).show();
                    if(addItemIntent == false)
                    {
                        MenuItem item1 = item;
                        restaurant += item1.toString();
                        //Toast.makeText(DisplayCuisineActivity.this,"Added chosen Restaurant to Intent - addSECONDIntent is " + addItemIntent + " and item1 is " + item1.getTitle(),Toast.LENGTH_SHORT).show();
                        addItemIntent = true;
                        //Toast.makeText(DisplayCuisineActivity.this,intentPopup.getCharSequenceExtra("restaurant_American"),Toast.LENGTH_SHORT).show();
                    }
                    else if (addItemIntent == true){
                        MenuItem item2 = item;
                        food += item2.toString();
                        //Toast.makeText(DisplayCuisineActivity.this,"Added chosen Restaurant to Intent - SECONDIntent added is " + addItemIntent + " and item2 is " + item2.getTitle(),Toast.LENGTH_SHORT).show();
                        addItemIntent = false;
                        next.setVisibility(Button.VISIBLE);
                        next.setClickable(true);
                    }

                    return true;
                }

            });
            popup_American.show();
        }else if (rb2.isChecked()){
            popup_Chinese.getMenuInflater().inflate(R.menu.menu_chinese, popup_Chinese.getMenu());
            popup_Chinese.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem item) {
                    //Make Toast Message upon clicking Menu item
                    Toast.makeText(DisplayCuisineActivity.this,"You chose " + item.getTitle(),Toast.LENGTH_SHORT).show();
                    if(addItemIntent == false)
                    {
                        MenuItem item1 = item;
                        restaurant += item1.toString();
                        //Toast.makeText(DisplayCuisineActivity.this,"Added chosen Restaurant to Intent - addSECONDIntent is " + addItemIntent + " and item1 is " + item1.getTitle(),Toast.LENGTH_SHORT).show();
                        addItemIntent = true;
                        //Toast.makeText(DisplayCuisineActivity.this,intentPopup.getCharSequenceExtra("restaurant_American"),Toast.LENGTH_SHORT).show();
                    }
                    else if (addItemIntent == true){
                        //Intent intentPopup = new Intent(DisplayCuisineActivity.this, DisplayAmericanActivity.class);
                        MenuItem item2 = item;
                        food += item2.toString();
                        //Toast.makeText(DisplayCuisineActivity.this,"Added chosen Restaurant to Intent - SECONDIntent added is " + addItemIntent + " and item2 is " + item2.getTitle(),Toast.LENGTH_SHORT).show();
                        addItemIntent = false;
                        next.setVisibility(Button.VISIBLE);
                        next.setClickable(true);
                    }

                    return true;
                }
            });
            popup_Chinese.show();
        }else if (rb3.isChecked()){
            popup_Mexican.getMenuInflater().inflate(R.menu.menu_mexican, popup_Mexican.getMenu());
            popup_Mexican.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem item) {
                    //Make Toast Message upon clicking Menu item
                    Toast.makeText(DisplayCuisineActivity.this,"You chose " + item.getTitle(),Toast.LENGTH_SHORT).show();
                    //Save first(restaurant) and second(food) item checkIndexes into an intent(putExtra, go to next Activity(customer?) to carry over intent
                    if(addItemIntent == false)
                    {
                        MenuItem item1 = item;
                        restaurant += item1.toString();
                        //Toast.makeText(DisplayCuisineActivity.this,"Added chosen Restaurant to Intent - addSECONDIntent is " + addItemIntent + " and item1 is " + item1.getTitle(),Toast.LENGTH_SHORT).show();
                        addItemIntent = true;
                        //Toast.makeText(DisplayCuisineActivity.this,intentPopup.getCharSequenceExtra("restaurant_American"),Toast.LENGTH_SHORT).show();
                    }
                    else if (addItemIntent == true){
                        MenuItem item2 = item;
                        food += item2.toString();
                        Toast.makeText(DisplayCuisineActivity.this,"Added chosen Restaurant to Intent - SECONDIntent added is " + addItemIntent + " and item2 is " + item2.getTitle(),Toast.LENGTH_SHORT).show();
                        addItemIntent = false;
                        next.setVisibility(Button.VISIBLE);
                        next.setClickable(true);
                    }

                    return true;
                }
            });
            popup_Mexican.show();
        }
    }

    public void Customer (View view) {
        Intent intent = new Intent(DisplayCuisineActivity.this, CustomerActivity.class);
        intent.putExtra(INTENT_KEY_CUISINE_CHOICE, cuisine);
        intent.putExtra(INTENT_KEY_CUISINE_FOOD1, restaurant);
        intent.putExtra(INTENT_KEY_CUISINE_FOOD2, food);
        startActivity(intent); // in-house method, starts new Activity, taking the Intent as an argument(starts instance of DisplayMessageActivity class)
    }
}