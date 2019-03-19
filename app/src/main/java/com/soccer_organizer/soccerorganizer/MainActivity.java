package com.soccer_organizer.soccerorganizer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button menuduenoliga,dueño,jugador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
this.menuduenoliga=findViewById(R.id.btnDuenoLig);
this.dueño=findViewById(R.id.btnDueñoEquipo);
this.jugador=findViewById(R.id.button6);
this.menuduenoliga.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplication(),AdministradorLigaActivity.class);
        startActivity(intent);
    }

});

this.dueño.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplication(),BienvenidoDtDueActivity.class);
        startActivity(intent);
    }
});
this.jugador.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplication(),MenuJugadoresActivity.class);
        startActivity(intent);

    }
});

    }
}
