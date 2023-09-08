package edu.exercicios.introducaopoo.novosalario;

public class Funcionario {
    private int id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void novoSalario(int taxa) {
        salario = salario + (taxa*salario/100.0);
    }

    @Override
    public String toString() {
        return "Funcionario id: " + id + ", nome: " + nome + ", salario: " + salario;
    }
}
