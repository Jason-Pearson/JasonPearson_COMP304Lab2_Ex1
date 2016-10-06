package com.example.jason.jasonpearson_comp304lab2_ex1;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.PopupMenu;
import android.widget.RadioButton;
import android.widget.Toast;
public class DisplayCuisineActivity extends AppCompatActivity {
/*
    //RadioGroup cuisineRG = (RadioGroup) findViewById(R.id.cuisineRG);
    RadioButton rb1 = (RadioButton) findViewById(R.id.cuisineRB1);
    RadioButton rb2 = (RadioButton) findViewById(R.id.cuisineRB2);
    RadioButton rb3 = (RadioButton) findViewById(R.id.cuisineRB3);

    Button next = (Button) findViewById(R.id.NEXT);
*/

    //Creating the instance of PopupMenu

    //Creating menu item instances - in order for sub menu of food items - have to make xml file for sub menu or can you mak in here?
    public boolean addItemIntent = false;
    //Intent intent = new Intent(DisplayCuisineActivity.this, DisplayAmericanActivity.class);
    //Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_cuisine);
        //Intent intent = getIntent();
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
        } else if (rb2.isChecked()){
            next.setVisibility(Button.INVISIBLE);
            select.setVisibility(Button.VISIBLE);
            next.setClickable(false);
            select.setClickable(true);
            Toast.makeText(this,"You chose Chinese!", Toast.LENGTH_SHORT).show();
        }else if (rb3.isChecked()) {
            next.setVisibility(Button.INVISIBLE);
            select.setVisibility(Button.VISIBLE);
            next.setClickable(false);
            select.setClickable(true);
            Toast.makeText(this, "You chose Mexican!", Toast.LENGTH_SHORT).show();
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

        final PopupMenu popup_American = new PopupMenu(DisplayCuisineActivity.this, select);
        final PopupMenu popup_Chinese = new PopupMenu(DisplayCuisineActivity.this, select);
        final PopupMenu popup_Mexican = new PopupMenu(DisplayCuisineActivity.this, select);

        final MenuItem item_American1 = (MenuItem) findViewById(R.id.one_American);
        final MenuItem item_American2 = (MenuItem) findViewById(R.id.two_American);
        final MenuItem item_American3 = (MenuItem) findViewById(R.id.three_American);

        final MenuItem food_American1_1 = (MenuItem) findViewById(R.id.one_American_Food1);
        final MenuItem food_American1_2 = (MenuItem) findViewById(R.id.one_American_Food2);
        final MenuItem food_American1_3 = (MenuItem) findViewById(R.id.one_American_Food3);

        final SubMenu food_American = new SubMenu() {
            @Override
            public SubMenu setHeaderTitle(int titleRes) {
                return null;
            }

            @Override
            public SubMenu setHeaderTitle(CharSequence title) {
                return null;
            }

            @Override
            public SubMenu setHeaderIcon(int iconRes) {
                return null;
            }

            @Override
            public SubMenu setHeaderIcon(Drawable icon) {
                return null;
            }

            @Override
            public SubMenu setHeaderView(View view) {
                return null;
            }

            @Override
            public void clearHeader() {

            }

            @Override
            public SubMenu setIcon(int iconRes) {
                return null;
            }

            @Override
            public SubMenu setIcon(Drawable icon) {
                return null;
            }

            @Override
            public MenuItem getItem() {
                return null;
            }

            @Override
            public MenuItem add(CharSequence title) {
                return null;
            }

            @Override
            public MenuItem add(int titleRes) {
                return null;
            }

            @Override
            public MenuItem add(int groupId, int itemId, int order, CharSequence title) {
                return null;
            }

            @Override
            public MenuItem add(int groupId, int itemId, int order, int titleRes) {
                return null;
            }

            @Override
            public SubMenu addSubMenu(CharSequence title) {
                return null;
            }

            @Override
            public SubMenu addSubMenu(int titleRes) {
                return null;
            }

            @Override
            public SubMenu addSubMenu(int groupId, int itemId, int order, CharSequence title) {
                return null;
            }

            @Override
            public SubMenu addSubMenu(int groupId, int itemId, int order, int titleRes) {
                return null;
            }

            @Override
            public int addIntentOptions(int groupId, int itemId, int order, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
                return 0;
            }

            @Override
            public void removeItem(int id) {

            }

            @Override
            public void removeGroup(int groupId) {

            }

            @Override
            public void clear() {

            }

            @Override
            public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {

            }

            @Override
            public void setGroupVisible(int group, boolean visible) {

            }

            @Override
            public void setGroupEnabled(int group, boolean enabled) {

            }

            @Override
            public boolean hasVisibleItems() {
                return false;
            }

            @Override
            public MenuItem findItem(int id) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public MenuItem getItem(int index) {
                return null;
            }

            @Override
            public void close() {

            }

            @Override
            public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
                return false;
            }

            @Override
            public boolean isShortcutKey(int keyCode, KeyEvent event) {
                return false;
            }

            @Override
            public boolean performIdentifierAction(int id, int flags) {
                return false;
            }

            @Override
            public void setQwertyMode(boolean isQwerty) {

            }
        };
        if (rb1.isChecked()) {
            //Intent intent = new Intent(this, DisplayAmericanActivity.class); // Intent - class object instance of class (Intent)- constructor takes two arguments (Context - this - for everything in the current Activity <Main>, Class - DisplayMessageActivity.class - encapsulates calling a class (a Different Activity)
            //startActivity(intent); // in-house method, starts new Activity, taking the Intent as an argument(starts instance of DisplayMessageActivity class)

            //Inflating the Popup using xml file
            popup_American.getMenuInflater().inflate(R.menu.menu_american, popup_American.getMenu());

            //registering popup with OnMenuItemClickListener
            popup_American.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem item) {
                    //Make Toast Message upon clicking Menu item
                    Toast.makeText(DisplayCuisineActivity.this,"You chose " + item.getTitle(),Toast.LENGTH_SHORT).show();
                    //Save first(restaurant) and second(food) item checkIndexes into an intent(putExtra, go to next Activity(customer?) to carry over intent
                    if(addItemIntent == false)
                    {
                        //Intent intentPopup = new Intent(DisplayCuisineActivity.this, DisplayAmericanActivity.class);
                        MenuItem item1 = item;
                        //intentPopup.putExtra("restaurant_American", item1.getIntent());
                        //intent.putExtra("restaurant_American", item1.getIntent());
                        //intent.putExtras(intentPopup);
                        Toast.makeText(DisplayCuisineActivity.this,"Added chosen Restaurant to Intent - addSECONDIntent is " + addItemIntent + " and item1 is " + item1.getTitle(),Toast.LENGTH_SHORT).show();
                        addItemIntent = true;
                        //Toast.makeText(DisplayCuisineActivity.this,intentPopup.getCharSequenceExtra("restaurant_American"),Toast.LENGTH_SHORT).show();
                    }
                    else if (addItemIntent == true){
                        //Intent intentPopup = new Intent(DisplayCuisineActivity.this, DisplayAmericanActivity.class);
                        MenuItem item2 = item;
                        //intentPopup.putExtra("food_American", item2.getIntent());
                        //intent.putExtra("food_American", item2.getIntent());
                        //intent.putExtras(intentPopup);
                        Toast.makeText(DisplayCuisineActivity.this,"Added chosen Restaurant to Intent - SECONDIntent added is " + addItemIntent + " and item2 is " + item2.getTitle(),Toast.LENGTH_SHORT).show();
                        addItemIntent = false;
                        next.setVisibility(Button.VISIBLE);
                        next.setClickable(true);
                    }

                    //subMenu(food_American, item_American1, item_American2, item_American3);
                    /*if(item_American1.isChecked())
                    {
                        //Submenu item arguments - (int) groupID, itemID, orderID, char or string itemTitle
                        food_American.add(1,0,1,"One");
                        food_American.add(1,1,2,"Two");
                        food_American.add(1,2,3,"Three");
                        if(food_American.getItem(1).isChecked())
                        {
                            Intent intent = new Intent(getBaseContext(),DisplayAmericanActivity.class); // Intent - class object instance of class (Intent)- constructor takes two arguments (Context - this - for everything in the current Activity <Main>, Class - DisplayMessageActivity.class - encapsulates calling a class (a Different Activity)
                            startActivity(intent);
                        }

                    }
                    else if(item_American2.isChecked())
                    {

                    }
                    else if(item_American3.isChecked())
                    {

                    }*/
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
                    //Save first(restaurant) and second(food) item checkIndexes into an intent(putExtra, go to next Activity(customer?) to carry over intent
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
                    return true;
                }
            });
            popup_Mexican.show();
        }
    }

    public void Customer (View view) {
        //startActivity(intent); // in-house method, starts new Activity, taking the Intent as an argument(starts instance of DisplayMessageActivity class)
    }
    /*public void intentExtras (View view) {

    }*/

    /*public void subMenu (SubMenu submenu, MenuItem item1, MenuItem item2, MenuItem item3)
    {
        submenu.add(1,0,1,"One");
        submenu.add(1,1,2,"Two");
        submenu.add(1,2,3,"Three");
        if(item1.isChecked())
        {
            submenu.getItem(0);
            submenu.getItem(1);
            submenu.getItem(2);
            submenu.getItem(3);

        }
    }*/

    /*cuisineRG.OnCheckedChangeListener = new RadioGroup.OnCheckedChangeListener();
    {
        public void onCheckedChanged (RadioGroup, int checkedId)
        {
            RadioButton rb1 = (RadioButton) findViewById(R.id.cuisineRB1);
            RadioButton rb2 = (RadioButton) findViewById(R.id.cuisineRB2);
            RadioButton rb3 = (RadioButton) findViewById(R.id.cuisineRB3);
            RadioButton rb4 = (RadioButton) findViewById(R.id.cuisineRB4);
            RadioButton rb5 = (RadioButton) findViewById(R.id.cuisineRB5);

            if (rb1.isChecked()) {
                Toast.makeText(this,"You chose American!", Toast.LENGTH_SHORT).show();
            } else if (rb2.isChecked()){
                Toast.makeText(this,"You chose American!", Toast.LENGTH_SHORT).show();
            }else if (rb3.isChecked()){
                Toast.makeText(this,"You chose American!", Toast.LENGTH_SHORT).show();
            }else if (rb4.isChecked()){
                Toast.makeText(this,"You chose American!", Toast.LENGTH_SHORT).show();
            }else if (rb5.isChecked()){
                Toast.makeText(this,"You chose American!", Toast.LENGTH_SHORT).show();
            }
        }
    }*/
}