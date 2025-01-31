package edu.praticas.interfacespoo.alocacaoveiculocominterface.service;

public class BrasilTaxaService implements TaxaService {

    public double taxa(double quantia) {
        if (quantia <= 100.0)
            return quantia * 0.2;

        return quantia * 0.15;
    }
}
