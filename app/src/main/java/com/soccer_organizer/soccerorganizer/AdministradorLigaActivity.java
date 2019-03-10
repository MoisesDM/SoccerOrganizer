package com.soccer_organizer.soccerorganizer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AdministradorLigaActivity extends AppCompatActivity{
    private Button registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dueno_liga);


        this.registrar=findViewById(R.id.btnRegistroLiga);
        this.registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),MenuDuenoLigaActivity.class);
                startActivity(intent);
            }

        });
    }
}

