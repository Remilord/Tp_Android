package com.example.imbert.grille;

import android.text.method.Touch;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by imbert on 3/5/18.
 */

public class TouchListener implements View.OnTouchListener {
    private GestureDetector geste;
    private TextView textview;
    public TouchListener(TextView tv) {
        this.textview = tv;
        GesteDetect gd = new GesteDetect(this.textview);
        this.geste = new GestureDetector(gd);
    }
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.geste.onTouchEvent(motionEvent);
        return true;
    }
}
