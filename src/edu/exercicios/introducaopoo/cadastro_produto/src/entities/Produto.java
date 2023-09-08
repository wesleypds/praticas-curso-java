package edu.exercicios.introducaopoo.cadastro_produto.src.entities;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public double totalValorDoEstoque(){
        return quantidade * preco;
    }

    public void addProduto(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString() {
        return "Nome do produto.......: " + nome +
        "\nPreço do produto......: " + String.format("%.2f", preco) +
        "\nQuantidade em estoque.: " + quantidade +
        "\nValor total no estoque: " + String.format("%.2f", totalValorDoEstoque());
    }

}
