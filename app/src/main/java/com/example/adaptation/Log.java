package com.example.adaptation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Log extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        getSupportActionBar().hide();
    }

    public void onClickRegister(View v) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}