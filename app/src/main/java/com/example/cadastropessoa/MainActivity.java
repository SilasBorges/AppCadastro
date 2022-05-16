package com.example.cadastropessoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editNome;
    private EditText editEmail;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editNome);
        editEmail = findViewById(R.id.editEmail);
        resultado = findViewById(R.id.textResultado);
    }

    public void enviar(View view){

        String nome = editNome.getText().toString();
        String email = editEmail.getText().toString();

        Pessoa pessoa = new Pessoa(nome, email);
        resultado.setText(pessoa.toString());

        editNome.setText("");
        editEmail.setText("");


    }

}