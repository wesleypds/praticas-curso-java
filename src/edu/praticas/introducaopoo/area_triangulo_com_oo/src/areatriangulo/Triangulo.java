package edu.praticas.introducaopoo.area_triangulo_com_oo.src.areatriangulo;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double p;

    public Triangulo(double ladoA, double ladoB, double ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double calculaArea(){
        p = (ladoA + ladoB + ladoC) / 2.0;
        return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    }
    
}