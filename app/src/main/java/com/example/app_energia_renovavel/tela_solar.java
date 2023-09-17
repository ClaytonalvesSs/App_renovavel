package com.example.app_energia_renovavel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class tela_solar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_solar);
    }

    public void voltarmenu(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void mapasolar(View view){
     Uri location = Uri.parse("geo:0,0?q= Parque+Solar+São+Gonçalo+Piaui");
     Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
     startActivity(mapIntent);
    }
}