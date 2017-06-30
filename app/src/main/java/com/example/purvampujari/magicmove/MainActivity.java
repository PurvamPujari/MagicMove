package com.example.purvampujari.magicmove;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
    }
    public void reg(View view){
        SharedPreferences sharedPreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);
        if(sharedPreferences.getBoolean("activity_executed", false)){
            Intent intent = new Intent(this,Main3Activity.class);
            startActivity(intent);
            finish();
        } else {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("activity_executed", true);
            editor.putInt("money",100);
            editor.commit();
            Intent intent = new Intent(this,Main2Activity.class);
            startActivity(intent);
            finish();
        }

    }
}
