package com.example.myexampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button button = findViewById(R.id.button);
            button.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            Intent i = new Intent(this,MainActivity2.class);
            startActivity(i);
        }
    }