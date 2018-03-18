package com.example.imbert.dimensions;

import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by RImbert on 18/03/2018.
 */

public class DoubleDoigt extends GestureDetector.SimpleOnGestureListener {
    private Rectangle rect;
    public DoubleDoigt(Rectangle r) {
        this.rect = r;
    }
    @Override
    public boolean onDoubleTap(MotionEvent e) {
        this.rect.changeColor();
        this.rect.invalidate();
        return true;
    }
    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
        return true;
    }
}
