package com.example.combankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class AN_Compare extends AppCompatActivity {

    private EditText amount, duration;
    private Spinner type;
    private String accountType;
    private TextView detail, pAccountType, pAmount, pin, pDuration, pTotalIn, pTAmount;
    private Button compare, ok;
    private Dialog compareDetailPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_n__compare);

        type = (Spinner) findViewById(R.id.spinner);
        detail = findViewById(R.id.interest);
        compare = findViewById(R.id.fixedBtn8);

        compareDetailPopup = new Dialog(this);

        type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                accountType = parent.getItemAtPosition(position).toString();
                detail.setText(accountType + " - " + getInterest(accountType) + "%");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount = findViewById(R.id.amount);
                duration = findViewById(R.id.duration);
                String a = amount.getText().toString();
                String d = duration.getText().toString();

                //String a =  Float.parseFloat(amount.getText().toString());
                //int d =   Integer.parseInt(duration.getText().toString());
                if (a.isEmpty()) {
                    amount.setError("Enter Deposit Amount!");
                    Toast.makeText(getApplicationContext(), "Please Enter Deposit Amount", Toast.LENGTH_LONG).show();
                } else if (d.isEmpty()) {
                    duration.setError("Enter Duration!");
                    Toast.makeText(getApplicationContext(), "Please Enter Duration", Toast.LENGTH_LONG).show();
                } else {
                    compareDetailPopup.setContentView(R.layout.a_n_acc_details);
                    ok = (Button) compareDetailPopup.findViewById(R.id.ok);
                    ok.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            compareDetailPopup.dismiss();
                        }
                    });
                    compareDetailPopup.setCanceledOnTouchOutside(true);
                    compareDetailPopup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    compareDetailPopup.show();

                    int totalIn = Integer.parseInt(a) * getInterest(accountType) / 100 * Integer.parseInt(d);
                    int totalAmount = Integer.parseInt(a) + totalIn;

                    pAccountType = (TextView) compareDetailPopup.findViewById(R.id.type);
                    pAmount = (TextView) compareDetailPopup.findViewById(R.id.amount);
                    pin = (TextView) compareDetailPopup.findViewById(R.id.interest);
                    pDuration = (TextView) compareDetailPopup.findViewById(R.id.duration);
                    pTotalIn = (TextView) compareDetailPopup.findViewById(R.id.totalInterest);
                    pTAmount = (TextView) compareDetailPopup.findViewById(R.id.totalAmount);
                    pTAmount = (TextView) compareDetailPopup.findViewById(R.id.totalAmount);

                    pAccountType.setText(accountType);
                    pAmount.setText("Amount - RS:" + a + ".00/-");
                    pin.setText("Interest - " + getInterest(accountType) + "%");
                    pDuration.setText("Duration - " + d + " Months");
                    pTotalIn.setText("Total Interest - RS:" + totalIn + ".00/-");
                    pTAmount.setText("Total Amount - RS:" + totalAmount + ".00/-");
                }

            }
        });
    }
    public int getInterest(String type) {
        int rate = 100;
        if (type.equals("Fixed Deposit Account")) {
            rate = 10;
        } else if (type.equals("Arunalu Savings Account")) {
            rate = 6;
        }
        return rate;
    }
}