package com.example.banana2.threejswebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

        mXWalkView.load("http://toxicfork.github.io/react-three-renderer-example/#/webgl_geometry_shapes", null);
    }
}
