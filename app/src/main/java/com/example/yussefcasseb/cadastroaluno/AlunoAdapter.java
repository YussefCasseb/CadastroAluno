package com.example.yussefcasseb.cadastroaluno;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AlunoAdapter extends ArrayAdapter<Aluno> {
    private final Context context;
    private final ArrayList<Aluno> elementos;

    public AlunoAdapter(Context context, ArrayList<Aluno> elementos){
        super(context, R.layout.linha, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linha, parent, false);

        TextView tvNome = rowView.findViewById(R.id.Nome);
        TextView tvRa = rowView.findViewById(R.id.Ra);
        TextView tvTurma = rowView.findViewById(R.id.Turma);
        TextView tvEmail = rowView.findViewById(R.id.Email);

        tvNome.setText(elementos.get(position).getNome());
        tvRa.setText(elementos.get(position).getRa());
        tvTurma.setText(elementos.get(position).getTurma());
        tvEmail.setText(elementos.get(position).getEmail());

        return rowView;
    }
}
