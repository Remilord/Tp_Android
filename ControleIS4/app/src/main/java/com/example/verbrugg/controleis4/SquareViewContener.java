package com.example.verbrugg.controleis4;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;
import static java.sql.Types.NULL;

/**
 * Created by blancharv on 3/15/18.
 */

public class SquareViewContener extends View {
    public static final int CIRCLE_RADIUS = 150;
    public static final int CIRCLE_PAINT_DEFAULT_COLOR = Color.WHITE;
    public static final String COLOR_PREFERENCES = "ColorPrefs";

    public static final int DEFAULT_RED_COLOR = 130;
    public static final int DEFAULT_GREEN_COLOR = 254;
    public static final int DEFAULT_BLUE_COLOR = 200;

    Paint paint;
    Paint circlePaint;
    RectF r;

    private int red;
    private int blue;
    private int green;
    private int color;

    private Activity activity;
    public SquareViewContener(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setDrawingCacheEnabled(true);
        r = new RectF(0, 0, 1000, 1000);

        this.red = DEFAULT_RED_COLOR; //Default green color
        this.green = DEFAULT_GREEN_COLOR; //Default green color
        this.blue = DEFAULT_BLUE_COLOR; //Default green color

        //recoverSavedColor();


        initPaint();
        //hostContext = getRootView().getContext();

    }


    private void initPaint(){

        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.rgb(this.red, this.green, this.blue));//0xFF82FEC8
        paint.setStyle(Paint.Style.FILL);

        circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        circlePaint.setColor(CIRCLE_PAINT_DEFAULT_COLOR);

    }

    public void resetColor(){
        this.red = DEFAULT_RED_COLOR; //Default green color
        this.green = DEFAULT_GREEN_COLOR; //Default green color
        this.blue = DEFAULT_BLUE_COLOR; //Default green color

        SharedPreferences sharedPreferences = getRootView().getContext().getSharedPreferences(COLOR_PREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor sharedPreferencesEditor = sharedPreferences.edit();
        sharedPreferencesEditor.clear().commit();
        setPaintColor(red, blue, green);
        this.invalidate();
    }

    public void reDraw(int red, int blue, int green){
        this.red = red;
        this.blue = blue;
        this.green = green;
        saveColor();
        this.setPaintColor(red, blue, green);
        this.invalidate();
    }

    private void setPaintColor(int red, int blue, int green){
        this.color = Color.rgb(red, green, blue);
        paint.setColor(this.color);
    }

    public void setCirclePaintColor(int color){
        circlePaint.setColor(color);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i("Event", "Repainting, square color = " + Color.rgb(red, green, blue) + " , red = " + this.red + " , blue = " + this.blue + " , green = " + this.green);

        canvas.drawRect(r, paint);

        canvas.drawCircle(0, 0, SquareViewContener.CIRCLE_RADIUS, circlePaint);
    }

    public int getRed() {
        return red;
    }

    public int getBlue() {
        return blue;
    }

    public int getGreen() {
        return green;
    }

    private void saveColor(){
        SharedPreferences sharedPreferences = getRootView().getContext().getSharedPreferences(COLOR_PREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor sharedPreferencesEditor = sharedPreferences.edit();
        sharedPreferencesEditor.putInt("blue", this.blue);
        sharedPreferencesEditor.putInt("red", this.red);
        sharedPreferencesEditor.putInt("green", this.green);
        sharedPreferencesEditor.commit();
    }

    public void recoverSavedColor(Activity activity){
        this.activity = activity;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(COLOR_PREFERENCES, MODE_PRIVATE);
        this.red = sharedPreferences.getInt("red",DEFAULT_RED_COLOR);
        this.green = sharedPreferences.getInt("green",DEFAULT_GREEN_COLOR);
        this.blue = sharedPreferences.getInt("blue",DEFAULT_BLUE_COLOR);
        setPaintColor(this.red, this.blue, this.green);
        Log.e("Saved colors", this.red + " " + this.blue + " " + this.green);
        this.invalidate();
    }
}
