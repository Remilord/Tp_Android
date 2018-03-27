package com.example.verbrugg.controleis4;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import static com.example.verbrugg.controleis4.SquareViewContener.CIRCLE_PAINT_DEFAULT_COLOR;

/**
 * Created by Nofix on 17/03/2018.
 */

public class SquareViewListener implements View.OnTouchListener {


    private SquareViewContener squareViewContener;
    private GestureDetector gestureDetector;
    public SquareViewListener(SquareViewContener squareViewContener, Activity activity){
        this.squareViewContener = squareViewContener;
        this.gestureDetector = new GestureDetector(activity.getApplicationContext(), new DoubleTapeGestureDetector(squareViewContener, activity));
        this.squareViewContener.recoverSavedColor(activity);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int x = (int)event.getX();
        int y = (int)event.getY();


        boolean isTouchingTheCircle = (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) < SquareViewContener.CIRCLE_RADIUS );
        //See https://en.m.wikipedia.org/wiki/Distance#Geometry

        if(event.getActionMasked() == MotionEvent.ACTION_DOWN){
            if( isTouchingTheCircle ){
                Log.i("TOUCH", "circle");
            } else {


                squareViewContener.setCirclePaintColor(Color.BLACK);
                //Circle becomes black
                Log.i("CIRCLE","BLACK");
                Log.i("TOUCH", "Square");
            }
        }

        if(event.getActionMasked() == MotionEvent.ACTION_UP ) {
            squareViewContener.setCirclePaintColor(Color.WHITE);
            //Circle becomes white
            Log.i("CIRCLE","WHITE");
            Log.i("TOUCH","Removed finger");
        }

        if(event.getActionMasked() == MotionEvent.ACTION_MOVE){
            Log.i("MOVING", event.getX() +" / "+event.getY());
            if(isTouchingTheCircle){
                squareViewContener.setCirclePaintColor(Color.WHITE);
                //Circle becomes white
                Log.i("CIRCLE","WHITE");
            }

        }
        if(!isTouchingTheCircle) gestureDetector.onTouchEvent(event);
        squareViewContener.invalidate();
        return true;
    }




}

