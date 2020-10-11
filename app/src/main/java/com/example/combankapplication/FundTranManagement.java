package com.example.combankapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FundTranManagement extends AppCompatActivity {
    Button BtnOwn, BtnThirdParty, BtnHistory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fund_tran_management);

        BtnOwn = findViewById(R.id.tabOwn);
        BtnThirdParty = findViewById(R.id.tabThirdParty);
        BtnHistory = findViewById(R.id.tabHistory);

        Fragment frag = new OwnFrag();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, frag).commit();

        BtnOwn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnOwn.setBackgroundResource(R.drawable.tab_button_click);
                BtnThirdParty.setBackgroundResource(R.drawable.tab_button_unclick);
                BtnHistory.setBackgroundResource(R.drawable.tab_button_unclick);

                Fragment frag = new OwnFrag();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, frag).commit();
            }
        });

        BtnThirdParty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnThirdParty.setBackgroundResource(R.drawable.tab_button_click);
                BtnOwn.setBackgroundResource(R.drawable.tab_button_unclick);
                BtnHistory.setBackgroundResource(R.drawable.tab_button_unclick);

                Fragment frag = new ThirdPartyFrag();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, frag).commit();
            }
        });

        BtnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnHistory.setBackgroundResource(R.drawable.tab_button_click);
                BtnOwn.setBackgroundResource(R.drawable.tab_button_unclick);
                BtnThirdParty.setBackgroundResource(R.drawable.tab_button_unclick);

                Fragment frag = new HistoryFrag();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, frag).commit();
            }
        });
    }
}