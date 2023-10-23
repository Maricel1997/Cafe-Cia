package com.maricel.cafecia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoAlmuerzo extends Fragment {
    View view;
    Button segundoboton;
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragmento_almuerzo, container, false);

        segundoboton = (Button) view.findViewById(R.id.btnAlmuerzo);
        segundoboton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity(),"Desacrgando",Toast.LENGTH_LONG).show();



            }

        });
        return view;
    }
}




