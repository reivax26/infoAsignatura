package com.xavier.pouyadoux.prog1.infoasginatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Picture;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class infoAsignatura extends AppCompatActivity {
    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_asignatura);

      datos = getIntent().getExtras();

      int opcion = datos.getInt("Asignatura");

        switch (opcion) {

            case 1:
                TextView titulo = findViewById(R.id.Titulo);
                titulo.setText(R.string.TitelAsig1);

                ImageView imageView = findViewById(R.id.Picture);
                imageView.setImageResource(R.drawable.historiadelarte);
                break;

            case 2:
                titulo = findViewById(R.id.Titulo);
                titulo.setText(R.string.TitelAsig2);

                ImageView imageView2 = findViewById(R.id.Picture);
                imageView2.setImageResource(R.drawable.dibujotecnico);
                break;
            case 3:
                titulo = findViewById(R.id.Titulo);
                titulo.setText(R.string.TitelAsig3);

                ImageView imageView3 = findViewById(R.id.Picture);
                imageView3.setImageResource(R.drawable.informatica);
                break;
        }

        Button mVolverMain = (Button) findViewById(R.id.button1);
        mVolverMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VolverAlPrincipio(view);

            }
        });
    }

    public void VolverAlPrincipio(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}