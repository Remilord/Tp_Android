package com.example.imbert.grille;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Grille extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grille);
        for(int i = 1;i<=9;i++) {

            TextView textview = (TextView)findViewById(getResources().getIdentifier("id"+i,"id",this.getPackageName()));
            TouchListener tl = new TouchListener(textview);
            textview.setOnTouchListener(tl);
        }
    }

}
