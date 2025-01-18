package edu.exercicios.interfacespoo.contratosparcelados.service;

public interface PagamentoService {
    double taxaPagamento(double valor);
    double juros(int parcela, double valor);
}
