package com.example.sycosmel1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Principal1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal1);
    }

    public void Siguiente2(View v){
        Intent i = new Intent (this,Principal2.class);
        startActivity(i);
    }

    public void Siguiente3(View v){
        Intent i = new Intent (this,Principal3.class);
        startActivity(i);
    }

    public void Siguiente4(View v){
        Intent i = new Intent (this,Principal4.class);
        startActivity(i);
    }

    public void Siguiente5(View v){
        Intent i = new Intent (this,Principal5.class);
        startActivity(i);
    }

    public void Siguiente6(View v){
        Intent i = new Intent (this,Principal6.class);
        startActivity(i);
    }

}