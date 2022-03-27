package com.example.abacaba;

import android.graphics.Canvas;
import android.graphics.Paint;

public class DrawableObject {
    private Paint paint = new Paint();
    private float x;
    private float y;

    public DrawableObject(float x, float y) {
        paint.setARGB(100, 100, 100, 100);
        this.x = x;
        this.y = y;
    }
    public void draw(Canvas canvas) {
        canvas.drawRect(x,y,x+100,y+100, paint);
    }
}
