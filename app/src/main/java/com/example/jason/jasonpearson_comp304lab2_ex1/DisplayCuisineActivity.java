package com.example.jason.jasonpearson_comp304lab2_ex1;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DisplayCuisineActivity extends AppCompatActivity {

    //RadioGroup cuisineRG = (RadioGroup) findViewById(R.id.cuisineRG);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_cuisine);
    }

    public void onRadioButtonClicked(View view) {

        Button next = (Button) findViewById(R.id.NEXT1);

        RadioButton rb1 = (RadioButton) findViewById(R.id.cuisineRB1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.cuisineRB2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.cuisineRB3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.cuisineRB4);
        RadioButton rb5 = (RadioButton) findViewById(R.id.cuisineRB5);

        // Check which radio button was clicked
        if (rb1.isChecked()) {
            next.setVisibility(Button.VISIBLE);
            Toast.makeText(this,"You chose American!", Toast.LENGTH_SHORT).show();
        } else if (rb2.isChecked()){
            next.setVisibility(Button.VISIBLE);
            Toast.makeText(this,"You chose Chinese!", Toast.LENGTH_SHORT).show();
        }else if (rb3.isChecked()){
            next.setVisibility(Button.VISIBLE);
            Toast.makeText(this,"You chose Mexican!", Toast.LENGTH_SHORT).show();
        }else if (rb4.isChecked()){
            next.setVisibility(Button.VISIBLE);
            Toast.makeText(this,"You chose Indian!", Toast.LENGTH_SHORT).show();
        }else if (rb5.isChecked()){
            next.setVisibility(Button.VISIBLE);
            Toast.makeText(this,"You chose Korean!", Toast.LENGTH_SHORT).show();
        }
    }

    public void Restaurants (View view) {

        RadioButton rb1 = (RadioButton) findViewById(R.id.cuisineRB1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.cuisineRB2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.cuisineRB3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.cuisineRB4);
        RadioButton rb5 = (RadioButton) findViewById(R.id.cuisineRB5);

        if (rb1.isChecked()) {
            Intent intent = new Intent(this, DisplayAmericanActivity.class); // Intent - class object instance of class (Intent)- constructor takes two arguments (Context - this - for everything in the current Activity <Main>, Class - DisplayMessageActivity.class - encapsulates calling a class (a Different Activity)
            startActivity(intent); // in-house method, starts new Activity, taking the Intent as an argument(starts instance of DisplayMessageActivity class)
        }else if (rb2.isChecked()){
            Intent intent = new Intent(this, DisplayChineseActivity.class); // Intent - class object instance of class (Intent)- constructor takes two arguments (Context - this - for everything in the current Activity <Main>, Class - DisplayMessageActivity.class - encapsulates calling a class (a Different Activity)
            startActivity(intent); // in-house method, starts new Activity, taking the Intent as an argument(starts instance of DisplayMessageActivity class)
        }else if (rb3.isChecked()){
            Intent intent = new Intent(this, DisplayMexicanActivity.class); // Intent - class object instance of class (Intent)- constructor takes two arguments (Context - this - for everything in the current Activity <Main>, Class - DisplayMessageActivity.class - encapsulates calling a class (a Different Activity)
            startActivity(intent); // in-house method, starts new Activity, taking the Intent as an argument(starts instance of DisplayMessageActivity class)
        }else if (rb4.isChecked()){
            Intent intent = new Intent(this, DisplayIndianActivity.class); // Intent - class object instance of class (Intent)- constructor takes two arguments (Context - this - for everything in the current Activity <Main>, Class - DisplayMessageActivity.class - encapsulates calling a class (a Different Activity)
            startActivity(intent); // in-house method, starts new Activity, taking the Intent as an argument(starts instance of DisplayMessageActivity class)
        }else if (rb5.isChecked()){
            Intent intent = new Intent(this, DisplayKoreanActivity.class); // Intent - class object instance of class (Intent)- constructor takes two arguments (Context - this - for everything in the current Activity <Main>, Class - DisplayMessageActivity.class - encapsulates calling a class (a Different Activity)
            startActivity(intent); // in-house method, starts new Activity, taking the Intent as an argument(starts instance of DisplayMessageActivity class)
        }
    }
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
