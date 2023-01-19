package com.example.temperatureconversionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText InputBox1;
    TextView forCelisus;
    TextView appTitle;
    ConstraintLayout layout;
    Button fahrenheitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputBox1 = findViewById(R.id.InputBox1);
        forCelisus = findViewById(R.id.forCelsius);
        fahrenheitButton = findViewById(R.id.fahrenheitButton);

        appTitle.setTextColor(0xffffffff);
        layout.setBackgroundColor(0xffD58E01);
    }
}