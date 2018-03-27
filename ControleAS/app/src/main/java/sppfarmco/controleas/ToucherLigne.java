package sppfarmco.controleas;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by RImbert on 27/03/2018.
 */

public class ToucherLigne implements View.OnTouchListener {
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Decorationb decob = (Decorationb)view;
        decob.moveRondByTouch((int)motionEvent.getX());
        decob.invalidate();
        return true;
    }
}
