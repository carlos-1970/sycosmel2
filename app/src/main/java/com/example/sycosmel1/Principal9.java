package com.example.sycosmel1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Principal9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal9);
        final String[] horarios = new String[] { "21/03/2021.........17:45h",    "22/03/2021..........17:45h", "23/03/2021.............17:45h" };

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,    android.R.layout.simple_spinner_item, horarios);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner combo = (Spinner) findViewById(R.id.spinner);
        combo.setAdapter(adaptador);

        combo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {
                Toast.makeText(Principal9.this, "Seleccionado: " + horarios[position], Toast.LENGTH_LONG).show();
            }

            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Principal9.this, "No ha seleccionado",    Toast.LENGTH_LONG).show();
            }
        });
    }

    public void Siguiente8(View v){
        Intent i = new Intent (this,Principal8.class);
        startActivity(i);
    }
}