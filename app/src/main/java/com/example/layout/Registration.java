package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
    public void OnClick(View v)
    {
        Intent intent = new Intent(this, Congrats.class);
        startActivity(intent);
    }
    public void Log(View v)
    {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}