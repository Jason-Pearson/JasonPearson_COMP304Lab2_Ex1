package com.example.jason.jasonpearson_comp304lab2_ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuView;
import android.view.Menu;
import android.view.MenuItem;

import org.w3c.dom.Text;

public class DisplayAmericanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_american);
    }

    protected boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menuamerican, menu);
        return true;
    }
}
