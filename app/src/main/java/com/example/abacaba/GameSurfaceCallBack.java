package com.example.abacaba;

import android.view.SurfaceHolder;

import androidx.annotation.NonNull;

public class GameSurfaceCallBack implements SurfaceHolder.Callback {
    private GameView gameView;

    GameSurfaceCallBack(GameView gameView){

        this.gameView = gameView;
    }
    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {2
        gameView.drawAll2();
    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

    }
}
