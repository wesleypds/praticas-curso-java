package edu.exercicios.introducaopoo.funcionario;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double taxa;

    public Funcionario(String nome, double salarioBruto, double taxa) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;
    }

    public double salarioLiquido(){
        return salarioBruto - taxa;
    }
    
    public double novoSalario(Double porcentagem){
        return (salarioBruto + (salarioBruto * (porcentagem/100.0))) - taxa;
    }

    public String getNome() {
        return nome;
    }
}
