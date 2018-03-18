package sppfarmco.reticule;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by RImbert on 18/03/2018.
 */

public class ViewReticule extends View {
    private Paint orange;
    private float positionx;
    private float positiony;
    private float radius;
    public ViewReticule(Context c, AttributeSet as) {
        super(c,as);
        orange = new Paint();
        orange.setStyle(Paint.Style.STROKE);
        orange.setStrokeWidth(5.0f);
        orange.setColor(0xffff9900);
        this.positionx = 50;
        this.positiony = 50;
        this.radius = 50;
    }
    public float getPositionx() {
        return this.positionx;
    }
    public float getPositiony() {
        return this.positiony;
    }
    public void setPosition(float x,float y) {
        this.positionx = x;
        this.positiony = y;
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(positionx,positiony,radius,orange);
        canvas.drawLine(positionx-radius-10,positiony,positionx+radius+10,positiony,orange);
        canvas.drawLine(positionx,positiony-radius-10,positionx,positiony+radius+10,orange);
    }
}
