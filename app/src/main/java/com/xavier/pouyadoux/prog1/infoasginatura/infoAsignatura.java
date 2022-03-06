package com.xavier.pouyadoux.prog1.infoasginatura;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Picture;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class infoAsignatura extends AppCompatActivity {
    Bundle datos;
    ArrayList<String> listDatos;
    RecyclerView recycler;

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

                TextView info = findViewById(R.id.infoAsigActivity2);
                info.setText(R.string.AllInfoAsig1);

                recycler=(RecyclerView) findViewById(R.id.Recyclerid);
                recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

                listDatos= new ArrayList<String>();

                listDatos.add("- Comprender la evolución histórica del concepto del arte.");
                listDatos.add("- Conocer los diferentes periodos históricos del arte, los acontecimientos más importantes y  sus artistas más influyentes.");
                listDatos.add("- Identificar las técnicas, procesos y herramientas más usadas para la creación de obras de carácter pictórico, escultórico o fotográfico.");
                listDatos.add("- Aplicar las técnicas y métodos asociados a la creación de obras de arte de diversa naturaleza.");
                listDatos.add("- Diseñar planes que permitan incluir los procesos asociados al arte, para potenciar la salud y el desarrollo individual humano.");


                AdapterDatos adapter = new AdapterDatos(listDatos);
                recycler.setAdapter(adapter);
                break;

            case 2:
                titulo = findViewById(R.id.Titulo);
                titulo.setText(R.string.TitelAsig2);

                ImageView imageView2 = findViewById(R.id.Picture);
                imageView2.setImageResource(R.drawable.dibujotecnico);

                TextView info2 = findViewById(R.id.infoAsigActivity2);
                info2.setText(R.string.AllInfoAsig2);


                recycler=(RecyclerView) findViewById(R.id.Recyclerid);
                recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

                listDatos= new ArrayList<String>();

                listDatos.add("- Comprender la aplicación de los cubos en perspectivas en el dibujo constructivo.");
                listDatos.add("- Asimilar los principios básicos de la geometría y aplicar trazados fundamentales en el plano.");
                listDatos.add("- Dominar las transformaciones geométricas elementales.");
                listDatos.add("- Representar cuerpos y espacios simples mediante el uso de la perspectiva y las proporciones de las superficies.");
                listDatos.add("- Dibujar perspectivas cónicas, a partir de sus representaciones diédricas, interpretando correctamente la posición del punto de vista y los planos.");


                AdapterDatos adapter2 = new AdapterDatos(listDatos);
                recycler.setAdapter(adapter2);
                break;
            case 3:
                titulo = findViewById(R.id.Titulo);
                titulo.setText(R.string.TitelAsig3);

                ImageView imageView3 = findViewById(R.id.Picture);
                imageView3.setImageResource(R.drawable.informatica);

                TextView info3 = findViewById(R.id.infoAsigActivity2);
                info3.setText(R.string.AllInfoAsig1);

                recycler=(RecyclerView) findViewById(R.id.Recyclerid);
                recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

                listDatos= new ArrayList<String>();

                listDatos.add("- Entender los principios de la computación y su evolución a través del tiempo.");
                listDatos.add("- Reconocer los principales componentes de un computador.");
                listDatos.add("- Comprender la complejidad de los sistemas operativos.");
                listDatos.add("- Dominar las funcionalidades, herramientas y procesos del escritorio de Windows.");
                listDatos.add("- Conocer los campos de aplicación y la naturaleza del software Excel.");


                AdapterDatos adapter3 = new AdapterDatos(listDatos);
                recycler.setAdapter(adapter3);
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