package com.soccer_organizer.soccerorganizer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuDuenoLigaActivity  extends AppCompatActivity {
    private Button canchas;
    private Button roles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dueno_liga);

        this.canchas=findViewById(R.id.btnCanchas);
        this.canchas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),CanchasActivity.class);
                startActivity(intent);
            }

        });


        this.roles=findViewById(R.id.btnRoles);
        this.roles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),AdministradorRolesActivity.class);
                startActivity(intent);
            }

        });
    }
}
