package edu.exercicios.programacaofuncional.interfaceconsumer.app;

import java.util.ArrayList;
import java.util.List;

import edu.exercicios.programacaofuncional.interfaceconsumer.models.Produto;

public class App {
    public static void main(String[] args) {
        
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Tv", 900.0));
        produtos.add(new Produto("Mouse", 50.0));
        produtos.add(new Produto("Tablet", 350.5));
        produtos.add(new Produto("HD Case", 80.9));

        produtos.forEach(p -> p.setPreco(p.getPreco() * 1.1));

        produtos.forEach(System.out::println);
    }
}
