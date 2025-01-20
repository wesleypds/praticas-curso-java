package edu.exercicios.genericssetmap.tipocoringa.models;

import edu.exercicios.genericssetmap.tipocoringa.interfaces.Forma;

public class Retangulo implements Forma{
    private Double altura;
    private Double largura;

    public Retangulo(Double altura, Double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    @Override
    public double area() {
        return altura * largura;
    }
}
