package edu.exercicios.interfacespoo.defaultmethods.service;

import edu.exercicios.interfacespoo.defaultmethods.interfaces.JurosService;

public class JurosAmericanoService implements JurosService {
    private Double taxa;

    public JurosAmericanoService(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double getTaxaJuros() {
        return taxa;
    }
}
