package edu.exercicios.herancaepolimorfismo.upcastingedowncasting.model;

public class ContaEmpresarial extends Conta {
    private Double limiteEmprestimo;

    public ContaEmpresarial() {
        super();
    }

    public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return this.limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(Double valor) {
        if (valor <= this.limiteEmprestimo) {
            this.saldo += valor - 10.0;
        }
    }
}