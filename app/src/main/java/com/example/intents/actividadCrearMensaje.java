package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class actividadCrearMensaje extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_message);
    }

    public void onSendMessage(View view) {
        EditText messageView = (EditText) findViewById(R.id.messageSend);
        String MessageText = messageView.getText().toString();

        Intent intent = new Intent(this, actividadRecibirMensaje.class);
        intent.putExtra("messageSend",MessageText);
        startActivity(intent);
    }


}



