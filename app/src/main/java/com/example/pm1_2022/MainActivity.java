package com.example.pm1_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtnombre, txtapellidos, txtedad, txtcorreo;
    Button btnmostrar,btnsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = (EditText) findViewById(R.id.txtnombre);
        txtapellidos = (EditText) findViewById(R.id.txtapellidos);
        txtedad = (EditText) findViewById(R.id.txtedad);
        txtcorreo = (EditText) findViewById(R.id.txtcorreo);
        btnmostrar = (Button) findViewById(R.id.btnmostrar);
        btnsecond = (Button) findViewById(R.id.btnsecond);


        btnmostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Informacion Guardada Exitosamente",Toast.LENGTH_LONG).show();
            }
        });

        btnsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("nombre", txtnombre.getText().toString());
                intent.putExtra("apellido", txtapellidos.getText().toString());
                intent.putExtra("edad", txtedad.getText().toString());
                intent.putExtra("correo", txtcorreo.getText().toString());

                startActivity(intent);
            }
        });


    }
}