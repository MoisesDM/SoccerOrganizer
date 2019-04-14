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

import Modelo.DatosDueñodelequipo;

public class BienvenidoDtDueActivity extends AppCompatActivity {
    Button registro;
    EditText codigoL, nombreE, nombreDT, apellidop, Apellidom;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido_dt_du);
        this.codigoL = findViewById(R.id.TxtCodigoLiga);
        this.nombreE = findViewById(R.id.TxtNombreEquipo);
        this.nombreDT = findViewById(R.id.TxtNombreDueODt);
        this.apellidop = findViewById(R.id.TxtApePaternoJu);
        this.Apellidom = findViewById(R.id.TxtApeMaternoJu);


        this.registro = findViewById(R.id.BtnRegistrar);
        this.registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Liga = codigoL.getText().toString().trim();
                String Equipo = nombreE.getText().toString().trim();
                String Dueño = nombreDT.getText().toString().trim();
                String Apellidopaterno = apellidop.getText().toString().trim();
                String ApellidoMaterno = Apellidom.getText().toString().trim();

                DatosDueñodelequipo dt=new DatosDueñodelequipo();
                dt.setCodigoLiga(Liga);
                dt.setNombreDT(Dueño);
                dt.setNombreEquipo(Equipo);
                dt.setApellido_paterno(Apellidopaterno);
                dt.setApellido_materno(ApellidoMaterno);
                databaseReference.child("Equipos").child(dt.getNombreDT()).setValue(dt);
                Toast.makeText(BienvenidoDtDueActivity.this, "Exito ", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplication(), MenuDTActivity.class);
                intent.putExtra("codigoLiga",Liga);
                intent.putExtra("Equipo",Equipo);
                startActivity(intent);
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
