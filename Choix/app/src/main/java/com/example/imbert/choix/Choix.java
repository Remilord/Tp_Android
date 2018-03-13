package com.example.imbert.choix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Choix extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix);
        RadioGroup rg = (RadioGroup)findViewById(R.id.layoutbutton);
       Forme f = (Forme)findViewById(R.id.formo);
        f.setRadioGroup(rg);
    }
}