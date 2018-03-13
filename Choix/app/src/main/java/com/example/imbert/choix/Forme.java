package com.example.imbert.choix;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioGroup;

/**
 * Created by imbert on 2/5/18.
 */

public class Forme extends View {
    private Paint ff;
    private RadioGroup radiog;
    public Forme(Context c, AttributeSet as) {
        super(c,as);
        ff = new Paint();
        ff.setColor(Color.RED);
    }
    public void setRadioGroup(RadioGroup rg) {
            this.radiog = rg;
    }
    @Override
    public void onDraw(Canvas canvas) {

           int checkedidbutton = this.radiog.getCheckedRadioButtonId();
            if(checkedidbutton == R.id.carre) {
                canvas.drawRect(new Rect(100,100,150,150),ff);
            }else if(checkedidbutton == R.id.rond) {
                canvas.drawOval(new RectF(100,100,150,150),ff);
            }else if(checkedidbutton == R.id.triangle) {


            }else if(checkedidbutton == R.id.croix) {
                canvas.drawLine(0.0F,0.0F,100.0F,100.0F,ff);
                canvas.drawLine(0.0F,100.0F,100.0F,0.0F,ff);
            }else {
                canvas.drawRect(new Rect(100,100,150,150),ff);
            }
    }
}
