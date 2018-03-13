package com.example.imbert.pois;

import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

/**
 * Created by imbert on 2/15/18.
 */

public class Rond {
    private float posX;
    private float posY;
    private int index;
    private Paint color;
    public Rond(int ind,float x,float y) {
        posX = x;
        posY =y;
        this.index = ind;
        Random rand = new Random();
        this.color = new Paint();
        this.color.setARGB(255,rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
    }

    public void setPosX(float x) {
        this.posX = x;
    }
    public void setPosY(float y) {
        this.posY = y;
    }
    public float getPosX() {
        return this.posX;
    }
    public float getPosY() {
        return this.posY;
    }
    public Paint getPaint(){
        return this.color;
    }
    public int getIndex() {
        return this.index;
    }
}
