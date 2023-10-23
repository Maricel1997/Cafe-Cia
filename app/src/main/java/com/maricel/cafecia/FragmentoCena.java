package com.maricel.cafecia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoCena extends Fragment {
    View view;
    Button tercerboton;
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragmento_cena, container, false);

        tercerboton = (Button) view.findViewById(R.id.btnCena);
        tercerboton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity(),"Descargando",Toast.LENGTH_LONG).show();



            }

        });
        return view;
    }
}



