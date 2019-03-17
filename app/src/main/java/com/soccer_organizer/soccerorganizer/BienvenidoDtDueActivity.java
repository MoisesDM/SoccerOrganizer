package com.soccer_organizer.soccerorganizer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BienvenidoDtDueActivity extends AppCompatActivity {
Button registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido_dt_du);
        this.registro=findViewById(R.id.BtnRegistrar);
        this.registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),MenuDTActivity.class);
                startActivity(intent);
            }
        });
    }
}
