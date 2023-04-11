package edu.exercicios.pensionato;

public class Estudante {
    private String nome;
    private String email;
    private int numeroDoQuarto;
    
    public Estudante(String nome, String email, int numeroDoQuarto) {
        this.nome = nome;
        this.email = email;
        this.numeroDoQuarto = numeroDoQuarto;
    }

    @Override
    public String toString() {
        return "Numero do quarto: " + numeroDoQuarto + ", Estudante: " + nome + ", email: " + email;
    }
}
