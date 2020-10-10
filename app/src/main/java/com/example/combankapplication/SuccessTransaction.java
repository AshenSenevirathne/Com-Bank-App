package com.example.combankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuccessTransaction extends AppCompatActivity {
    Button BtnDone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_transaction);

        BtnDone = findViewById(R.id.btn_submit);
        BtnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuccessTransaction.this,KP_Dashboard.class);
                startActivity(intent);
            }
        });
    }
}