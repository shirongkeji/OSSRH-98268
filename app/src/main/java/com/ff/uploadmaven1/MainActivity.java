package com.ff.uploadmaven1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadImg(View view) {
        Glide.with(this).load("https://img1.baidu.com/it/u=3760120529,2546074609&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=909").into((ImageView) findViewById(R.id.iv));
    }
}