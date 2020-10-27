package com.example.demotouch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private float x1, y1, x2, y2;
    private float ratio = 1f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    x1 = event.getX();
                    y1 = event.getY();
                    return true;
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    x2 = event.getX();
                    y2 = event.getY();
                    if (x2 - x1 > 0) {
                        ratio = ratio * 1.5f;
                        imageView.setScaleX(ratio);
                        imageView.setScaleY(ratio);
                    } else {

                        ratio = ratio * 2f / 3f;
                        imageView.setScaleX(ratio);
                        imageView.setScaleY(ratio);
                    }
                    return true;
                }
                return onTouchEvent(event);
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getActionMasked();
        float x = event.getX();
        float y = event.getY();

        switch (action) {
            case MotionEvent.ACTION_DOWN:
                Log.i("MainActivity", "Action Down | X:" + x + ",Y" + y);
                break;
            case MotionEvent.ACTION_UP:
                Log.i("MainActivity", "Action Up| X:" + x + ",Y" + y);
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("MainActivity", "Action Move| X:" + x + ",Y" + y);
                break;
            case MotionEvent.ACTION_SCROLL:
                Log.i("MainActivity", "Action Scroll| X:" + x + ",Y" + y);
                break;


        }
        return super.onTouchEvent(event);
    }
}