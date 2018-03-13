package com.example.imbert.fleche;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Fleche extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fleche);
        Button gauche = (Button)findViewById(R.id.gauche);
        Button droite = (Button)findViewById(R.id.droite);
        TournerFleche tf = new TournerFleche((ImageView)findViewById(R.id.fleche));
        gauche.setOnClickListener(tf);
        droite.setOnClickListener(tf);

    }
}
