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
    public Decorationb(Context context, AttributeSet attrs) {
        super(context, attrs);
         gris = new Paint();
        gris.setColor(getResources().getColor(R.color.gris));
        gris.setStrokeWidth(10);
        gris.setStrokeCap(Paint.Cap.ROUND);
         rose = new Paint();
        rose.setColor(getResources().getColor(R.color.rose));
        actualposition = 0;
    }
    public void moveRond() {
        if(this.actualposition < 350) {
            this.actualposition = this.actualposition + 30;
        }
    }
    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(50,50,350,50,gris);
        canvas.drawCircle(50+actualposition,50,20,rose);
    }

}
