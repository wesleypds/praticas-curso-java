package edu.exercicios.introducaopoo.aluno;

public class Aluno {
    private String nome;
    private double notas[];

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public double mediaDoAluno(){
        return notas[0] + notas[1] + notas[2];
    }

    public String getNome(){
        return nome;
    }
}
