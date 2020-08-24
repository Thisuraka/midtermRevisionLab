package com.example.revisionlab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class addReading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_reading);


    }

    private void changeFragment(){

        String flag = getIntent().getStringExtra("number");

        if(flag == "1"){

        }
    }
}