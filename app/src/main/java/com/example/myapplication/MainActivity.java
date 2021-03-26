package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText password;
    EditText login;
    Button Signup;

    String strLog = "qwerty";
    String strPas = "1234567890";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.start);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);
            finish();
        });
    }

    public void Sign(View view) {
        String resLogin = login.getText().toString();
        String resPassword = password.getText().toString();


        if (resLogin.equals(strLog) && resPassword.equals(strPas))
            tv.setText("Вы вошли в аккаунт");
        else
            tv.setText("Неправильный логин или пароль");
    }

    public void Login(View view) {
        findViewById(R.id.etLog);
    }

    public void Pass(View view) {
        findViewById(R.id.etPas);
    }
}