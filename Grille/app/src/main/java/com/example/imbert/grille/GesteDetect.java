package com.example.imbert.grille;

import android.graphics.Color;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by imbert on 3/5/18.
 */

public class GesteDetect implements GestureDetector.OnGestureListener {
    private TextView textview;
    public GesteDetect(TextView tv) {
        this.textview = tv;
    }
    @Override
    public boolean onDown(MotionEvent motionEvent) {
        this.textview.setBackgroundColor(Color.BLUE);
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.textview.setBackgroundColor(Color.BLUE);
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        this.textview.setBackgroundColor(Color.RED);
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        this.textview.setBackgroundColor(Color.YELLOW);
        return true;
    }
}
