package edu.praticas.classesemetodosabstratos.pessoafisicapessoajuridica.model;

import edu.praticas.classesemetodosabstratos.pessoafisicapessoajuridica.enums.TipoPessoa;

public class PessoaJuridica extends Pessoa {
    private Integer numeroFuncionarios;

    public PessoaJuridica() {
        super();
    }
    
    public PessoaJuridica(String nome, Double rendaAnual, TipoPessoa tipoPessoa, Integer numeroFuncionarios) {
        super(nome, rendaAnual, tipoPessoa);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double impostoPago() {
        if (getNumeroFuncionarios() <= 10) {
            return getRendaAnual() * 0.16;
        } else {
            return getRendaAnual() * 0.14;
        }
    }
}
