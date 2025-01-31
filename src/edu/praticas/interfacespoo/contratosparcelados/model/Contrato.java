package edu.praticas.interfacespoo.contratosparcelados.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private String numeroContrato;
    private LocalDate dataContrato;
    private Double valorContrato;
    private List<Parcela> parcelas = new ArrayList<>();

    public Contrato(String numeroContrato, LocalDate dataContrato, Double valorContrato) {
        this.numeroContrato = numeroContrato;
        this.dataContrato = dataContrato;
        this.valorContrato = valorContrato;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public Double getValorContrato() {
        return valorContrato;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }
}
