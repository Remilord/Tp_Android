package com.example.imbert.choixevent;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
    private int idchecked;
    public Forme(Context c, AttributeSet as) {
        super(c,as);
        ff = new Paint();
        ff.setColor(Color.RED);
        idchecked = R.id.carre;
    }
    public void setIdChecked(int ic) {
       this.idchecked = ic;
        this.invalidate();
    }
    @Override
    public void onDraw(Canvas canvas) {
        if(this.idchecked == R.id.carre) {
            canvas.drawRect(new Rect(100,100,150,150),ff);
        }else if(this.idchecked == R.id.rond) {
            canvas.drawOval(new RectF(100,100,150,150),ff);
        }else if(this.idchecked == R.id.triangle) {


        }else if(this.idchecked == R.id.croix) {
            canvas.drawLine(0.0F,0.0F,100.0F,100.0F,ff);
            canvas.drawLine(0.0F,100.0F,100.0F,0.0F,ff);
        }else {
            canvas.drawRect(new Rect(100,100,150,150),ff);
        }
    }
}
