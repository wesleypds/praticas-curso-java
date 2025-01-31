package edu.praticas.herancaepolimorfismo.produtos.model;

public class ProdutoImportado extends Produto {
    private Double taxaImportacao;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    public Double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(Double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public Double precoTotal() {
        return super.getPreco() + taxaImportacao;
    }

    @Override
    public String etiquetaDePreco() {
        return super.getNome() + " R$ " +
                String.format("%.2f", precoTotal()) +
                String.format(" (Taxa de importação %.2f)", taxaImportacao);
    }
}
