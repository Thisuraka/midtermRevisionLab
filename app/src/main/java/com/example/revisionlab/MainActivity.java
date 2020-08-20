package com.example.revisionlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.but1);
        final EditText et1 = (EditText) findViewById(R.id.txtE1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // startActivity(new Intent(MainActivity.this, act2.class));

                Intent intent = new Intent(MainActivity.this, act2.class);
                intent.putExtra("value1",et1.getText().toString());
                startActivity(intent);
            }
        });
    }
}