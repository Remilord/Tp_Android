package com.example.imbert.dimensions;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by imbert on 3/8/18.
 */

public class Rectangle extends View {
    private Paint bleu;
    private Paint gris;
    private Paint current;
    private Paint red;
    private Rect rect;
    private Path pathw;
    private Path pathe;
    private Path patht;
    private Path pathb;
    private int basex;
    private int basey;
    private int basexx;
    private int baseyy;
    private int basexmodified;
    private int basexxmodified;
    private int baseymodified;
    private int baseyymodified;
    public Rectangle(Context c, AttributeSet as) {
    super(c,as);
        bleu = new Paint();
        gris = new Paint();
        red = new Paint();
        current = new Paint();
        bleu.setColor(Color.CYAN);
        gris.setColor(Color.GRAY);
        red.setColor(Color.RED);
        current = bleu;
        this.basex = 350;
        this.basey = 400;
        this.basexx = 400;
        this.baseyy = 550;
        this.basexmodified = 0;
        this.basexxmodified = 0;
        this.baseymodified = 0;
        this.baseyymodified = 0;
        rect = new Rect((int)basex,(int)basey,(int)basexx,(int)baseyy);
        Point pointw1 = new Point(basex,basey);
        Point pointw2 = new Point(basex-50,baseyy-(baseyy-basey)/2);
        Point pointw3 = new Point(basex,baseyy);
        Point pointe1 = new Point(basexx,basey);
        Point pointe2 = new Point(basexx+50,baseyy-(baseyy-basey)/2);
        Point pointe3 = new Point(basexx,baseyy);
        Point pointt1 = new Point(basex,basey);
        Point pointt2 = new Point(basex+((basexx - basex)/2),basey-50);
        Point pointt3 = new Point(basexx,basey);
        Point pointb1 = new Point(basex,baseyy);
        Point pointb2 = new Point(basex+((basexx - basex)/2),baseyy+50);
        Point pointb3 =new Point(basexx,baseyy);
        pathw = new Path();
        pathw.moveTo(pointw1.x, pointw1.y);
        pathw.lineTo(pointw2.x, pointw2.y);
        pathw.lineTo(pointw3.x, pointw3.y);
        pathw.lineTo(pointw1.x, pointw1.y);
        pathw.close();

        pathe = new Path();
        pathe.moveTo(pointe1.x, pointe1.y);
        pathe.lineTo(pointe2.x, pointe2.y);
        pathe.lineTo(pointe3.x, pointe3.y);
        pathe.lineTo(pointe1.x, pointe1.y);
        pathe.close();

        patht = new Path();
        patht.moveTo(pointt1.x, pointt1.y);
        patht.lineTo(pointt2.x, pointt2.y);
        patht.lineTo(pointt3.x, pointt3.y);
        patht.lineTo(pointt1.x, pointt1.y);
        patht.close();

        pathb = new Path();
        pathb.moveTo(pointb1.x, pointb1.y);
        pathb.lineTo(pointb2.x, pointb2.y);
        pathb.lineTo(pointb3.x, pointb3.y);
        pathb.lineTo(pointb1.x, pointb1.y);
        pathb.close();


    }

    public void rescaleRectangle(float percentx,float percenty) {
        this.basexmodified = (int)(basex-50*percentx);
        this.baseymodified = (int)(basey-50*percenty);
        this.basexxmodified = (int)(basexx+50*percentx);
        this.baseyymodified = (int)(baseyy+50*percenty);
        rect = new Rect(basexmodified,baseymodified,basexxmodified,baseyymodified);
        Point pointw1 = new Point(basexmodified,baseymodified);
        Point pointw2 = new Point(basexmodified-50,baseyymodified-(baseyymodified-baseymodified)/2);
        Point pointw3 = new Point(basexmodified,baseyymodified);
        Point pointe1 = new Point(basexxmodified,baseymodified);
        Point pointe2 = new Point(basexxmodified+50,baseyymodified-(baseyymodified-baseymodified)/2);
        Point pointe3 = new Point(basexxmodified,baseyymodified);
        Point pointt1 = new Point(basexmodified,baseymodified);
        Point pointt2 = new Point(basexmodified+((basexxmodified - basexmodified)/2),baseymodified-50);
        Point pointt3 = new Point(basexxmodified,baseymodified);
        Point pointb1 = new Point(basexmodified,baseyymodified);
        Point pointb2 = new Point(basexmodified+((basexxmodified - basexmodified)/2),baseyymodified+50);
        Point pointb3 =new Point(basexxmodified,baseyymodified);
        pathw = new Path();
        pathw.moveTo(pointw1.x, pointw1.y);
        pathw.lineTo(pointw2.x, pointw2.y);
        pathw.lineTo(pointw3.x, pointw3.y);
        pathw.lineTo(pointw1.x, pointw1.y);
        pathw.close();

        pathe = new Path();
        pathe.moveTo(pointe1.x, pointe1.y);
        pathe.lineTo(pointe2.x, pointe2.y);
        pathe.lineTo(pointe3.x, pointe3.y);
        pathe.lineTo(pointe1.x, pointe1.y);
        pathe.close();

        patht = new Path();
        patht.moveTo(pointt1.x, pointt1.y);
        patht.lineTo(pointt2.x, pointt2.y);
        patht.lineTo(pointt3.x, pointt3.y);
        patht.lineTo(pointt1.x, pointt1.y);
        patht.close();

        pathb = new Path();
        pathb.moveTo(pointb1.x, pointb1.y);
        pathb.lineTo(pointb2.x, pointb2.y);
        pathb.lineTo(pointb3.x, pointb3.y);
        pathb.lineTo(pointb1.x, pointb1.y);
        pathb.close();
    }
    public void changeColor() {
    if(this.current == this.red) {
        this.current=this.bleu;
    }else {
        this.current = this.red;
    }
    }
    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawRect(this.rect,this.current);
        canvas.drawPath(pathw,gris);
        canvas.drawPath(pathe,gris);
        canvas.drawPath(patht,gris);
        canvas.drawPath(pathb,gris);
    }

}
