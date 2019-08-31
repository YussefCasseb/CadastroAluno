package com.example.yussefcasseb.cadastroaluno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cad(View view){
        Aluno alu = new Aluno();
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        EditText txtNome = findViewById(R.id.txtNome);
        EditText txtRA = findViewById(R.id.txtRA);
        EditText txtTurma = findViewById(R.id.txtTurma);
        EditText txtEmail = findViewById(R.id.txtEmail);
        EditText txtFone = findViewById(R.id.txtFone);

        alu.setNome(txtNome.getText().toString());
        alu.setRa(txtRA.getText().toString());
        alu.setTurma(txtTurma.getText().toString());
        alu.setEmail(txtEmail.getText().toString());
        alu.setFone(txtFone.getText().toString());

        if(alu.getAlert().length() == 0){
            alunos.add(alu);
            Exibe.valores = alunos;
            Intent intent = new Intent(getApplicationContext(), Exibe.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(), alu.getAlert(), Toast.LENGTH_SHORT).show();
        }
    }

}
