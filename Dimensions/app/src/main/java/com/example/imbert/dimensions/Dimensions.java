package com.example.imbert.dimensions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Dimensions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dimensions);
        Rectangle rectanglar = (Rectangle)findViewById(R.id.rectangle);
        TouchListener tl = new TouchListener(rectanglar,getApplicationContext());
        rectanglar.setOnTouchListener(tl);
    }
}
