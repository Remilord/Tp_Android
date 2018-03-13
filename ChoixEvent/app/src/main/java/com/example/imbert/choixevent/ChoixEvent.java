package com.example.imbert.choixevent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class ChoixEvent extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_event);
        RadioGroup rg = (RadioGroup)findViewById(R.id.layoutbutton);
        ChoixChangeListener ccl = new ChoixChangeListener(((Forme)findViewById(R.id.formo)));
        rg.setOnCheckedChangeListener(ccl);
    }
}
