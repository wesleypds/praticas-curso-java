package edu.praticas.programacaofuncional.removeif.app;

import java.util.ArrayList;
import java.util.List;

import edu.praticas.programacaofuncional.removeif.models.Produto;

public class App {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Tv", 900.0));
        produtos.add(new Produto("Mouse", 50.0));
        produtos.add(new Produto("Tablet", 350.5));
        produtos.add(new Produto("HD Case", 80.9));

        produtos.removeIf((p) -> p.getPreco() <= 100.0);

        // for (Produto produto : produtos) {
        //     System.err.println(produto);
        // }

        produtos.forEach(System.out::println);
    }
}
