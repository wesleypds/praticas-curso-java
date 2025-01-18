package edu.exercicios.interfacespoo.contratosparcelados.service;

import java.time.LocalDate;

import edu.exercicios.interfacespoo.contratosparcelados.model.Contrato;
import edu.exercicios.interfacespoo.contratosparcelados.model.Parcela;

public class ContratoService {
    private PagamentoService pagamentoService;

    public ContratoService(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    public void gerarParcelas(Contrato contrato, Integer parcelas) {
        double valorParcelado = contrato.getValorContrato() / parcelas;
        for (int i = 1; i <= parcelas; i++) {
            LocalDate dataParcela = contrato.getDataContrato().plusMonths(i);
            double juros = pagamentoService.juros(i, valorParcelado);
            double taxa = pagamentoService.taxaPagamento(valorParcelado + juros);
            double valorPagamento = valorParcelado + juros + taxa;
            contrato.getParcelas().add(new Parcela(dataParcela, valorPagamento));
        }
    }
}
