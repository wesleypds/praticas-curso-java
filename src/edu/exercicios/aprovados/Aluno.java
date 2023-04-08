package edu.exercicios.aprovados;

public class Aluno {
    private String nome;
    private float semestre1;
    private float semestre2;

    public Aluno(String nome, float semestre1, float semestre2) {
        this.nome = nome;
        this.semestre1 = semestre1;
        this.semestre2 = semestre2;
    }
    
    public String getNome() {
        return nome;
    }

    public float mediaDoAluno() {
        return (semestre1 + semestre2) / 2;
    }
}
