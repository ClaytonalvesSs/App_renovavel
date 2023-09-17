package com.example.app_energia_renovavel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class tela_intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_intro);
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(tela_intro.this, tela_login.class);
            startActivity(intent);
            finish();
        }, 2000);
    }
}