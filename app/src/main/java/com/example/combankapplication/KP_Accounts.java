package com.example.combankapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class KP_Accounts extends AppCompatActivity {

    CardView savBtn, creBtn;
    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_p__accounts);

        savBtn = findViewById(R.id.cardView);
        creBtn = findViewById(R.id.creCardBtn);
        backBtn = findViewById(R.id.backbtn);

        savBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KP_Accounts.this, KP_Account_details.class));
            }
        });

        creBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KP_Accounts.this, KP_Account_details.class));
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KP_Accounts.this, KP_Dashboard.class));
            }
        });
    }
}