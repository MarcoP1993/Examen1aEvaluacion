package com.example.examen1aevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRAHAMBURGUESA = "com.example.examen1aEvaluacion";
    public static final String EXTRAPEDIDO = "pedido";
    EditText edt_hamburguesa = null;
    EditText edt_complemento = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_hamburguesa = (EditText) findViewById(R.id.edt_hamburguesa);
        edt_complemento = (EditText) findViewById(R.id.edt_complemento);
    }

    public void pedido(View view) {
        String hamburguesa = String.valueOf(edt_hamburguesa.getText());
        String complemento = String.valueOf(edt_complemento.getText());

        boolean validacion =validarcredenciales(hamburguesa,complemento);
        if(validacion)
        {
            Intent intent = new Intent(this, PedidoActivity2.class);
            intent.putExtra(EXTRAHAMBURGUESA, hamburguesa);
            intent.putExtra(EXTRAPEDIDO, complemento);
            startActivity(intent);
        }
        else
        {
            edt_hamburguesa.setError("Hamburguesa no disponible");
            Toast.makeText(this, "Hamburguesa no disponible",Toast.LENGTH_SHORT).show();

            edt_complemento.setError("Complemento no disponible");
            Toast.makeText(this,"Complemento no disponible", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validarcredenciales(String hamburguesa, String complemento) {
        if((hamburguesa.equalsIgnoreCase("McPollo") || hamburguesa.equalsIgnoreCase("XXL")) &&
                (complemento.equalsIgnoreCase("Patatas") || complemento.equalsIgnoreCase("Coca Cola")))
        {
            return true;
        }
        return false;
    }
}