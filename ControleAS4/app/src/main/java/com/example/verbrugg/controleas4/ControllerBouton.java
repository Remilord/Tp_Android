package com.example.verbrugg.controleas4;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by verbrugg on 3/26/18.
 */

public class ControllerBouton implements View.OnClickListener {

    private ImageButton bouton_droite;
    private ImageButton bouton_gauche;
    private Vue vue;

    public ControllerBouton(ImageButton b1, ImageButton b2, Vue v) {
        this.bouton_droite=b1;
        this.bouton_gauche=b2;
        this.vue=v;
    }

    public void onClick(View v) {
        int pos = this.vue.getPosRond();
        if (v.getId() ==  this.bouton_droite.getId()) {
            if (pos<9) {
                this.vue.setPosRond(pos+1);
            }
        }
        if (v.getId() ==  this.bouton_gauche.getId()) {
            if (pos>0) {
                this.vue.setPosRond(pos-1);
            }
        }
        this.vue.invalidate();
    }
}
