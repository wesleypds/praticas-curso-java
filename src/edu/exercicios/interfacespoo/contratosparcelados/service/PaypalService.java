package edu.exercicios.interfacespoo.contratosparcelados.service;

public class PaypalService implements PagamentoService {

    @Override
    public double taxaPagamento(double valor) {
        return valor * 0.02;
    }

    @Override
    public double juros(int parcela, double valor) {
        return valor * 0.01 * parcela;
    }
}
