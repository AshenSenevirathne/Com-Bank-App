package com.example.combankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class KP_Exchange_Rates extends AppCompatActivity {

    ImageView BackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_p__exchange__rates);

        BackBtn = findViewById(R.id.BackBtn);
        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KP_Exchange_Rates.this, KP_Dashboard.class));
            }
        });
    }
}