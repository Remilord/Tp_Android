package com.example.imbert.arcenciel;

import android.content.Intent;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;

/**
 * Created by imbert on 3/19/18.
 */

public class Ok implements View.OnClickListener {
    private ChoixArc ca;
    private String[] color;
    private int colcount;
    private CheckBox cbr;
    private CheckBox cbo;
    private CheckBox cbj;
    private CheckBox cbv;
    private CheckBox cbb;
    private CheckBox cbi;
    private CheckBox cbvi;
    public Ok(ChoixArc choixArc,String[] c,int cc,CheckBox c1,CheckBox c2,CheckBox c3,CheckBox c4,CheckBox c5,CheckBox c6,CheckBox c7) {
    this.ca = choixArc;
        this.color = c;
        this.colcount = cc;
        cbr = c1;
        cbo = c2;
        cbj = c3;
        cbv = c4;
        cbb = c5;
        cbi = c6;
        cbvi = c7;
    }

    @Override
    public void onClick(View view) {
        if(cbr.isChecked()) {
            color[colcount] = "rouge";
            colcount++;
        }
        if(cbo.isChecked()) {
            color[colcount] = "orange";
            colcount++;
        }
        if(cbj.isChecked()) {
            color[colcount] = "jaune";
            colcount++;
        }
        if(cbv.isChecked()) {
            color[colcount] = "vert";
            colcount++;
        }
        if(cbb.isChecked()) {
            color[colcount] = "bleu";
            colcount++;
        }
        if(cbi.isChecked()) {
            color[colcount] = "indigo";
            colcount++;
        }
        if(cbvi.isChecked()) {
            color[colcount] = "violet";
            colcount++;
        }
        if(colcount == 0) {
            color[0] = "violet";
        }
        Intent newint = new Intent(this.ca,Arcenciel.class);
        newint.putExtra("colors",this.color);
        newint.putExtra("nbcolor",this.colcount);
        this.ca.setResult(1,newint);
        this.ca.finish();
    }
}
