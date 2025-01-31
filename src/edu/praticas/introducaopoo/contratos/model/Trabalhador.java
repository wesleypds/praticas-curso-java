package edu.praticas.introducaopoo.contratos.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import edu.praticas.introducaopoo.contratos.enums.NivelTrabalhador;


public class Trabalhador {
    private String name;
    private NivelTrabalhador nivelTrabalhador;
    private Double baseSalario;
    private List<Contrato> listContratos = new ArrayList<>();
    private Departamento departamento;

    public Trabalhador() {

    }

    public Trabalhador(String name, NivelTrabalhador nivelTrabalhador, Double baseSalario) {
        this.name = name;
        this.nivelTrabalhador = nivelTrabalhador;
        this.baseSalario = baseSalario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NivelTrabalhador getNivelTrabalhador() {
        return nivelTrabalhador;
    }

    public void setNivelTrabalhador(NivelTrabalhador nivelTrabalhador) {
        this.nivelTrabalhador = nivelTrabalhador;
    }

    public Double getBaseSalario() {
        return baseSalario;
    }
    
    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setBaseSalario(Double baseSalario) {
        this.baseSalario = baseSalario;
    }
    
    public void addContrato(Contrato contrato) {
        listContratos.add(contrato);
    }

    public void rmvContrato(Contrato contrato) {
        listContratos.remove(contrato);
    }

    public Double calculaRendimentoDoMes(Integer mes, Integer ano) {
        double totalContratos = 0.0;
        // Use um objeto Calendar para obter o mês e o ano da data do contrato.
        Calendar calendar = Calendar.getInstance();
        for (Contrato contrato : listContratos) {
            calendar.setTime(contrato.getData());
            int mesContrato = calendar.get(Calendar.MONTH) + 1; // O mês é baseado em zero, então adicione 1.
            int anoContrato = calendar.get(Calendar.YEAR);
            // Verifique se o mês e o ano correspondem aos parâmetros passados.
            if (mesContrato == mes && anoContrato == ano) {
                // Se corresponderem, adicione o valor do contrato ao total.
                totalContratos += contrato.valorTotal(); // Supondo que você tenha um método para obter o valor do contrato.
            }
        }

        return totalContratos + this.baseSalario;
    }

}
