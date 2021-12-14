package com.example.wesfood;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imageDeliveryMan;
    TextView text1;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageDeliveryMan = findViewById(R.id.image_delivery_man);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startEnterAnimation();

            }
        },1000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startExitAnimation();

            }
        },3000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(MainActivity.this,GetstartedActivity.class));
                finish();

            }
        },5000);

    }


    private void startEnterAnimation() {

        imageDeliveryMan.startAnimation(AnimationUtils.loadAnimation(this,R.anim.image_in));
        text1.startAnimation(AnimationUtils.loadAnimation(this,R.anim.text_in));
        text2.startAnimation(AnimationUtils.loadAnimation(this,R.anim.text_in));
        imageDeliveryMan.setVisibility(View.VISIBLE);
        text1.setVisibility(View.VISIBLE);
        text2.setVisibility(View.VISIBLE);


    }

    private void startExitAnimation() {

        imageDeliveryMan.startAnimation(AnimationUtils.loadAnimation(this,R.anim.image_out));
        text1.startAnimation(AnimationUtils.loadAnimation(this,R.anim.text_out));
        text2.startAnimation(AnimationUtils.loadAnimation(this,R.anim.text_out));
        imageDeliveryMan.setVisibility(View.INVISIBLE);
        text1.setVisibility(View.INVISIBLE);
        text2.setVisibility(View.INVISIBLE);

    }

}

