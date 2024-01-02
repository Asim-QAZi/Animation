package com.example.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv=findViewById(R.id.txtv);
        Button mv=findViewById(R.id.btnmove);
        Button alp=findViewById(R.id.btnalpha);
        Button rot=findViewById(R.id.btnrotate);
        Button scl=findViewById(R.id.btnscale);



        mv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Animation mve=AnimationUtils.loadAnimation(MainActivity.this,R.anim.move);
             tv.startAnimation(mve);
            }
        });
        alp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation alp=AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
                tv.startAnimation(alp);
            }
        });
    rot.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Animation rt=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
            tv.startAnimation(rt);
        }
    });

    scl.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Animation scale=AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);

            tv.startAnimation(scale);
        }
    });



    }
}