package com.example.combankapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class KP_Dashboard extends AppCompatActivity {
    CardView cardFundTrn, cardPaySettl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_p__dashboard);

        cardFundTrn = findViewById(R.id.cardView1);
        cardFundTrn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KP_Dashboard.this, FundTranManagement.class);
                startActivity(intent);
            }
        });

        cardPaySettl = findViewById(R.id.cardView2);
        cardPaySettl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KP_Dashboard.this, PaymentSettlement.class);
                startActivity(intent);
            }
        });
    }
}