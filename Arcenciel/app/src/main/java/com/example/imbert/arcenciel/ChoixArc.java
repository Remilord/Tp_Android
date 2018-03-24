package com.example.imbert.arcenciel;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class ChoixArc extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_arc);

        String[] colors = new String[9];
        int colorcount = 0;
        Button ok = (Button)findViewById(R.id.ok);
        CheckBox cbr = (CheckBox)findViewById(R.id.r);
        CheckBox cbo = (CheckBox)findViewById(R.id.o);
        CheckBox cbj = (CheckBox)findViewById(R.id.j);
        CheckBox cbv = (CheckBox)findViewById(R.id.v);
        CheckBox cbb = (CheckBox)findViewById(R.id.b);
        CheckBox cbi = (CheckBox)findViewById(R.id.i);
        CheckBox cbvi = (CheckBox)findViewById(R.id.vi);

        Ok kk = new Ok(this,colors,colorcount,cbr,cbo,cbj,cbv,cbb,cbi,cbvi);
        ok.setOnClickListener(kk);
    }
}
