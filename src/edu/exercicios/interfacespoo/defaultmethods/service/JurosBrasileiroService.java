package edu.exercicios.interfacespoo.defaultmethods.service;

import edu.exercicios.interfacespoo.defaultmethods.interfaces.JurosService;

public class JurosBrasileiroService implements JurosService {
    private Double taxa;

    public JurosBrasileiroService(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double getTaxaJuros() {
        return taxa;
    }
}
