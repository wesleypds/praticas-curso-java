package edu.praticas.programacaofuncional.funcaorecebefuncao.app;

import java.util.ArrayList;
import java.util.List;

import edu.praticas.programacaofuncional.funcaorecebefuncao.models.Produto;
import edu.praticas.programacaofuncional.funcaorecebefuncao.service.ProdutoService;

public class App {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Tv", 900.0));
        produtos.add(new Produto("Mouse", 50.0));
        produtos.add(new Produto("Tablet", 350.5));
        produtos.add(new Produto("HD Case", 80.9));

        ProdutoService ps = new ProdutoService();

        double soma = ps.somaFiltro(produtos, p -> p.getNome().charAt(0) == 'T');

        System.err.println(String.format("%.2f", soma));
    }
}
