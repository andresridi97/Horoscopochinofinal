package com.example.horoscopo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etn, etc, ete, nd, nm, na;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etn = (EditText)findViewById(R.id.txt_nombre);
        etc = (EditText)findViewById(R.id.txt_cuenta);
        ete = (EditText)findViewById(R.id.txt_correo);
        nd = (EditText)findViewById(R.id.dia);
        na = (EditText)findViewById(R.id.vt11);
        nm = (EditText)findViewById(R.id.mes);
    }
    public void Resultados(View view) {
        String nombre = etn.getText().toString();
        String cuenta = etc.getText().toString();
        String correo = ete.getText().toString();
        String ndia = nd.getText().toString();
        String nmes = nm.getText().toString();
        String nano = na.getText().toString();

        int num_dia =Integer.parseInt(ndia);
        int num_mes =Integer.parseInt(nmes);
        int num_ano =Integer.parseInt(nano);


        if (nombre.length() == 0) {
            Toast.makeText(MainActivity.this, getApplicationContext().getString(R.string.nombre), Toast.LENGTH_SHORT).show();
        }
        if (cuenta.length() == 0) {
            Toast.makeText(MainActivity.this, getApplicationContext().getString(R.string.ncuen), Toast.LENGTH_SHORT).show();
        }else if (cuenta.length()  != 10) {
            Toast.makeText(MainActivity.this, getApplicationContext().getString(R.string.ncuen10), Toast.LENGTH_SHORT).show();
        }
        if (correo.length() == 0) {
            Toast.makeText(MainActivity.this, getApplicationContext().getString(R.string.ingresae), Toast.LENGTH_SHORT).show();
        }
        if (ndia.length() == 0){
            Toast.makeText(MainActivity.this, getApplicationContext().getString(R.string.ndia), Toast.LENGTH_SHORT).show();
        }else if (num_dia < 1 || num_dia > 31){
            Toast.makeText(MainActivity.this, getApplicationContext().getString(R.string.ndiav), Toast.LENGTH_SHORT).show();
        }

        if (nmes.length() == 0){
            Toast.makeText(MainActivity.this, getApplicationContext().getString(R.string.nmes), Toast.LENGTH_SHORT).show();
        }else if (num_mes > 12 || num_mes < 1){
            Toast.makeText(MainActivity.this, getApplicationContext().getString(R.string.nmesv), Toast.LENGTH_SHORT).show();
        }

        if (nano.length() == 0) {
            Toast.makeText(MainActivity.this, getApplicationContext().getString(R.string.nano), Toast.LENGTH_SHORT).show();
        }else if (num_ano > 2020 || num_ano < 1913) {
            Toast.makeText(MainActivity.this, getApplicationContext().getString(R.string.nanov), Toast.LENGTH_SHORT).show();
        }
        if (cuenta.length() == 10 && nombre.length() != 0 && correo.length() != 0 && ndia.length() != 0 && nmes.length() != 0 && nano.length() != 0 && (num_dia >0 && num_dia < 32) && (num_mes > 0 && num_mes < 13) && num_ano <2020 && num_ano > 1912 ) {
            Intent i = new Intent(this, Actvidad2.class);
            i.putExtra("dias", nd.getText().toString());
            i.putExtra("meses", nm.getText().toString());
            i.putExtra("años", na.getText().toString());
            startActivity(i);
        }
    }


}
