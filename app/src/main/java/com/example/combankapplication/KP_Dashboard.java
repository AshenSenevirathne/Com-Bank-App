package com.example.combankapplication;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class KP_Dashboard extends AppCompatActivity {
    CardView cardFundTrn, cardPaySettl, contact, branches, userGui, accounts, exchangeRates, accountTypes;
    private Button btn;
    private Dialog userGuide;
    private ViewFlipper slider;
    private ImageView back, stop, next;
    private TextView header, desc;
    private int position;
    private String textList[] = {
            "This interface has the main categories like Telephone, Water,Electricity and etc.",
            "Dashboard leads the users through the flow of the application.",
            "This interface is useful for the fund transfer activities.",
            "User can select the account options through this interface",
            "User can view all the details properly through this interface",
            "User can add deposit amount, account type and duration to find to calculate the interest",
            "Payments and settlements are displayed in this interface",
            "Here this application is consisted with fund transfer management and payment settlements. Here the transfer history is shown in an ordered manner.",
    };

    private String text[] = {
            "Categories",
            "Dashboard",
            "Fund Transfer",
            "Account Types",
            "Savings Account",
            "Compare Accounts",
            "Payment Settlement",
            "Fund Transfer Management",
    };

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

        contact = findViewById(R.id.cardView7);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KP_Dashboard.this, AS_Inquiry.class);
                startActivity(intent);
            }
        });

        branches = findViewById(R.id.cardView8);
        branches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KP_Dashboard.this, Branch_Locations.class);
                startActivity(intent);
            }
        });

        accounts = findViewById(R.id.accountbtn);
        accounts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KP_Dashboard.this, KP_Accounts.class));
            }
        });

        exchangeRates = findViewById(R.id.exchangeRates);
        exchangeRates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KP_Dashboard.this, KP_Exchange_Rates.class));
            }
        });

        accountTypes = findViewById(R.id.cardView4);
        accountTypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KP_Dashboard.this, AN_AccountType.class));
            }
        });

        /*
         * User Guide Section
         */
        userGui = findViewById(R.id.cardView9);
        userGuide = new Dialog(this);
        userGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userGuide.setContentView(R.layout.activity_a_n_user_guide_pu);
                stop = (ImageView) userGuide.findViewById(R.id.stop);
                stop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        userGuide.dismiss();
                    }
                });
                userGuide.setCanceledOnTouchOutside(true);
                userGuide.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                userGuide.show();

                slider = (ViewFlipper) userGuide.findViewById(R.id.slider);
                back = (ImageView) userGuide.findViewById(R.id.back);
                next = (ImageView) userGuide.findViewById(R.id.next);
                header = (TextView) userGuide.findViewById(R.id.head);
                desc = (TextView) userGuide.findViewById(R.id.desc);

                int image[] = {R.drawable.categoriesimg, R.drawable.dashboardimg, R.drawable.ownimg,R.drawable.back_layout_4,R.drawable.usvimg,R.drawable.compareimg,R.drawable.payhistoryimg,R.drawable.usvimg};;


                position = 0;
                ImageView im = new ImageView(getApplicationContext());
                im.setBackgroundResource(image[position]);
                slider.addView(im);
                slider.setAutoStart(false);
                slider.setInAnimation(getApplicationContext(), android.R.anim.slide_in_left);
                slider.setOutAnimation(getApplicationContext(), android.R.anim.slide_out_right);
                header.setText(text[position]);
                desc.setText(textList[position]);

                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int image[] = {R.drawable.categoriesimg, R.drawable.dashboardimg, R.drawable.ownimg,R.drawable.seleacntimg,R.drawable.usvimg,R.drawable.compareimg,R.drawable.payhistoryimg,R.drawable.usvimg};;

                        if (position < image.length - 1) {
                            ImageView im = new ImageView(getApplicationContext());
                            im.setBackgroundResource(image[++position]);
                            slider.addView(im);
                            slider.showNext();
                            header.setText(text[position]);
                            desc.setText(textList[position]);
                        }
                    }
                });

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int image[] = {R.drawable.categoriesimg, R.drawable.dashboardimg, R.drawable.ownimg,R.drawable.seleacntimg,R.drawable.usvimg,R.drawable.compareimg,R.drawable.payhistoryimg,R.drawable.usvimg};;

                        if (position > 0) {
                            ImageView im = new ImageView(getApplicationContext());
                            im.setBackgroundResource(image[--position]);
                            slider.addView(im);
                            slider.showPrevious();
                            header.setText(text[position]);
                            desc.setText(textList[position]);
                        }
                    }
                });
            }
        });
    }
}