package com.soccer_organizer.soccerorganizer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CanchasActivity extends AppCompatActivity {
    private Button btncanchas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canchas);

        this.btncanchas=findViewById(R.id.btnUbicacion);
        this.btncanchas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),UbicacionCanchas.class);
                startActivity(intent);
            }

        });

    }
}
