package sppfarmco.reticule;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by RImbert on 18/03/2018.
 */

public class DeplacerReticule implements View.OnTouchListener {
    private ViewReticule viewreticule;
    public DeplacerReticule(ViewReticule vr) {
        this.viewreticule = vr;
    }
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
       this.viewreticule.setPosition(motionEvent.getRawX(),motionEvent.getY());
        this.viewreticule.invalidate();
        return true;
    }
}
