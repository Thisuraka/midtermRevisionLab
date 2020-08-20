package com.example.revisionlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);

        Intent intent = getIntent();
        final EditText ET2 = findViewById(R.id.txtE2);
        ET2.setText(intent.getStringExtra("value1"));

        Button btn = (Button)findViewById(R.id.but2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(act2.this, readingCollections.class);
                startActivity(intent1);

                Context context = getApplicationContext();
                CharSequence text = "Welcome " + ET2.getText() + "!\nPlease enter what you read";
                int duration = Toast.LENGTH_SHORT;

                //Toast toast = Toast.makeText(context, "Welcome " + ET2.getText() + "!\nPlease enter what you read", duration);
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
}