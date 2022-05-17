package com.example.cadastropessoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editNome;
    private EditText editEmail;
    private TextView resultado, resultadoSexo;
    private RadioButton radioButtonM, radioButtonF;
    private RadioGroup radioSexo;
    String texto = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome      = findViewById(R.id.editNome);
        editEmail     = findViewById(R.id.editEmail);
        resultado     = findViewById(R.id.textResultado);
        resultadoSexo = findViewById(R.id.resultadoSexo);
        radioButtonM  = findViewById(R.id.radioButtonM);
        radioButtonF  = findViewById(R.id.radioButtonF);
        radioSexo     = findViewById(R.id.radioGroupSexo);

        radioButton();
    }

    public void radioButton(){

        radioSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if( checkedId == R.id.radioButtonM){
                    resultadoSexo.setText("Masculino");
                }
                else if( checkedId == R.id.radioButtonF){
                    resultadoSexo.setText("Feminino");
                }
            }
        });
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