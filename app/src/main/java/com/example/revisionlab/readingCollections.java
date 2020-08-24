package com.example.revisionlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class readingCollections extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_collections);

        Button btn1 = (Button)findViewById(R.id.but3);
        Button btn2 = (Button)findViewById(R.id.but4);
        final String txt1 = "1";
        final String txt2 = "2";

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(readingCollections.this, addReading.class);
                intent.putExtra("number", txt1);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(readingCollections.this, addReading.class);
                intent.putExtra("number", txt2);
                startActivity(intent);
            }
        });
    }
}