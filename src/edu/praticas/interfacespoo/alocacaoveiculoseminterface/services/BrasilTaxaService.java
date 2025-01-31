package edu.praticas.interfacespoo.alocacaoveiculoseminterface.services;

public class BrasilTaxaService {

    public double taxa(double quantia) {
        if (quantia <= 100.0)
            return quantia * 0.2;

        return quantia * 0.15;
    }
}
