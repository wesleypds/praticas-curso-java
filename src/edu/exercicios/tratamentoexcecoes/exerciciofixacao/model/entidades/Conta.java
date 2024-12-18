package edu.exercicios.tratamentoexcecoes.exerciciofixacao.model.entidades;

import edu.exercicios.tratamentoexcecoes.exerciciofixacao.model.excecoes.ContaExcecoes;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteDeSaque;

    public Conta() {
        saldo = 0.0;
    }

    public Conta(Integer numero, String titular, Double saldo, Double limiteDeSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteDeSaque = limiteDeSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteDeSaque() {
        return limiteDeSaque;
    }

    public void setLimiteDeSaque(Double limiteDeSaque) {
        this.limiteDeSaque = limiteDeSaque;
    }

    public void deposita(Double valor) {
        saldo += valor;
    }

    public void saca(Double valor) throws ContaExcecoes {
        if (valor > limiteDeSaque) {
            throw new ContaExcecoes("Erro no saque: O valor é maior que o limite de saque");
        }
        if (valor > saldo) {
            throw new ContaExcecoes("Erro no saque: O valor é maior que o saldo");
        }
        saldo -= valor;
    }
}
