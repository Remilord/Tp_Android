package com.example.imbert.arcenciel;

import android.content.Intent;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by imbert on 3/19/18.
 */

public class Selection implements View.OnClickListener {
    private Arcenciel arcen;

    public  Selection(Arcenciel arc) {
        this.arcen = arc;
    }
    @Override
    public void onClick(View view) {
        Intent newint = new Intent(this.arcen,ChoixArc.class);
        this.arcen.startActivityForResult(newint,1);

    }
}
