package com.example.pm1_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pm1_2022.Procesos.SQLiteConexion;
import com.example.pm1_2022.Procesos.Transacciones;

public class ActrivityCrear extends AppCompatActivity {

    Button btnagregar;
    EditText txtnombres,txtapellido,txtage,txtmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actrivity_crear);

        /*Casteo de elementos de la interfaz grafica*/
        init();

        btnagregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AgregarEmpleado();
            }


        });
    }

    private void init(){
        txtnombres = (EditText) findViewById(R.id.txtnombres);
        txtapellido = (EditText) findViewById(R.id.txtapellido);
        txtage = (EditText) findViewById(R.id.txtage);
        txtmail = (EditText) findViewById(R.id.txtmail);
        btnagregar = (Button) findViewById(R.id.btnagregar);

    }

    private void AgregarEmpleado() {
        /*Conexion*/
        SQLiteConexion conexion = new SQLiteConexion( this, Transacciones.NameDataBase, null, 1);
        SQLiteDatabase db = conexion.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(Transacciones.nombres,txtnombres.getText().toString());
        valores.put(Transacciones.apellidos,txtapellido.getText().toString());
        valores.put(Transacciones.edad,txtage.getText().toString());
        valores.put(Transacciones.correo,txtmail.getText().toString());

        Long resultado = db.insert(Transacciones.tablaEmpleados, Transacciones.id, valores);


        Toast.makeText(getApplicationContext(), "Registro Insertado", Toast.LENGTH_LONG).show();

        db.close();

        clearScreen();

    }

    private void clearScreen()
    {
        txtnombres.setText("");
        txtapellido.setText("");
        txtage.setText("");
        txtmail.setText("");
    }
}