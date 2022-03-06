package com.xavier.pouyadoux.prog1.infoasginatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class infoAsignatura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_asignatura);
    }



    public void VolverAlPrincipio(View view) {
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }
}