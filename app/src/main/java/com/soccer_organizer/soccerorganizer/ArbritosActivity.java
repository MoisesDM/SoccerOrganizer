package com.soccer_organizer.soccerorganizer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

import Modelo.DatosArbitros;

public class ArbritosActivity extends AppCompatActivity {
    private Button RegistrarA;
    private EditText nomb, app, apm, edad, localidad, calle;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arbritos);


        this.nomb = findViewById(R.id.edNombA);
        this.app = findViewById(R.id.edapp);
        this.apm = findViewById(R.id.edapm);
        this.edad = findViewById(R.id.etedad);
        this.localidad = findViewById(R.id.edlocalidad);
        this.calle = findViewById(R.id.edCalle);
        this.RegistrarA = findViewById(R.id.btnResgistrarA);


        RegistrarA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                String liga=intent.getExtras().getString("codigo");
                String nom = nomb.getText().toString();
                String apellidop = app.getText().toString();
                String apellidom = apm.getText().toString();
                int Edad = Integer.parseInt(edad.getText().toString());
                String Localidad = localidad.getText().toString();
                String Calle = calle.getText().toString();


                DatosArbitros Arbitro = new DatosArbitros();
                Arbitro.setId(UUID.randomUUID().toString());
                Arbitro.setCodigoLiga(liga);
                Arbitro.setNombre(nom);
                Arbitro.setApellidop(apellidop);
                Arbitro.setApellidom(apellidom);
                Arbitro.setEdad(Edad);
                Arbitro.setLocalidad(Localidad);
                Arbitro.setCalle(Calle);

                databaseReference.child("Arbitros").child(Arbitro.getId()).setValue(Arbitro);
                Toast.makeText(ArbritosActivity.this, "Exito ", Toast.LENGTH_SHORT).show();
            }
        });
        inicializarFirebase();

    }
    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference();
    }

}
