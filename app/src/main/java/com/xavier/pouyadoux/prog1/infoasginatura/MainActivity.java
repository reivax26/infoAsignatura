package com.xavier.pouyadoux.prog1.infoasginatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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



        Button mInfoAsignatura1 = (Button) findViewById(R.id.button1);
        mInfoAsignatura1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        Button mInfoAsignatura2 = (Button) findViewById(R.id.button2);
        mInfoAsignatura2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button mInfoAsignatura3 = (Button) findViewById(R.id.button3);
        mInfoAsignatura3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }

    public void MoreInfoAsignatura(View view){
        Intent intent = new Intent(this , infoAsignatura.class);
        startActivity(intent);

    }

}