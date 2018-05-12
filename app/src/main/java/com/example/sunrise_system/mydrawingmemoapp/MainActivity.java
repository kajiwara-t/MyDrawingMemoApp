package com.example.sunrise_system.mydrawingmemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.graphics.Color;
import android.graphics.Canvas;
import android.graphics.Paint;

import android.view.Surface;
import android.view.SurfaceView;
import android.view.SurfaceHolder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //coordinates=座標

    private Paint paint;

}
