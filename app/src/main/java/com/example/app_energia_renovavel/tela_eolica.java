package com.example.app_energia_renovavel;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class tela_eolica extends AppCompatActivity {
    private ImageView imageView;
    private SensorManager sensorManager;
    private Sensor accelerometer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_eolica);
        imageView = findViewById(R.id.imageView);

        // inicializando o SensorManeger e o acelerômetro
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor acccelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        //colocando um ouvinte
        if(accelerometer !=null) {
            sensorManager.registerListener((SensorEventListener) this, accelerometer,SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    public void onSensorChanged(SensorEvent event){
        //verificando o balanço
        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];

        double magnitude = Math.sqrt(x*x + y*y + z*z);

        if(magnitude> 3){
            //iniciando a animação de rotação
            ObjectAnimator rotate = ObjectAnimator.ofFloat(imageView,"rotation", Of, 180f);
            rotate.setDuration(1000); //ajustar conforme seja necessario
            rotate.start();

            imageView.setImageResource(R.drawable.fletchinder);
        }
    }

    @Override public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override protected void onDestroy(){
        super.onDestroy();
        sensorManager.unregisterListener(this);
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