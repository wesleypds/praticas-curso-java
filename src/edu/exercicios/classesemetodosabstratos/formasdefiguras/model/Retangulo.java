package edu.exercicios.classesemetodosabstratos.formasdefiguras.model;

import edu.exercicios.classesemetodosabstratos.formasdefiguras.enums.Cor;

public class Retangulo extends Forma {
    private Double largura;
    private Double altura;

    public Retangulo() {
        super();
    }

    public Retangulo(Cor cor, Double largura, Double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public Double getTamanho() {
        return largura;
    }

    public void setTamanho(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double area() {
        return largura * altura;
    }
}
