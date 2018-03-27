package sppfarmco.controleas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by RImbert on 27/03/2018.
 */

public class Decorationb extends View {
    private Paint gris;
    private Paint rose;
    private int actualposition;
    private int[] positionpossible;
    private boolean audess;
    public Decorationb(Context context, AttributeSet attrs) {
        super(context, attrs);
         gris = new Paint();
        gris.setColor(getResources().getColor(R.color.gris));
        gris.setStrokeWidth(10);
        gris.setStrokeCap(Paint.Cap.ROUND);
         rose = new Paint();
        rose.setColor(getResources().getColor(R.color.rose));
        actualposition = 0;
        positionpossible = new int[]{0, 30, 60, 90, 120, 150, 180, 210, 240, 270};
        audess = false;
    }
    public void moveRondByTouch(int x) {
        for(int i = 0;i<positionpossible.length-1;i++) {
            if( x >= positionpossible[i] && x <= positionpossible[i+1]) {
                    this.actualposition = positionpossible[i];
            }
        }
    }
    public int getActualposition() {
        return this.actualposition;
    }
    public void moveRond() {
        if(this.actualposition < 270) {
            this.actualposition = this.actualposition + 30;
        }
    }
    public void moveRondLeft() {
        if(this.actualposition > 0) {
            this.actualposition = this.actualposition - 30;
        }
    }
    public void auDessus(boolean b) {
        audess = b;
    }
    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(audess) {
            canvas.drawLine(50, 50, 330, 50, gris);
            canvas.drawCircle(50 + actualposition, 50, 20, rose);
        }else {
            canvas.drawCircle(50 + actualposition, 50, 20, rose);
            canvas.drawLine(50, 50, 330, 50, gris);
        }
    }

}
