package com.example.chellynn_steps;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Personal_Page extends AppCompatActivity implements SensorEventListener {

    TextView step_display;
    SensorManager sensorManager;
    boolean running = false;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal__page);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.GradeClasses,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        //progress bar:
        progressBar = (ProgressBar)findViewById(R.id.personalProgressBar);

        //button from home to history page
        Button historyButton = (Button) findViewById(R.id.toHistoryButton);
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Personal_Page.this, History_Page.class));
            }});

        //button from home to class page
        Button classButton = (Button) findViewById(R.id.toClassButton);
        classButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Personal_Page.this, Student_Classes.class)); //to change to Class_Page
            }});

        //button from home to school page
        Button schoolButton = (Button) findViewById(R.id.toSchoolButton);
        schoolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Personal_Page.this, History_Page.class)); //to change to School_Page
            }});

        step_display = (TextView) findViewById(R.id.tv_steps);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        running = true;
        Sensor countSensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if(countSensor!=null){
            sensorManager.registerListener((SensorEventListener) this, countSensor, SensorManager.SENSOR_DELAY_UI);
        }
        else{
            Toast.makeText(this, "ERROR: Sensor not found!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        running = false;
        //sensorManager.unregisterListener(this); //hardware stops detecting steps. we dont want that
    }
    @Override
    public void onSensorChanged(SensorEvent event) {
        if (running){ //only update display if app open
            step_display.setText(String.valueOf(event.values[0])); //change text
            progressBar.setProgress((int) (event.values[0]/1000)*100); //update progress bar
        }
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}