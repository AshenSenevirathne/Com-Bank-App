package com.example.combankapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ThirdPartyFrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_third_party, container, false);
        View v = inflater.inflate(R.layout.fragment_third_party, container, false);

        String [] values =
                {"06472856096157","05728107836178","04579958863289","04278932446678"};
        Spinner spinner = (Spinner) v.findViewById(R.id.debit_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
//        ((TextView) v).setGravity(Gravity.CENTER);

        String [] values2 =
                {"06472856096157","05728107836178","04579958863289","04278932446678"};
        Spinner spinner2 = (Spinner) v.findViewById(R.id.credit_spinner);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values2);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner2.setAdapter(adapter2);

        String [] value3 =
                {"Bank of Ceylone","People's Bank","Sampath Bank"};
        Spinner spinner3 = (Spinner) v.findViewById(R.id.bank_sp);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, value3);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner3.setAdapter(adapter3);

        Button btnSubmit = (Button) v.findViewById(R.id.btn_submit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Successfully Transaction!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity().getApplication(), SuccessTransaction.class);
                startActivity(intent);
            }
        });
        return v;
    }
}