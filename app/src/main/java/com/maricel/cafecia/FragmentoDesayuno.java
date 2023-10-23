package com.maricel.cafecia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoDesayuno extends Fragment {
    View view;
    Button primerboton;
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragmento_desayuno, container, false);

        primerboton = (Button) view.findViewById(R.id.btnDesayuno);
        primerboton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity(),"Descarngando",Toast.LENGTH_LONG).show();



            }

        });
        return view;
    }
}



