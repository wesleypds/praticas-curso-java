package edu.praticas.programacaofuncional.comparator.app;

import java.util.Comparator;

import edu.praticas.programacaofuncional.comparator.models.Produto;

public class MyComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
    }
    
}
