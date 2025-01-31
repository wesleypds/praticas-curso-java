package edu.praticas.interfacespoo.defaultmethods.service;

import edu.praticas.interfacespoo.defaultmethods.interfaces.JurosService;

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
