package com.example.imbert.dimensions;

import android.view.ScaleGestureDetector;

/**
 * Created by imbert on 3/12/18.
 */

public class Pinchette implements ScaleGestureDetector.OnScaleGestureListener {
    private Rectangle re;
    private float xinitial;
    private float yinitial;
    private float percentx;
    private float percenty;
    public Pinchette(Rectangle r) {
        this.re = r;
    }
    @Override
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.percentx = scaleGestureDetector.getCurrentSpanX() / this.xinitial;
        this.percenty = scaleGestureDetector.getCurrentSpanY() / this.yinitial;
        this.re.rescaleRectangle(percentx,percenty);
        this.re.invalidate();
        return false;
    }

    @Override
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.xinitial = scaleGestureDetector.getCurrentSpanX();
        this.yinitial = scaleGestureDetector.getCurrentSpanY();
        return true;
    }

    @Override
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {

    }
}
