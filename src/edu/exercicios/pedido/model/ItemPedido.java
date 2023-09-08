package edu.exercicios.pedido.model;

public class ItemPedido {
    private Integer quantidade;
    private Double preco;
    private Produto produto;

    public ItemPedido() {
    }

    public ItemPedido(Integer quantidade, Double preco) {
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double subTotal() {
        return preco * quantidade;
    }

    public String toString() {
        return this.produto.getNome() + ", " +
                this.preco + ", Quantidade: " +
                this.quantidade + " Subtotal: R$" + String.format("%.2f", subTotal());
    }
}
