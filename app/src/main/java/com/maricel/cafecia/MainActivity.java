package com.maricel.cafecia;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    Button Primerboton, Segundoboton, Tercerboton;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        Primerboton = (Button) findViewById(R.id.btnPrimerboton);
        Segundoboton = (Button) findViewById(R.id.btnSegundoboton);
        Tercerboton = (Button) findViewById(R.id.btnTercerboton);

        Primerboton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                cargarFragmento(new FragmentoDesayuno());
            }
        });
        Segundoboton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                cargarFragmento(new FragmentoAlmuerzo());
            }
        });
        Tercerboton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                cargarFragmento(new FragmentoCena());
            }
        });

    }

    private void cargarFragmento(Fragment fragmento){
        FragmentManager manager = this.getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.frameLayout, fragmento).commit();


    }
}

