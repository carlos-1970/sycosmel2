package com.example.sycosmel1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sycosmel1.Cliente.DAOException;
import com.example.sycosmel1.Cliente.UsuarioClienteDAO;

public class Principal2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal2);
    }
    public void Siguiente1(View view) {

        EditText nombre = (EditText) findViewById(R.id.nombre);
        EditText apellido = (EditText) findViewById(R.id.apellido);
        EditText correoelectronico = (EditText) findViewById(R.id.correoelectronico);
        EditText empresa = (EditText) findViewById(R.id.empresa);
        EditText direccion = (EditText) findViewById(R.id.direccion);
        EditText telefono = (EditText) findViewById(R.id.telefono);
        EditText contrasena = (EditText) findViewById(R.id.contrasena);

        UsuarioClienteDAO dao = new UsuarioClienteDAO(getBaseContext());
        try {
            //dao.eliminarTodos();
            dao.insertar(nombre.getText().toString(), apellido.getText().toString(), correoelectronico.getText().toString(), empresa.getText().toString(), direccion.getText().toString(), telefono.getText().toString(), contrasena.getText().toString());

            Toast toast= Toast.makeText(getApplicationContext(), "Se insertó correctamente", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL, 0, 0);
            toast.show();

            nombre.setText("");
            apellido.setText("");
            correoelectronico.setText("");
            empresa.setText("");
            direccion.setText("");
            telefono.setText("");
            contrasena.setText("");
        } catch (DAOException e) {
            Log.i("UsuarioClienteNuevoActi", "====> " + e.getMessage());
        }
        Intent i = new Intent (this,Principal1.class);
        startActivity(i);
    }
}