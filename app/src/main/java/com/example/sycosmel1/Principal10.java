package com.example.sycosmel1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sycosmel1.Equipo.DAOException;
import com.example.sycosmel1.Equipo.EquipoClienteDAO;

public class Principal10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal10);
    }
    public void Siguiente4(View view){

        EditText tipo = (EditText) findViewById(R.id.tipo);
        EditText marca = (EditText) findViewById(R.id.marca);
        EditText modelo = (EditText) findViewById(R.id.modelo);
        EditText serie = (EditText) findViewById(R.id.serie);
        EditText ubicacion = (EditText) findViewById(R.id.ubicacion);
        EditText contador = (EditText) findViewById(R.id.contador);

        EquipoClienteDAO dao = new EquipoClienteDAO(getBaseContext());
        try {
            //dao.eliminarTodos();
            dao.insertar(tipo.getText().toString(), marca.getText().toString(), modelo.getText().toString(), serie.getText().toString(), ubicacion.getText().toString(), contador.getText().toString());

            Toast toast= Toast.makeText(getApplicationContext(), "Se insertó correctamente", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL, 0, 0);
            toast.show();

            tipo.setText("");
            marca.setText("");
            modelo.setText("");
            serie.setText("");
            ubicacion.setText("");
            contador.setText("");
        } catch (DAOException e) {
            Log.i("EquipoClienteNuevoActi", "====> " + e.getMessage());
        }
        Intent i = new Intent (this,Principal4.class);
        startActivity(i);
    }
}