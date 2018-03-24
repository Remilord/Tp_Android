package com.example.imbert.arcenciel;

import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by imbert on 3/19/18.
 */

public class ChangeColorTouch implements View.OnClickListener {
    private String[] colors;
    private int nbcolor;
    private int compteur;
    private RelativeLayout relativeLayout;
    private Arcenciel arcenciel;
    public ChangeColorTouch(String[] c, int nc, RelativeLayout rl,Arcenciel arc) {
        this.colors = c;
        this.nbcolor = nc;
        this.relativeLayout = rl;
        this.compteur =0;
        this.arcenciel = arc;
    }
    public void setParams(String[] c,int nbc) {
        this.colors = c;
        this.nbcolor = nbc;
        this.compteur=0;
    }
    @Override
    public void onClick(View view) {
        if(nbcolor ==0) {
            relativeLayout.setBackgroundColor(arcenciel.getResources().getColor(arcenciel.getResources().getIdentifier(colors[0], "color", arcenciel.getPackageName())));
        }
        if(compteur == nbcolor ) {
            compteur=0;
        }
        relativeLayout.setBackgroundColor(arcenciel.getResources().getColor(arcenciel.getResources().getIdentifier(colors[compteur], "color", arcenciel.getPackageName())));
        if(nbcolor !=0) {
            compteur++;
        }
    }
}
