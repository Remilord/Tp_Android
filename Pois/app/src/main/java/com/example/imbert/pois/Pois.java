package com.example.imbert.pois;

import android.app.Activity;
import android.os.Bundle;

public class Pois extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pois);
        FormePois viewpois = (FormePois)findViewById(R.id.poiss);
        ToucherRond otl = new ToucherRond(viewpois);
        viewpois.setOnTouchListener(otl);
    }
}
