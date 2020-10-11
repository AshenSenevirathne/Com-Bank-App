package com.example.combankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AS_Login extends AppCompatActivity {

    private Button LoginBtn;
    private TextView signUp;
    private EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_s__login);

        LoginBtn = findViewById(R.id.SignUpBtn);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = findViewById(R.id.email);
                password = findViewById(R.id.password);
                String e =  email.getText().toString();
                String p =  password.getText().toString();

                if(e.isEmpty()){
                    email.setError("Enter Email");
                    Toast.makeText(getApplicationContext(), "Please Enter Email", Toast.LENGTH_LONG).show();
                }
                else if(p.isEmpty()){
                    password.setError("Enter Password");
                    Toast.makeText(getApplicationContext(), "Please Enter Password", Toast.LENGTH_LONG).show();
                }
                else {
                    startActivity(new Intent(AS_Login.this, KP_Dashboard.class));
                }

            }
        });

        signUp = findViewById(R.id.textView7);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AS_Login.this, AS_Sign_Up.class));
            }
        });
    }
}