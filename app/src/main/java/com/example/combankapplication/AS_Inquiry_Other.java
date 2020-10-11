package com.example.combankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class AS_Inquiry_Other extends AppCompatActivity {

    private TextView txtClose;
    private ImageView contact, back;
    private Dialog contactDetailsPopUp;
    private Button cardLost,inquiry;
    private EditText accountNumber, inquiryText;
    private Switch acc, card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_s__inquiry__other);

        contact = findViewById(R.id.imageView);
        inquiry = findViewById(R.id.signUpBtn2);
        accountNumber = findViewById(R.id.editTextTextPersonName3);
        inquiryText = findViewById(R.id.editTextTextPersonName4);
        acc = findViewById(R.id.switch1);
        card = findViewById(R.id.switch2);
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

        back = findViewById(R.id.imageView4);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AS_Inquiry_Other.this, KP_Dashboard.class));
            }
        });

        inquiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(accountNumber.getText().toString().isEmpty()){
                    accountNumber.setError("Enter Account Number");
                    Toast.makeText(getApplicationContext(), "Please Enter Account Number", Toast.LENGTH_LONG).show();
                }
                else if(inquiryText.getText().toString().isEmpty()){
                    inquiryText.setError("Enter Inquiry");
                    Toast.makeText(getApplicationContext(), "Please Enter Inquiry", Toast.LENGTH_LONG).show();
                }else {
                    accountNumber.setText("");
                    inquiryText.setText("");
                    Toast.makeText(getApplicationContext(), "Inquiry Created Successfully!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}