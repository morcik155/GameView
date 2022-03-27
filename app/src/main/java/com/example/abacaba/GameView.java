package com.example.abacaba;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.ArrayList;
import java.util.List;

public class GameView  extends SurfaceView {
    private final SurfaceHolder holder;
    private List<DrawableObject> objects = new ArrayList();

    public GameView(Context context) {
        super(context);
        holder = getHolder();
        holder.addCallback(new GameSurfaceCallBack(this));
    }
    public void drawAll() {
        Canvas canvas = holder.lockCanvas();
        canvas.drawRGB(200, 70, 43); // меняем цвет фона
        Paint paint = new Paint();
        paint.setARGB(130, 100, 78, 200); // меняем цвет и прозрачность(это параметр а)
        paint.setStrokeWidth(10); // меняем ширину линии
        float w = canvas.getWidth();
        float h = canvas.getHeight();
//        System.out.println(w);
//        System.out.println(h);
//        for (float i = 0f; i<h;i=i+20){
//            canvas.drawLine(0f,i,1080f,i,paint);
//        }
//        for (float i = 0f; i<w;i=i+20){
//            canvas.drawLine(i,0f,i,1977f,paint);
//        }
        holder.unlockCanvasAndPost(canvas);
    }
    public void drawAll2() {
        Canvas canvas = holder.lockCanvas();
        for (DrawableObject d: objects){
            d.draw(canvas);
        }
        holder.unlockCanvasAndPost(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction()==MotionEvent.ACTION_DOWN){
            objects.add(new DrawableObject(event.getX(), event.getY()));
            drawAll2();
        }
        return true;
    }
}
