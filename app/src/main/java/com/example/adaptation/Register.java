package com.example.adaptation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().hide();
    }

    public void onClickLog(View v) {
        Intent intent = new Intent(this, Log.class);
        startActivity(intent);
    }

    public void onClickStarted(View v) {
        Intent intent = new Intent(this, Started.class);
        startActivity(intent);
    }
}