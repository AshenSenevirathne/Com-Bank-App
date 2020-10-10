package com.example.combankapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentSettlement extends AppCompatActivity {

    Button BtnCategory, BtnHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_settlement);

        BtnCategory = findViewById(R.id.tabCat);
        BtnHistory = findViewById(R.id.tabPayHist);

        Fragment frag = new CategoryPSFrag();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, frag).commit();

        BtnCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnCategory.setBackgroundResource(R.drawable.tab_button_click);
                BtnHistory.setBackgroundResource(R.drawable.tab_button_unclick);

                Fragment frag = new CategoryPSFrag();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, frag).commit();
            }
        });

        BtnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnHistory.setBackgroundResource(R.drawable.tab_button_click);
                BtnCategory.setBackgroundResource(R.drawable.tab_button_unclick);

                Fragment frag = new PayHistFragPS();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, frag).commit();
            }
        });
    }
}