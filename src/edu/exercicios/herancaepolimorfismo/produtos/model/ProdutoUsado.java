package edu.exercicios.herancaepolimorfismo.produtos.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
    private static SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataDeFabricacao;

    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String etiquetaDePreco() {
        return super.getNome() + " (Usado) R$ " +
                String.format("%.2f", super.getPreco())
                + " (Data de fabricação: " + dataFormatada.format(dataDeFabricacao) + ")";
    }
}
