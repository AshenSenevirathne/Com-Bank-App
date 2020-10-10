package com.example.combankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AS_Inquiry_Other extends AppCompatActivity {

    private TextView txtClose;
    private ImageView contact;
    private Dialog contactDetailsPopUp;
    private Button cardLost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_s__inquiry__other);

        contact = findViewById(R.id.imageView);
        contactDetailsPopUp = new Dialog(this);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactDetailsPopUp.setContentView(R.layout.activity_a_s_contact_details_pu);
                txtClose = (TextView) contactDetailsPopUp.findViewById(R.id.close);
                txtClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contactDetailsPopUp.dismiss();
                    }
                });
                contactDetailsPopUp.setCanceledOnTouchOutside(false);
                contactDetailsPopUp.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                contactDetailsPopUp.show();
            }
        });

        cardLost = findViewById(R.id.button2);
        cardLost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AS_Inquiry_Other.this, AS_Inquiry.class));
            }
        });
    }
}