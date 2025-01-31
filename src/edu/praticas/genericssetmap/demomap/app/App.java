package edu.praticas.genericssetmap.demomap.app;

import java.util.HashMap;
import java.util.Map;

import edu.praticas.genericssetmap.demomap.models.Produto;

public class App {
    public static void main(String[] args) {
        
        Map<Produto, Double> cookies = new HashMap<>();

        Produto p1 = new Produto("Tv", 900.0);
        Produto p2 = new Produto("Notebook", 1200.0);
        Produto p3 = new Produto("Tablet", 400.0);

        cookies.put(p1, 900.0);
        cookies.put(p2, 1200.0);
        cookies.put(p3, 400.0);

        Produto p4 = new Produto("Tv", 900.0);

        System.err.println("Contém a chave 'p4': " + cookies.containsKey(p4));

    }
}
