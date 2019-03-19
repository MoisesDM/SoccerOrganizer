package com.soccer_organizer.soccerorganizer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuDTActivity extends AppCompatActivity {
    Button partidos, jugadore, equipos, tabla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dt);
        this.partidos = findViewById(R.id.BtnRolesPartidos);
        this.jugadore = findViewById(R.id.BtnRegistroJugadores);
        this.equipos = findViewById(R.id.BtnEquipos);
        this.tabla = findViewById(R.id.BtnTablaPosiciones);
        this.partidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), AdministradorRolesActivity.class);
                startActivity(intent);
            }
        });
        this.jugadore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent
                        = new Intent(getApplication(), RegistraJugadoresActivity.class);
                startActivity(intent);
            }
        });

        this.equipos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent
                        = new Intent(getApplication(), ListaEquiposActivity.class);
                startActivity(intent);
            }
        });
        this.tabla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent
                        = new Intent(getApplication(), TablaGeneralActivity.class);
                startActivity(intent);
            }
        });
    }
}
