package com.example.imbert.pois;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Range;
import android.view.View;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by imbert on 2/15/18.
 */

public class FormePois extends View {
    private Paint bleu;
    private Paint violet;
    private Paint vert;
    private Paint current;
    private int posx;
    private int posy;
    private Random rand;
    private ArrayList<Rond> liste_rond;
    public FormePois(Context c, AttributeSet as) {
        super(c,as);
        current = new Paint();
        this.posx=0;
        this.posy=0;
        rand = new Random();
        liste_rond = new ArrayList<>();
    }
    public void addRond(int i, float x,float y) {
        this.liste_rond.add(new Rond(i,x,y));
    }
    public void moveRond(int i,float x,float y) {
        int vraindex = 0;
        for(int o = 0;o<liste_rond.size();o++) {
            if(liste_rond.get(o).getIndex() == i) {
                vraindex = i;
            }
        }
        if(this.liste_rond.size() != 0) {
            this.liste_rond.get(vraindex).setPosX(x);
            this.liste_rond.get(vraindex).setPosY(y);
        }
    }
    public void removeRond(int i) {
        int vraindex = 0;
        for(int p = 0; p< liste_rond.size();p++) {
            if(this.liste_rond.get(p).getIndex() == i) {
                vraindex = p;
            }
        }
        this.liste_rond.remove(vraindex);
    }
    @Override
    public void onDraw(Canvas canvas) {
        for(int i =0; i< liste_rond.size();i++) {
            canvas.drawCircle(liste_rond.get(i).getPosX(), liste_rond.get(i).getPosY(), 25.0F, liste_rond.get(i).getPaint());
        }
    }

}
