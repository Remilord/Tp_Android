package com.example.verbrugg.controleas4;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by verbrugg on 3/26/18.
 */

public class ControllerVue implements View.OnTouchListener {

    private Vue vue;

    public ControllerVue(Vue v) {
        this.vue=v;
    }

    public int trouveBonnePosition(float x) {
        int position=0;
        float distance_actuel=10000;
        float nouvelle_distance=0;
        float tab[] = vue.getCoordonneeX();
        for (int i=0; i<10; i++) {
            nouvelle_distance=Math.abs(tab[i]-x);
            if (nouvelle_distance<distance_actuel) {
                distance_actuel=nouvelle_distance;
                position=i;
            }
        }
        return position;
    }


    public boolean onTouch(View v, MotionEvent e) {
        float y=this.vue.getPosRondY();
        int position=0;
        if (e.getY() <= y+25 && e.getY() >= y-25) {
            position=trouveBonnePosition(e.getX());
            this.vue.setPosRond(position);
        }
        this.vue.invalidate();
        return true;
    }

}
