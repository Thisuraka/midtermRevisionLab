package com.example.revisionlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class addReading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_reading);

    }

    private void changeFragment(Fragment fragment){

        Intent intent = getIntent();
        Integer flag = intent.getIntExtra("number", 1);
        TextView txtV1 = (TextView)findViewById(R.id.lblAuthor);
        TextView txtV2 = (TextView)findViewById(R.id.lblTitle);

        if(flag == 1){
            txtV1.setText("Author: ");
            txtV2.setText("Book Title: ");

            Fragment fragment1;
            fragment1 = new bookFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment, fragment1);
            ft.commit();
        }
        else{
            txtV1.setText("Editor: ");
            txtV2.setText("Title of the Article: ");

            Fragment fragment2;
            fragment2 = new paperFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment, fragment2);
            ft.commit();
        }
    }
}