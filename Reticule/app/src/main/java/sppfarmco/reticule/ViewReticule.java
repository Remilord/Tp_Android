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
    private int positionactuellex;
    private int positionactuelley;
    private int newpositionx;
    private int newpositiony;
    private float radius;
    public ViewReticule(Context c, AttributeSet as) {
        super(c,as);
        orange = new Paint();
        orange.setStyle(Paint.Style.STROKE);
        orange.setStrokeWidth(5.0f);
        orange.setColor(0xffff9900);
        this.positionactuellex = 50;
        this.positionactuelley = 50;
        this.radius = 50;
    }
    public int getPositionx() {
        return this.positionactuellex;
    }
    public int getPositiony() {
        return this.positionactuelley;
    }
    public void setPosition(int x,int y) {
        this.newpositionx = x;
        this.newpositiony = y;
    }
    public void movePosition() {
            if(this.newpositionx != this.positionactuellex) {
                if(this.newpositionx > this.positionactuellex) {
                    this.positionactuellex=this.positionactuellex+10;
                }else {
                    this.positionactuellex=this.positionactuellex-10;
                }
            }
        if(this.newpositiony != this.positionactuelley) {
            if(this.newpositiony > this.positionactuelley) {
                this.positionactuelley=this.positionactuelley+10;
            }else {
                this.positionactuelley=this.positionactuelley-10;
            }
        }
    }
    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(positionactuellex,positionactuelley,radius,orange);
        canvas.drawLine(positionactuellex-radius-10,positionactuelley,positionactuellex+radius+10,positionactuelley,orange);
        canvas.drawLine(positionactuellex,positionactuelley-radius-10,positionactuellex,positionactuelley+radius+10,orange);
    }
}
