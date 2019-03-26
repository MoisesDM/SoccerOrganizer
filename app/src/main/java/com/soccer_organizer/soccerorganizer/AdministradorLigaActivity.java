package com.soccer_organizer.soccerorganizer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

import Modelo.DatosAdministradorLiga;

public class AdministradorLigaActivity extends AppCompatActivity{
    private Button registrar;
    private TextView tvcodigo;
    private EditText etnombre,etcategoria,etzona;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dueno_liga);

        this.tvcodigo=findViewById(R.id.tvCodigo);
        this.etcategoria=findViewById(R.id.etCategoria);
        this.etnombre=findViewById(R.id.EtNombre);
        this.etzona=findViewById(R.id.etZona);



        Intent intent=getIntent();
        this.tvcodigo.setText(intent.getExtras().getString("codigo"));

        this.registrar=findViewById(R.id.btnRegistroLiga);
        this.registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre=etnombre.getText().toString();
                String categoria=etcategoria.getText().toString();
                String zona=etzona.getText().toString();
                String codg=tvcodigo.getText().toString();
                Intent intent = new Intent(getApplication(),MenuDuenoLigaActivity.class);
                DatosAdministradorLiga d=new DatosAdministradorLiga();
                d.setCodigo(codg);
                d.setNombreLiga(nombre);
               d.setCategoria(categoria);
               d.setZona(zona);
                databaseReference.child("Liga").child(d.getCodigo()).setValue(d);
                Toast.makeText(AdministradorLigaActivity.this,"Agregado",Toast.LENGTH_SHORT).show();

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

