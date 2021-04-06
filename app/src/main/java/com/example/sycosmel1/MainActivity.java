//SYSCOMEL APP
package com.example.sycosmel1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// metodo de iniciar

    public void Siguiente1(View v){
        Intent i = new Intent (this,Principal1.class);
        startActivity(i);
    }



}

//VISTA MAIN VLADIMIR INCLUYE BOTON OLVIDASTE TU CONTRASEÑA (SELECT) CON MENSAJE
// DE ENVIADO A CORREO INDICADO