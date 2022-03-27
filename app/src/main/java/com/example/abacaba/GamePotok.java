package com.example.abacaba;

import android.graphics.Canvas;

public class GamePotok extends Thread {
    private GameView gameView;
    private boolean isRunning = true;

    public GamePotok(GameView gameView){
        this.gameView = gameView;

    }

    @Override
    public void run() {
        while (isRunning) {
            gameView.update();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
