package com.example.imbert.gribouillage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by imbert on 2/1/18.
 */

public class Gribouille extends View {
    private Paint bleu;
    private Paint violet;
    private Paint dessin;
    private Paint black;
    private CharSequence seq;
    private Rect r;
    private int start;
    private int numberofchar;
    public Gribouille(Context c,AttributeSet as) {
        super(c,as);
    bleu = new Paint();
        dessin = new Paint();
        bleu.setColor(Color.BLUE);
        violet = new Paint();
        violet.setColor(Color.MAGENTA);
        violet.setStyle(Paint.Style.STROKE);
        violet.setStrokeWidth(5.0F);
        black = new Paint();
        black.setColor(Color.WHITE);
        black.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
        black.setTextAlign(Paint.Align.CENTER);
        seq=c.getResources().getText(R.string.test);
        this.r = new Rect(110,160,300,200);
       this.numberofchar = black.breakText(seq.toString(),true,r.width(),null);
        this.start = (seq.toString().length() - numberofchar)/2;
    }
    @Override
    public void onDraw(Canvas canvas) {

        Bitmap b= BitmapFactory.decodeResource(getResources(), R.drawable.cercles);
        canvas.drawBitmap(b,0,0,dessin);
        canvas.drawRect(r,bleu);
        canvas.drawCircle(110.0F,300.0F,50.0F,violet);
        canvas.drawText(seq.toString(),this.start,this.start+this.numberofchar,r.exactCenterX(),r.exactCenterY(),black);
    }
}
