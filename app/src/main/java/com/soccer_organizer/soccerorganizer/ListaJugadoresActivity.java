package com.soccer_organizer.soccerorganizer;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import Modelo.DatosJugadores;

import static android.R.layout.simple_list_item_1;

public class ListaJugadoresActivity extends AppCompatActivity {
    private List<DatosJugadores> listaJ=new ArrayList<DatosJugadores>();
    ArrayAdapter<DatosJugadores> arrayAdapterPersona;
    ListView listV_perosnas;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    DatosJugadores JugadorSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_jugadores);
        inicializarFirebase();
        listarDatos();
        listV_perosnas=findViewById(R.id.lv_datosPersonas);
    }




    private void listarDatos() {
        databaseReference.child("Jugadores").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                listaJ.clear();
                for (DataSnapshot objSnaptshot : dataSnapshot.getChildren()) {
                    DatosJugadores p = objSnaptshot.getValue(DatosJugadores.class);
                       listaJ.add(p);
                    arrayAdapterPersona= new ArrayAdapter<DatosJugadores>(ListaJugadoresActivity.this, simple_list_item_1,listaJ);
                    listV_perosnas.setAdapter(arrayAdapterPersona);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }



    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase=FirebaseDatabase.getInstance();
        //  firebaseDatabase.setPersistenceEnabled(true);
        databaseReference=firebaseDatabase.getReference();
    }
}
