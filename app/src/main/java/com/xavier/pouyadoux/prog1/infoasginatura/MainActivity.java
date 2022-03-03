package com.xavier.pouyadoux.prog1.infoasginatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        TextView myTextClick;

        myTextClick = findViewById(R.id.text_click);
        myTextClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Remplazar por tu codigo", Toast.LENGTH_LONG).show();
            }
        }); */


        Button mInfoAsignatura1 = (Button) findViewById(R.id.Asignatura1);
        mInfoAsignatura1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button mInfoAsignatura2 = (Button) findViewById(R.id.Asignatura2);
        mInfoAsignatura2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button mInfoAsignatura3 = (Button) findViewById(R.id.Asignatura3);
        mInfoAsignatura3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button mInfoAsignatura4 = (Button) findViewById(R.id.Asignatura4);
        mInfoAsignatura4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }


}