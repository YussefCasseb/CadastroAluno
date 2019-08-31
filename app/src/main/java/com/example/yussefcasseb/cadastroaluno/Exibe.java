package com.example.yussefcasseb.cadastroaluno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Exibe extends AppCompatActivity {

    public static ArrayList<Aluno> valores = new ArrayList<Aluno>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new AlunoAdapter(this, valores);
        listView.setAdapter(adapter);
    }
}
