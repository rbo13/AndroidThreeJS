package com.example.banana2.threejswebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import org.xwalk.core.XWalkView;

public class MainActivity extends AppCompatActivity {

    private XWalkView mXWalkView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mXWalkView = (XWalkView) findViewById(R.id.xWalkView);
    }

    @Override
    protected void onStart() {
        super.onStart();

        mXWalkView.load("https://whaangbuu.github.io/draggable_cubes.html", null);
        mXWalkView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return (event.getAction() == MotionEvent.ACTION_MOVE);
            }
        });
    }
}
