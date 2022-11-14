package com.example.adaptation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int DELAY = 3000;
    int defTimeOut = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Log.class);
                startActivity(intent);
            }
        }, DELAY);

    }

    public void detectOrientation(View v){
        Context appContext = getApplicationContext();
        Configuration configuration = getResources().getConfiguration();
        if(configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(appContext, "Портретная ориентация", Toast.LENGTH_LONG).show();
        }
        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(appContext, "Альбомная ориентация", Toast.LENGTH_LONG).show();
        }
    }


}