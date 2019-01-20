package com.basics.android.animationlogin;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        calling main activity page
        layout = findViewById(R.id.layout);

//        To make animated effect we have called AnimationDrawable property where we can define entry and exit time of animation

        AnimationDrawable animationDrawable = (AnimationDrawable) layout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);//Starts animation fade effect
        animationDrawable.setExitFadeDuration(3000);//Ends animation fade effects
        animationDrawable.start();//Starts() used for staring of animation process
    }
}
