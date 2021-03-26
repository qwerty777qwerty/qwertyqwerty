package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tv;
    Button setT;
    Button CLEAN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void setText(View view) {
        setT = findViewById(R.id.setTT);
    }

    public void clean(View view) {
        CLEAN = findViewById(R.id.cleanTT);
    }
}