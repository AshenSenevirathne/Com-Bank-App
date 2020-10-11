package com.example.combankapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class CategoryPSFrag extends Fragment {

    Button BtnTelephone, BtnWater, BtnInsurance, BtnEducation, BtnElectricity, BtnCreditCard, BtnPayTV;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_category_p_s, container, false);

        BtnTelephone = (Button) v.findViewById(R.id.btn_telephone);
        BtnWater = (Button) v.findViewById(R.id.btn_water);
        BtnInsurance = (Button) v.findViewById(R.id.btn_insurance);
        BtnEducation = (Button) v.findViewById(R.id.btn_education);
        BtnElectricity = (Button) v.findViewById(R.id.btn_electricity);
        BtnCreditCard = (Button) v.findViewById(R.id.btn_credit_card);
        BtnPayTV = (Button) v.findViewById(R.id.btn_pay_tv);
        BtnTelephone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Telephone", Toast.LENGTH_SHORT).show();
            }
        });
        BtnWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Water", Toast.LENGTH_SHORT).show();
            }
        });
        BtnInsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Insurance", Toast.LENGTH_SHORT).show();
            }
        });
        BtnEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Education", Toast.LENGTH_SHORT).show();
            }
        });
        BtnElectricity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Electricity", Toast.LENGTH_SHORT).show();
            }
        });
        BtnCreditCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Credit Card", Toast.LENGTH_SHORT).show();
            }
        });
        BtnPayTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Pay TV", Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }
}