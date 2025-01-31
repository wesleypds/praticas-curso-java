package edu.praticas.interfacespoo.contratosparcelados.model;

import java.time.LocalDate;

public class Parcela {
    private LocalDate data;
    private Double valor;

    public Parcela(LocalDate data, Double valor) {
        this.data = data;
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public Double getValor() {
        return valor;
    }
}
