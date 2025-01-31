package edu.praticas.programacaofuncional.interfacefunction.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.praticas.programacaofuncional.interfaceconsumer.models.Produto;

public class App {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Tv", 900.0));
        produtos.add(new Produto("Mouse", 50.0));
        produtos.add(new Produto("Tablet", 350.5));
        produtos.add(new Produto("HD Case", 80.9));

        List<Produto> nomeProdutosUpper = produtos.stream()
                                                .map(p -> {
                                                    p.setNome(p.getNome().toUpperCase());
                                                    return p;
                                                })
                                                .collect(Collectors.toList());

        nomeProdutosUpper.forEach(System.out::println);
    }
}
