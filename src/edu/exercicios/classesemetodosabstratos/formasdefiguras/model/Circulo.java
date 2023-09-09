package edu.exercicios.classesemetodosabstratos.formasdefiguras.model;

import edu.exercicios.classesemetodosabstratos.formasdefiguras.enums.Cor;

public class Circulo extends Forma {
    private static final Double PI = Math.PI;
    private Double raio;

    public Circulo() {
        super();
    }

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area() {
        return PI * Math.pow(raio, 2);
    }
}
