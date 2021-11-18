package com.example.sampleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     TextView apiKey=findViewById(R.id.tv_apiKey);
     apiKey.setText(BuildConfig.API_KEY);

        Toast.makeText(MainActivity.this, BuildConfig.API_KEY, Toast.LENGTH_LONG).show();

    }
}