package com.soccer_organizer.soccerorganizer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
        intent.putExtra("codigo",creaCodigo());
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
        Intent intent = new Intent(getApplication(),MapsActivity.class);
        startActivity(intent);
    }
});
    }
    public String creaCodigo(){
        char[] elementos={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','F','G','H','I','J','K','L','M','N','O',
        'P','Q','R','S','T','W','X','Y','Z'};
        char[] conjunto= new char[8];
        String pass;
        for (int i=0;i<8;i++){
            conjunto[i]= elementos[(int)(Math.random()*20)];
        }
        pass=new String(conjunto);
        return pass;
    }
}
