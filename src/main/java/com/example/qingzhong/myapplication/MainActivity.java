package com.example.qingzhong.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;


public class MainActivity extends AppIntro {

    @Override
    public void init(@Nullable Bundle savedInstanceState) {


     setBarColor(Color.parseColor("#3F51B5"));
    }


    @Override
    public void onSkipPressed() {

    }

    @Override
    public void onDonePressed() {

    }
}
