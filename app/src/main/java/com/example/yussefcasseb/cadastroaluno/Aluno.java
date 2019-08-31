package com.example.yussefcasseb.cadastroaluno;

public class Aluno {

    private String nome;
    private String ra;
    private String turma;
    private String email;
    private String fone;
    private String alert = "";


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
            if(!nome.isEmpty()){
                this.nome = nome;
            } else {
                this.alert = "Nome Não Preenchido";
            }
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        if(!ra.isEmpty()){
            this.ra = ra;
        } else {
            this.alert = "RA Não Preenchido";
        }
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        if(!turma.isEmpty()){
            this.turma = turma;
        } else {
            this.alert = "Turma Não Preenchido";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.isEmpty()){
            this.email = email;
        } else {
            this.alert = "Email Não Preenchido";
        }
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        if(!fone.isEmpty()){
            this.fone = fone;
        } else {
            this.alert = "Telefone Não Preenchido";
        }
    }

    public String getAlert() {
        return alert;
    }
}
