package com.example.opet.victorexer1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText maximo;
    private EditText pedido;
    private TextView resultado;
    float salvo;
    float matematica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maximo = findViewById(R.id.valorM);
        pedido = findViewById(R.id.valorT);
        resultado = findViewById(R.id.resultado);
    }

    public void calculo(View v) {
        String p   = pedido.getText().toString();
        float atual = Float.parseFloat(p);

        String m   = maximo.getText().toString();
        float maximoVar = Float.parseFloat(m);

        salvo = salvo + atual;
        matematica =  maximoVar - salvo ;

        if(salvo > maximoVar){

            resultado.setText("Você passou do seu limite. Maximo:" + maximoVar + ",atual:" + salvo);
        } else{
            resultado.setText("Você pode gastar:"+ matematica);
        }

    }
}
