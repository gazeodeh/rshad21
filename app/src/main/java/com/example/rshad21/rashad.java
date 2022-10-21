package com.example.rshad21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class rashad extends AppCompatActivity {
    EditText etphone,etsms;
    Button  bsendsms,bcall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rashad);
        etphone=findViewById(R.id.etphone);
        etsms=findViewById(R.id.etsms);
        bsendsms=findViewById(R.id.bsendsms);
        bcall=findViewById(R.id.bcall);
    }

    public void sms(View view) {
        String messageToSend = "this is a message";
        String number = "2121234567";

        SmsManager.getDefault().sendTextMessage(number, null, messageToSend, null,null);
    }

    public void call(View view) {

    }
}