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
    Double a;


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
                String s = inputBox1.getText().toString();
                double a = Double.parseDouble(s);
                double value = (a * 9.0 / 5.0) + 32;
                outputBox1.setText(value + "");
            }
        });

        celisusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t = inputBox2.getText().toString();
                double b = Double.parseDouble(t);
                double value = (b - 32) * 5.0 / 9.0;
                outputBox2.setText(value + "");
            }
        });
    }
}