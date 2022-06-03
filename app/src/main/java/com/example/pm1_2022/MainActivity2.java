package com.example.pm1_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText txtresultado1, txtresultado2, txtresultado3, txtresultado4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtresultado1 = (EditText) findViewById(R.id.txtresultado);
        txtresultado2 = (EditText) findViewById(R.id.txtresultado2);
        txtresultado3 = (EditText) findViewById(R.id.txtresultado3);
        txtresultado4 = (EditText) findViewById(R.id.txtresultado4);


        txtresultado1.setText(getIntent().getExtras().getString("nombre"));
        txtresultado2.setText(getIntent().getExtras().getString("apellido"));
        txtresultado3.setText(getIntent().getExtras().getString("edad"));
        txtresultado4.setText(getIntent().getExtras().getString("correo"));

    }
}