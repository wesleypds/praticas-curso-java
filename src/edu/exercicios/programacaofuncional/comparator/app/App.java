package edu.exercicios.programacaofuncional.comparator.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import edu.exercicios.programacaofuncional.comparator.models.Produto;

public class App {
    public static void main(String[] args) {
        
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Tv", 900.0));
        produtos.add(new Produto("Notebook", 1200.0));
        produtos.add(new Produto("Tablet", 450.0));

        // Utilizando uma classe que implementa Comparator
        //produtos.sort(new MyComparator());

        // Utilizando expressão lambida
        Comparator<Produto> comp = (p1, p2) -> {
            return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
        };
        produtos.sort(comp);

        for (Produto produto : produtos) {
            System.err.println(produto);
        }

    }
}
