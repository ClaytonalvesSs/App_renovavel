package com.example.app_energia_renovavel;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class tela_eolica extends AppCompatActivity implements SensorEventListener {
    private ImageView imageView;
    private Sensor sensor;
    private SensorManager sensorManager;
    private Toast toast;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_eolica);
        imageView = findViewById(R.id.imgvpoke2);

        exibirToast();

        // inicializando o SensorManeger e o acelerômetro
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        //colocando um ouvinte
            sensorManager.registerListener((SensorEventListener) this, sensor,SensorManager.SENSOR_DELAY_NORMAL);
    }

    public void onSensorChanged(SensorEvent event){
        //verificando o balanço
        float x = event.values[0];

        if(x > 15){
            imageView.setImageResource(R.drawable.fletchinder);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    private void exibirToast() {

        toast = Toast.makeText(getApplicationContext(), "Balance seu dispositivo para evoluir o pokémon", Toast.LENGTH_LONG);

        // Opcional: Personalize a posição do Toast (por exemplo, centralizado)
        toast.setGravity(Gravity.CENTER, 0, 0);

        // Exiba o Toast
        toast.show();
    }

    public void voltarmenu(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void mapaeolica(View view){
        Uri location = Uri.parse("geo:0,0?q= Parque+Eólico+Oitis");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }


}