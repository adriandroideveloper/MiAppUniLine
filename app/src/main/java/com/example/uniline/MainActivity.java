package com.example.uniline;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inet ();

        }


    public void siguiente (View view){
        Intent siguiente = new Intent(this, MainActivityPlataforma.class);
        startActivity(siguiente);



    }


    public void siguiente1 (View view){
        Intent siguiente1 = new Intent(this, MainActivityMyV.class);
        startActivity(siguiente1);

    }

    public void inet(){
        elements = new ArrayList<>();
        elements.add(new ListElement("Inicio de sesión", "Plataforma virtual UniValle.", "Ver"));
        elements.add(new ListElement("Cambio de contraseña", "Plataforma virtual UniValle.", "Ver"));
        elements.add(new ListElement("Foros", "Plataforma virtual UniValle.", "Ver"));
        elements.add(new ListElement("Tareas", "Plataforma virtual UniValle.", "Ver"));
        elements.add(new ListElement("Documentos", "Plataforma virtual UniValle.", "Ver"));
        elements.add(new ListElement("Recibir clases", "Plataforma virtual UniValle.", "Ver"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);


    }

}