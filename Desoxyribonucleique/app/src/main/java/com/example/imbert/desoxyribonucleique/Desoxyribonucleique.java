package com.example.imbert.desoxyribonucleique;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;

public class Desoxyribonucleique extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desoxyribonucleique);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String colorselected = preferences.getString("couleurschoice","Vert");
        TableLayout mainlayout = (TableLayout)findViewById(R.id.main_layout);
        mainlayout.setBackgroundColor(Color.parseColor(colorselected));
        Button ba = (Button)findViewById(R.id.atoma);
        Button bt = (Button)findViewById(R.id.atomt);
        Button bc = (Button)findViewById(R.id.atomc);
        Button bg = (Button)findViewById(R.id.atomg);
        TextView edt = (TextView)findViewById(R.id.textresult);
        AddTextFromButton addtext = new AddTextFromButton(edt);
        if(preferences.getBoolean("disabla",false)) {
            ba.setClickable(false);
        }else {
            ba.setOnClickListener(addtext);
        }
        if(preferences.getBoolean("disablt",false)) {
            bt.setClickable(false);
        }else {
            bt.setOnClickListener(addtext);
        }
        if(preferences.getBoolean("disablc",false)) {
            bc.setClickable(false);
        }else{
            bc.setOnClickListener(addtext);
        }
        if(preferences.getBoolean("disablg",false)) {
            bg.setClickable(false);
        }else {
            bg.setOnClickListener(addtext);
        }
    }
}
