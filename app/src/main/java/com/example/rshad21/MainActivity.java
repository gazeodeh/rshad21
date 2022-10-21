package com.example.rshad21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttongo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttongo=findViewById(R.id.buttongo);

    }

    public void Goto(View view) {
        Intent intent = new Intent(this, rashad.class);
        startActivity(intent);
    }
}