package com.example.imbert.couleurs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by imbert on 3/22/18.
 */

public class Circle extends View {
    private Paint circle;
    public Circle(Context context,AttributeSet attrs) {
        super(context, attrs);
        circle = new Paint();
    }
    public void changerCouleur(int couleur) {
        circle.setColor(couleur);
    }
    @Override
    public void onDraw(Canvas c) {
        c.drawCircle(21.0F,20.0F,20.0F,circle);
    }
}
