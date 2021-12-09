package com.example.myfirstapp;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GameView extends SurfaceView implements SurfaceHolder.Callback {

    private MainThread thread;
    private Ball ball;
    private BlockMatrix blockField;
    GameScreenActivity parentActivity;
    private int Ballx;
    private int Bally;

    public GameView(Context context) {
        super(context);

        parentActivity = (GameScreenActivity) context;
        getHolder().addCallback(this);

        // updates Canvas
        thread = new MainThread(getHolder(), this);
        setFocusable(true);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        ball = new Ball();
        blockField = new BlockMatrix(parentActivity);
        thread.setRunning(true);
        thread.start();
    }

    public void update() {
        ball.setXY(Ballx, Bally);
        blockField.setBallPosition(Ballx, Bally);
        // calc positions here

    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (canvas!=null) {
            ball.draw(canvas);
            blockField.draw(canvas);
        }
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        boolean retry = true;

        while (retry) {
            try {
                thread.setRunning(false);
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            retry = false;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        System.out.println("lub");
        Ballx = (int)event.getX();
        Bally = (int)event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
            case MotionEvent.ACTION_UP:
        }
        return true;
    }
}
