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
import android.widget.TextView;
import android.widget.Toast;

public class AS_Sign_Up extends AppCompatActivity {

    private TextView signIn, txtClose;
    private Button signUp, verify;
    private Dialog passCodePopUp;
    private EditText accountNumber, email, password, passCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_s__sign__up);

        signIn = findViewById(R.id.textView7);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AS_Sign_Up.this, AS_Login.class));
            }
        });

        signUp = findViewById(R.id.signUpBtn);
        passCodePopUp = new Dialog(this);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                accountNumber = findViewById(R.id.account_number);
                email = findViewById(R.id.email);
                password = findViewById(R.id.password);
                String an =  accountNumber.getText().toString();
                String e =  email.getText().toString();
                String p =  password.getText().toString();

                if(an.isEmpty()){
                    accountNumber.setError("Enter Account Number");
                    Toast.makeText(getApplicationContext(), "Please Enter Account Number", Toast.LENGTH_LONG).show();
                }
                else if(e.isEmpty()){
                    email.setError("Enter Email");
                    Toast.makeText(getApplicationContext(), "Please Enter Email", Toast.LENGTH_LONG).show();
                }
                else if(p.isEmpty()){
                    password.setError("Enter Password");
                    Toast.makeText(getApplicationContext(), "Please Enter Password", Toast.LENGTH_LONG).show();
                }
                else {
                    passCodePopUp.setContentView(R.layout.activity_a_s_pass_code);
                    txtClose = (TextView) passCodePopUp.findViewById(R.id.close);
                    txtClose.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            passCodePopUp.dismiss();
                        }
                    });
                    passCodePopUp.setCanceledOnTouchOutside(false);
                    passCodePopUp.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    passCodePopUp.show();

                    verify = (Button) passCodePopUp.findViewById(R.id.button);
                    verify.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            passCode = (EditText) passCodePopUp.findViewById(R.id.editTextTextPersonName);
                            String pc =  passCode.getText().toString();
                            if(pc.isEmpty()){
                                passCode.setError("Enter Valid Pass Code!");
                                Toast.makeText(getApplicationContext(), "Please Enter Valid Pass Code!", Toast.LENGTH_LONG).show();
                            }else {
                                Toast.makeText(getApplicationContext(), "Successfully Registered To Commercial Bank App.", Toast.LENGTH_LONG).show();
                                startActivity(new Intent(AS_Sign_Up.this, AS_Login.class));
                            }
                        }
                    });


                }
            }
        });
    }
}