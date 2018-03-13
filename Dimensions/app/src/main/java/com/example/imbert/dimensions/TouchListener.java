package com.example.imbert.dimensions;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.TextView;

/**
 * Created by imbert on 3/12/18.
 */

public class TouchListener implements View.OnTouchListener {
    private ScaleGestureDetector geste;
    private Rectangle re;
    public TouchListener(Rectangle r, Context c) {
        this.re = r;
        Pinchette sgd = new Pinchette(re);
        this.geste = new ScaleGestureDetector(c,sgd);
    }
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.geste.onTouchEvent(motionEvent);
        return true;
    }
}
