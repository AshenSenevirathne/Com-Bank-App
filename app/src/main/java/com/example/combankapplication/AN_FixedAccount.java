package com.example.combankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AN_FixedAccount extends AppCompatActivity {
    private Button fixCompare;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_n__fixed_account);
        fixCompare = findViewById(R.id.fixCompare);
        fixCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AN_FixedAccount.this, AN_Compare.class));
            }
        });
    }
}