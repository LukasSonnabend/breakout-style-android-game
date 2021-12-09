package com.example.myfirstapp;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Ball {

    private Integer x = 0;
    private Integer y = 0;
    private Integer radius = 10;
    private Paint paint = new Paint();

    public void draw(Canvas canvas) {
        paint.setColor(Color.parseColor("#CD5C5C"));
        canvas.drawCircle(x, y, radius, paint);
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
