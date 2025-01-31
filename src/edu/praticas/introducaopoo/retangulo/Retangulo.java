package edu.praticas.introducaopoo.retangulo;

public class Retangulo {
    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double area(){
        return altura * base;
    }

    public double diagonal(){
        return Math.sqrt((Math.pow(base, 2) + Math.pow(altura, 2)));
    }

    public double perimetro(){
        return 2 * (base + altura);
    }

    public String toString(){
        return "AREA: " + String.format("%.2f", area()) +
        "\nPERIMETRO: " + String.format("%.2f", perimetro()) +
        "\nDIAGONAL: " + String.format("%.2f", diagonal());
    }
}
