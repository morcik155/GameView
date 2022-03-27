package com.example.abacaba;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GameView  extends SurfaceView {
    private final SurfaceHolder holder;

    public GameView(Context context) {
        super(context);
        holder = getHolder();
        holder.addCallback(new GameSurfaceCallBack(this));
    }
    public void drawAll() {
        Canvas canvas = holder.lockCanvas();
        canvas.drawRGB(200, 70, 43);
        Paint paint = new Paint();
        paint.setARGB(130, 100, 78, 200);
        paint.setStrokeWidth(15);
        canvas.drawLine(0,0,100,100, paint);
        holder.unlockCanvasAndPost(canvas);
    }


}
