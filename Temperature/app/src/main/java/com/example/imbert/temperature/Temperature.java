package com.example.imbert.temperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Temperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        EditText celcus = (EditText)findViewById(R.id.celcus);
        EditText fahrenheit = (EditText) findViewById(R.id.fahrenheit);
        ConvertisseurCtoF convertisseurcf = new ConvertisseurCtoF(celcus,fahrenheit);
        ConvertisseurFtoC convertisseurfc = new ConvertisseurFtoC(celcus,fahrenheit);
        ClickToRemoveCtoF removeCtoF = new ClickToRemoveCtoF(fahrenheit,convertisseurfc,convertisseurcf);
        ClickToRemoveFtoC removeFtoC = new ClickToRemoveFtoC(celcus,convertisseurcf,convertisseurfc);
       celcus.setOnFocusChangeListener(removeCtoF);
       fahrenheit.setOnFocusChangeListener(removeFtoC);
    }
}
