package com.soccer_organizer.soccerorganizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import Modelo.DatosJugadores;

public class RegistraJugadoresActivity extends AppCompatActivity {
    private EditText nombrej, apellidopj, apellidomj, posicion, numeroplayera, localidad, Calle;
    Button btnJugadorR;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registra_jugadore);
        this.nombrej = findViewById(R.id.TxtNombreJugador);
        this.apellidopj = findViewById(R.id.TxtApePaternoJu);
        this.apellidomj = findViewById(R.id.TxtApeMaternoJu);
        this.posicion = findViewById(R.id.TxtPosicionJu);
        this.numeroplayera = findViewById(R.id.TxtNumeroPlayera);
        this.localidad = findViewById(R.id.TxtLocalidadJu);
        this.Calle = findViewById(R.id.TxtCalleJu);
        this.btnJugadorR = findViewById(R.id.BtnRegistrarJu);


        btnJugadorR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jugador = nombrej.getText().toString();
                String apep = apellidopj.getText().toString();

                String apem = apellidomj.getText().toString();
                String pos = posicion.getText().toString();
                String num = numeroplayera.getText().toString();
                String locl = localidad.getText().toString();
                String calle = Calle.getText().toString();



                DatosJugadores dj = new DatosJugadores();
                dj.setNombrej(jugador);
                dj.setApellidoPaternoj(apep);
                dj.setAperllidoMaternoj(apem);
                dj.setPosicion(pos);
                dj.setNumero_playera(num);
                dj.setLocalidad(locl);
                dj.setCalle(calle);
                databaseReference.child("Jugadores").child(dj.getNombrej()).setValue(dj);
                Toast.makeText(RegistraJugadoresActivity.this, "Exito ", Toast.LENGTH_SHORT).show();
            }
        });


        inicializarFirebase();


    }

    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }


}
