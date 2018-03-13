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
    private Rect rect;
    private Path pathw;
    private Path pathe;
    private Path patht;
    private Path pathb;
    private float basex;
    private float basey;
    private float basexx;
    private float baseyy;
    public Rectangle(Context c, AttributeSet as) {
    super(c,as);
        bleu = new Paint();
        gris = new Paint();
        bleu.setColor(Color.BLUE);
        gris.setColor(Color.GRAY);
        this.basex = 100;
        this.basey = 100;
        this.basexx = 150;
        this.baseyy = 150;
        rect = new Rect((int)basex,(int)basey,(int)basexx,(int)baseyy);
        Point pointw1 = new Point(100,100);
        Point pointw2 = new Point(50,125);;
        Point pointw3 = new Point(100,150);
        Point pointe1 = new Point(150,100);
        Point pointe2 = new Point(200,125);
        Point pointe3 = new Point(150,150);
        Point pointt1 = new Point(100,100);
        Point pointt2 = new Point(125,50);
        Point pointt3 = new Point(150,100);
        Point pointb1 = new Point(100,150);
        Point pointb2 = new Point(125,200);
        Point pointb3 =new Point(150,150);
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
    this.basex = this.basex * percentx;
        this.basexx = this.basexx * percentx;
        this.basey = this.basey * percentx;
        this.baseyy = this.baseyy * percentx;
        rect = new Rect((int)basex,(int)basey,(int)basexx,(int)baseyy);
    }
    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawRect(this.rect,this.bleu);
        canvas.drawPath(pathw,gris);
        canvas.drawPath(pathe,gris);
        canvas.drawPath(patht,gris);
        canvas.drawPath(pathb,gris);
    }

}
