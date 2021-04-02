package com.example.sycosmel1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Principal4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal4);
        final String[] fallas = new String[] { "no enciende",  "no imprime",  "no escanea", "impresiones manchadas","trabamiento de hojas" };

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,    android.R.layout.simple_spinner_item, fallas);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner combo = (Spinner) findViewById(R.id.spinner);
        combo.setAdapter(adaptador);

        combo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {
                Toast.makeText(Principal4.this, "Seleccionado: " + fallas[position], Toast.LENGTH_LONG).show();
            }

            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Principal4.this, "No ha seleccionado",    Toast.LENGTH_LONG).show();
            }
        });
    }

    public void Siguiente9(View v){
        Intent i = new Intent (this,Principal9.class);
        startActivity(i);
    }
    public void Siguiente10(View v){
        Intent i = new Intent (this,Principal10.class);
        startActivity(i);
    }
}