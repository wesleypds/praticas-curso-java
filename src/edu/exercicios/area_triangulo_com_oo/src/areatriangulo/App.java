package edu.exercicios.area_triangulo_com_oo.src.areatriangulo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        double ladoA, ladoB, ladoC;
        double areaDoTrianguloX, areaDoTrianguloY;

        System.out.println("Digite as medidas do triangulo X: ");
        ladoA = scan.nextDouble();
        ladoB = scan.nextDouble();
        ladoC = scan.nextDouble();

        Triangulo trianguloX = new Triangulo(ladoA, ladoB, ladoC);
        areaDoTrianguloX = trianguloX.calculaArea();

        System.out.println("Digite as medidas do triangulo Y: ");
        ladoA = scan.nextDouble();
        ladoB = scan.nextDouble();
        ladoC = scan.nextDouble();

        Triangulo trianguloY = new Triangulo(ladoA, ladoB, ladoC);
        areaDoTrianguloY = trianguloY.calculaArea();

        System.out.printf("A área do triângulo X: %.4f\n", areaDoTrianguloX);
        System.out.printf("A área do triângulo Y: %.4f\n", areaDoTrianguloY);

        if(areaDoTrianguloX > areaDoTrianguloY){
            System.out.println("Maior área: X");
        }else{
            System.out.println("Maior área: Y");
        }

        scan.close();
    }
}
