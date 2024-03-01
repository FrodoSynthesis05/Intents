package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class actividadRecibirMensaje extends AppCompatActivity {

    public static final String Extra_Message = "messageSend";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receive_message);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(Extra_Message);
        TextView messageView =  findViewById(R.id.message);
        messageView.setText(messageText);

    }

}