package com.example.verbrugg.controleas4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by verbrugg on 3/26/18.
 */

public class Vue extends View {

    public Paint p;
    public Paint p2;
    public int pos_rond;
    public float width;
    public float height;
    public float taille_cercle;
    public float coordLigne[] = new float[3];
    public float cercleX;
    public float cercleY;
    private boolean estEnDessous;
    public float[] tab_coordonneX = new float[10];


    public Vue(Context c, AttributeSet as) {

        super(c,as);
        this.estEnDessous=true;
        this.p = new Paint();
        this.p2 = new Paint();
        this.pos_rond=5;

        this.setBackgroundColor(0xFF3A3232);

        this.p.setARGB(255,227,79,248);
        this.p2.setARGB(255,112,104,113);
        this.p2.setStrokeWidth(10);


    }

    public void initLigne() {
        this.coordLigne[0]=10;
        this.coordLigne[1]=this.width-10;
        this.coordLigne[2]=(this.height/2);
    }

    public void initCercle() {

        float taille_ligne= this.width-20;
        this.taille_cercle=taille_ligne/11;

        float taille=this.taille_cercle;
        for (int i=0; i<10; i++) {
            tab_coordonneX[i]=taille;
            taille+=this.taille_cercle;
        }
    }

    public int getPosRond() {
        return this.pos_rond;
    }

    public void setPosRond(int p) {
        this.pos_rond=p;
    }

    public float getPosRondY() {
        return this.cercleY;
    }

    public float getPosRondX() {
        return this.cercleX;
    }

    public float[] getCoordonneeX() {
        return tab_coordonneX;
    }

    public void setBool (boolean b) {
        this.estEnDessous=b;
    }

    @Override
    public void onDraw(Canvas c) {

        this.width=this.getWidth();
        this.height=this.getHeight();
        this.cercleY=this.height/2;
        this.initLigne();
        this.initCercle();
        this.cercleX=tab_coordonneX[this.pos_rond];
        if (estEnDessous) {
            c.drawCircle(this.cercleX, this.cercleY, 50, this.p);
            c.drawLine(this.coordLigne[0], this.coordLigne[2], this.coordLigne[1], this.coordLigne[2], this.p2);
        } else {
            c.drawLine(this.coordLigne[0], this.coordLigne[2], this.coordLigne[1], this.coordLigne[2], this.p2);
            c.drawCircle(this.cercleX, this.cercleY, 50, this.p);
        }
    }


}
