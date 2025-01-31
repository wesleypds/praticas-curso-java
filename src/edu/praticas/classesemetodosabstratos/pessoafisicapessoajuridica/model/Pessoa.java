package edu.praticas.classesemetodosabstratos.pessoafisicapessoajuridica.model;

import edu.praticas.classesemetodosabstratos.pessoafisicapessoajuridica.enums.TipoPessoa;

public abstract class Pessoa {
    private String nome;
    private Double rendaAnual;
    private TipoPessoa tipoPessoa;

    protected Pessoa() {
    }

    protected Pessoa(String nome, Double rendaAnual, TipoPessoa tipoPessoa) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
        this.tipoPessoa = tipoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public abstract Double impostoPago();
}
