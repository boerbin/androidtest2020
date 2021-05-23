package com.akent.meinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class first_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(first_activity.this, "You clicked Button1", Toast.LENGTH_SHORT).show();
            }
        });
    }

}