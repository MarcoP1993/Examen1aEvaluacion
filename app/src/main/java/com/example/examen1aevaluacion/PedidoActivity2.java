package com.example.examen1aevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PedidoActivity2 extends AppCompatActivity {

    EditText edt_codigo = null;
    TextView txt_hamburguesa = null;
    TextView txt_complemento = null;
    TextView txt_cupon = null;
    TextView txt_iva = null;
    TextView txt_total = null;
    double precioc;
    double precioh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido2);
        edt_codigo = (EditText)findViewById(R.id.edt_codigo);
        txt_hamburguesa = (TextView) findViewById(R.id.txt_hamburguesa);
        txt_complemento = (TextView) findViewById(R.id.txt_complemento);
        txt_cupon = (TextView) findViewById(R.id.txt_cupon);
        txt_iva = (TextView) findViewById(R.id.txt_iva);
        txt_total = (TextView) findViewById(R.id.txt_total);

        Intent intent = getIntent();
        String hamburguesa = intent.getStringExtra(MainActivity.EXTRAHAMBURGUESA);
        String complemento = intent.getStringExtra(MainActivity.EXTRAPEDIDO);

        if(complemento.equalsIgnoreCase("patatas")){
             precioc = 2.0;
        }
        if(complemento.equalsIgnoreCase("Coca cola")){
             precioc = 2.5;
        }
        if(hamburguesa.equalsIgnoreCase("McPollo")){
            precioh = 3.0;
        }
        if(hamburguesa.equalsIgnoreCase("McPollo")){
            precioh = 5.0;
        }


    }

    public void aplicar(View view) {
    }
}