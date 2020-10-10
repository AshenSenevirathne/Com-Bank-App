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
    CardView cardFundTrn, cardPaySettl, contact, branches, userGui;
    private Button btn;
    private Dialog userGuide;
    private ViewFlipper slider;
    private ImageView back, stop, next;
    private TextView header, desc;
    private int position;
    private String textList[] = {
            "In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content",
            "2",
            "In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content",
            "4",
    };

    private String text[] = {
            "Sign Up",
            "Sign In",
            "Contact Us",
            "Inquiry",
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

                int image[] = {R.drawable.back_layout_1, R.drawable.back_layout_2, R.drawable.back_layout_3,R.drawable.back_layout_4};;

                position = 0;
                ImageView im = new ImageView(getApplicationContext());
                im.setBackgroundResource(image[position]);
                slider.addView(im);
                slider.setAutoStart(false);
                slider.setInAnimation(getApplicationContext(), android.R.anim.slide_in_left);
                slider.setOutAnimation(getApplicationContext(),android.R.anim.slide_out_right);
                header.setText(text[position]);
                desc.setText(textList[position]);

                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int image[] = {R.drawable.back_layout_1, R.drawable.back_layout_2, R.drawable.back_layout_3,R.drawable.back_layout_4};;

                        if(position < image.length - 1){
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
                        int image[] = {R.drawable.back_layout_1, R.drawable.back_layout_2, R.drawable.back_layout_3,R.drawable.back_layout_4};;

                        if(position > 0){
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