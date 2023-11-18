package com.example.app_energia_renovavel;

import androidx.appcompat.app.AppCompatActivity;

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

public class tela_oceanica extends AppCompatActivity implements SensorEventListener {

    private ImageView imageView;
    private Sensor sensor;
    private SensorManager sensorManager;

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_oceanica);
        imageView = findViewById(R.id.imgvpoke4);

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
            imageView.setImageResource(R.drawable.gyarados);
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

    public void voltarmenu2(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void mapaocean(View view){
        Uri location = Uri.parse("geo:0,0?q= Usina+maremotriz+de+La+Rance");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }
}