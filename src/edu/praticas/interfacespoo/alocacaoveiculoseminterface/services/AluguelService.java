package edu.praticas.interfacespoo.alocacaoveiculoseminterface.services;

import java.time.Duration;

import edu.praticas.interfacespoo.alocacaoveiculoseminterface.model.Fatura;
import edu.praticas.interfacespoo.alocacaoveiculoseminterface.model.VeiculoAluguel;

public class AluguelService {
    private Double precoHora;
    private Double precoDia;
    private BrasilTaxaService taxa;

    public AluguelService(Double precoHora, Double precoDia, BrasilTaxaService taxa) {
        this.precoHora = precoHora;
        this.precoDia = precoDia;
        this.taxa = taxa;
    }

    public void processarFatura(VeiculoAluguel veiculoAluguel) {
        double duracao = Duration.between(veiculoAluguel.getRetirada(), veiculoAluguel.getRetorno()).toMinutes();
        double horas = duracao / 60.0;
        double pagamentoBasico = 0;
        if (horas <= 12) {
            pagamentoBasico = Math.ceil(horas) * precoHora;
        } else {
            pagamentoBasico = Math.ceil(horas / 24.0) * precoDia;
        }
        veiculoAluguel.setFatura(new Fatura(pagamentoBasico, taxa.taxa(pagamentoBasico)));
    }
}
