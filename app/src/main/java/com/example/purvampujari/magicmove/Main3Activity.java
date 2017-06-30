package com.example.purvampujari.magicmove;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {
ImageView imageViewp;
    CountDownTimer cd;
    long k=1000000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        imageViewp = (ImageView) findViewById(R.id.imageViewp);
       cd= new CountDownTimer(k, 350) {

            public void onTick(long millisUntilFinished) {
                switch ((int) (millisUntilFinished / 350) % 5) {
                    case 0: {
                        imageViewp.setImageResource(R.drawable.rockp);
                        break;
                    }

                    case 1: {
                        imageViewp.setImageResource(R.drawable.spockp);
                        break;
                    }
                    case 2: {
                        imageViewp.setImageResource(R.drawable.paperp);
                        break;
                    }
                    case 3: {
                        imageViewp.setImageResource(R.drawable.lizardp);
                        break;
                    }
                    case 4: {
                        imageViewp.setImageResource(R.drawable.scissorsp);
                        break;
                    }
                }
            }
            public void onFinish() {
                k=1000000;
cd.start();
            }
        };
        cd.start();
    }

    public void typ(View view){
        Intent intent = new Intent(this,Main11Activity.class);
        startActivity(intent);
    }

    public void tuto(View view){
        Intent intent = new Intent(this,Main9Activity.class);
        startActivity(intent);
    }
    public void tu(View view){
        Intent intent = new Intent(this,Main12Activity.class);
        startActivity(intent);
    }
}
