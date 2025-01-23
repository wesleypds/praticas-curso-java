package edu.exercicios.programacaofuncional.funcaorecebefuncao.service;

import java.util.List;
import java.util.function.Predicate;

import edu.exercicios.programacaofuncional.funcaorecebefuncao.models.Produto;

public class ProdutoService {
    public double somaFiltro(List<Produto> produtos, Predicate<Produto> criteria) {
        double soma = 0.0;
        for (Produto produto : produtos) {
            if (criteria.test(produto)) {
                soma += produto.getPreco();
            }
        }
        return soma;
    }
}
