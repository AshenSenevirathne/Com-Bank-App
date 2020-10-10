package com.example.combankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AN_AccountType extends AppCompatActivity {
    private Button savings;
    private Button fixed;
    private Button dotcom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_n__account_type);
        savings = findViewById(R.id.arunaluBtn);
        fixed = findViewById(R.id.fixedBtn);
        dotcom = findViewById(R.id.dotComBtn);
        savings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AN_AccountType.this, AN_Arunalu.class));
            }
        });
        fixed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AN_AccountType.this, AN_FixedAccount.class));
            }
        });
        dotcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AN_AccountType.this, AN_UserGuide.class));
            }
        });
    }
}