package com.example.hirob.trabalhoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    private EditText nome;
    private EditText vencimento;
    private EditText limite;
    private Cartao cartao = new Cartao();

//asd sadsa dasdasdasdas asdasdsa

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nome = (EditText) findViewById(R.id.editTextBandeira);
        vencimento = (EditText) findViewById(R.id.editTextVencimento);
        limite = (EditText) findViewById(R.id.editTextLimite);

        cartao.setNome(String.valueOf(nome.getText()));
        cartao.setLimite(Double.parseDouble(String.valueOf(limite.getText())));
        cartao.setVencimento(String.valueOf(vencimento.getText()));

        Intent it = new Intent(this, Main3Activity.class);





    }
}
