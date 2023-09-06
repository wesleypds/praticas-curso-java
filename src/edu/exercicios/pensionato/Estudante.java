package edu.exercicios.pensionato;

public class Estudante {
    private String nome;
    private String email;
    
    public Estudante(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudante: " + nome + ", email: " + email;
    }
}
