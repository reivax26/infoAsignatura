package com.xavier.pouyadoux.prog1.infoasginatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button mInfoAsignatura1 = (Button) findViewById(R.id.button1);
        mInfoAsignatura1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MoreInfoAsignatura(view , 1);
            }
        });

        Button mInfoAsignatura2 = (Button) findViewById(R.id.button2);
        mInfoAsignatura2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MoreInfoAsignatura(view , 2);
            }
        });

        Button mInfoAsignatura3 = (Button) findViewById(R.id.button3);
        mInfoAsignatura3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MoreInfoAsignatura(view , 3);
            }
        });



    }

    public void MoreInfoAsignatura(View view , int i){
        Intent intent = new Intent(this , infoAsignatura.class);
        intent.putExtra("Asignatura",i);
        startActivity(intent);
    }

}