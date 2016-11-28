package com.example.andres.pokem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


  //variables
    private Button btnjugar;
    private Button btnlistar;
    private ImageView imgpokemon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnjugar=(Button)findViewById(R.id.btnjugar);
        btnlistar=(Button)findViewById(R.id.btnlistar);
        imgpokemon=(ImageView)findViewById(R.id.pokemon);


        //Accion de boton jugar

        btnjugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        //Acion de boton listar

        btnlistar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

// metodo para jugar

  public void  jugar(){







  }



}
