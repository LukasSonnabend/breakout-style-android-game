package com.example.myfirstapp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class GameScreenActivity extends AppCompatActivity {

    public TextView xPos;
    public TextView yPos;
    public TextView eventPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_game_screen);
        super.onCreate(savedInstanceState);
        setContentView(new GameView(this));
    }

/*
        xPos = (TextView) findViewById(R.id.x_pos);
        yPos = (TextView) findViewById(R.id.y_pos);
        eventPos = (TextView) findViewById(R.id.event);
        yPos.setText("Lubo dsfda f");

        //Set a Rect for the 200 x 200 px center of a 400 x 400 px area
        Rect rect = new Rect();

        rect.set(100, 100, 300, 300);

        //Allocate a new Bitmap at 400 x 400 px
        Bitmap bitmap = Bitmap.createBitmap(400, 400, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);

        //Make a new view and lay it out at the desired Rect dimensions
        TextView view = new TextView(this);
        view.setText("This is a custom drawn textview");
        view.setBackgroundColor(Color.RED);
        view.setGravity(Gravity.CENTER);

        //Measure the view at the exact dimensions (otherwise the text won't center correctly)
        int widthSpec = View.MeasureSpec.makeMeasureSpec(rect.width(), View.MeasureSpec.EXACTLY);
        int heightSpec = View.MeasureSpec.makeMeasureSpec(rect.height(), View.MeasureSpec.EXACTLY);
        view.measure(widthSpec, heightSpec);

        //Lay the view out at the rect width and height
        view.layout(0, 0, rect.width(), rect.height());

        //Translate the Canvas into position and draw it
        canvas.save();
        canvas.translate(rect.left, rect.top);
        view.draw(canvas);
        canvas.restore();

        //To make sure it works, set the bitmap to an ImageView
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        setContentView(imageView);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageBitmap(bitmap);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        int x = (int)event.getX();
        int y = (int)event.getY();
        xPos.setText(String.valueOf(x));
        yPos.setText(String.valueOf(y));

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                eventPos.setText("DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                eventPos.setText("MOVE");
                break;
            case MotionEvent.ACTION_UP:
                eventPos.setText("UP");
                break;
        }

        return false;
    }
*/
}