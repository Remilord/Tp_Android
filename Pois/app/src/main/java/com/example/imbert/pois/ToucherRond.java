package com.example.imbert.pois;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by imbert on 2/15/18.
 */

public class ToucherRond implements View.OnTouchListener {
    private FormePois formepois;
    public ToucherRond(FormePois fp) {
        this.formepois =fp;
    }
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
    if (motionEvent.getActionMasked() == MotionEvent.ACTION_DOWN){
        int i = motionEvent.getActionIndex();
        float posx = motionEvent.getX(i);
        float posy = motionEvent.getY(i);
        this.formepois.addRond(motionEvent.getPointerId(i),posx, posy);
    }else if(motionEvent.getActionMasked() == MotionEvent.ACTION_POINTER_DOWN) {
        int i = motionEvent.getActionIndex();
        float posx = motionEvent.getX(i);
        float posy = motionEvent.getY(i);
        this.formepois.addRond(motionEvent.getPointerId(i),posx, posy);

        }else if(motionEvent.getActionMasked() == MotionEvent.ACTION_MOVE) {
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                float posx = motionEvent.getX(i);
                float posy = motionEvent.getY(i);
                this.formepois.moveRond(motionEvent.getPointerId(i),posx,posy);
            }
        }else if (motionEvent.getActionMasked() == MotionEvent.ACTION_POINTER_UP) {
        int i = motionEvent.getActionIndex();
        this.formepois.removeRond(motionEvent.getPointerId(i));
        }
        else if (motionEvent.getActionMasked() == MotionEvent.ACTION_UP){
            int i = motionEvent.getActionIndex();
            this.formepois.removeRond(motionEvent.getPointerId(i));
        }
        this.formepois.invalidate();
        return true;
    }
}
