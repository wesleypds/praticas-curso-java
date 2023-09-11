package edu.exercicios.classesemetodosabstratos.pessoafisicapessoajuridica.model;

import edu.exercicios.classesemetodosabstratos.pessoafisicapessoajuridica.enums.TipoPessoa;

public class PessoaFisica extends Pessoa {
    private Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, TipoPessoa tipoPessoa, Double gastosSaude) {
        super(nome, rendaAnual, tipoPessoa);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double impostoPago() {
        if (getRendaAnual() < 20000.0) {
            if (getGastosSaude() > 0) {
                return (getRendaAnual() * 0.15) - (getGastosSaude() * 0.5);
            } else {
                return getRendaAnual() * 0.15;
            }
        } else {
            if (getGastosSaude() > 0) {
                return (getRendaAnual() * 0.25) - (getGastosSaude() * 0.5);
            } else {
                return getRendaAnual() * 0.25;
            }
        }
    }
}
