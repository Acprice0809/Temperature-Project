package com.example.temperatureconversionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputBox1;
    TextView forCelisus;
    TextView appTitle;
    ConstraintLayout layout;
    Button fahrenheitButton;
    TextView outputBox1;
    EditText inputBox2;
    TextView forFahrenheit;
    Button celisusButton;
    TextView outputBox2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputBox1 = findViewById(R.id.inputBox1);
        forCelisus = findViewById(R.id.forCelsius);
        fahrenheitButton = findViewById(R.id.fahrenheitButton);
        outputBox1 = findViewById(R.id.outputBox1);
        inputBox2 = findViewById(R.id.inputBox2);
        forFahrenheit = findViewById(R.id.forFahrenheit);
        celisusButton = findViewById(R.id.celsiusButton);
        outputBox2 = findViewById(R.id.outputBox2);

        fahrenheitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = inputBox1.getText().toString();

            }
        });

        layout.setBackgroundColor(0xffD58E01);

    }
}