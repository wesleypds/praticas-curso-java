package edu.exercicios.contabancaria;

public class Conta {
    private final long TAXA_BANCARIA = 5;
    private long numeroDaConta;
    private String nomeDoTitular;
    private double saldo;
    
    public Conta(long numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }

    public Conta(long numeroDaConta, String nomeDoTitular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        depositar(depositoInicial);
    }

    public long getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public void sacar(double valor) {
        saldo = (saldo - valor) - TAXA_BANCARIA;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public String toString(){
        return "Conta: " + numeroDaConta + ", Titular: " + nomeDoTitular + ", Saldo: R$ " + saldo;
    }
}
