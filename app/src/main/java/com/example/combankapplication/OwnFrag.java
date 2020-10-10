package com.example.combankapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class OwnFrag extends Fragment {
    Button btnSubmit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

//        Spinner DebitSp = (Spinner) getView().findViewById(R.id.debit_spinner);
//        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this.getActivity(), R.array.account_array,
//                android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        DebitSp.setAdapter(adapter);

        View v = inflater.inflate(R.layout.fragment_own, container, false);

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

        btnSubmit = (Button) v.findViewById(R.id.btn_submit);
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