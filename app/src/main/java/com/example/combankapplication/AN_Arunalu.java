package com.example.combankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AN_Arunalu extends AppCompatActivity {
private Button savCompare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_n__arunalu);
        savCompare = findViewById(R.id.arunaluCompare);
        savCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AN_Arunalu.this, AN_Compare.class));
            }
        });

    }
}