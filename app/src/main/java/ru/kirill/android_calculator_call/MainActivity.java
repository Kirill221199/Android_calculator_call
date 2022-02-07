package ru.kirill.android_calculator_call;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        (findViewById(R.id.button_call)).setOnClickListener(view ->{
            Intent intent = new Intent("Call_calculator");
            startActivity(intent);
        });
    }
}