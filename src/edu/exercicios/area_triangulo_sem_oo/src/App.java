package edu.exercicios.area_triangulo_sem_oo.src;

import java.util.Scanner;

public class App {

    public static double areaDoTriangulo(double a, double b, double c, double p){
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        double areaX;
        double areaY;
        double p;

        System.out.println("Digite as medidas do triangulo X: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        p = (a + b + c) / 2.0;
        areaX = areaDoTriangulo(a, b, c, p);

        System.out.println("Digite as medidas do triangulo Y: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        p = (a + b + c) / 2.0;
        areaY = areaDoTriangulo(a, b, c, p);

        System.out.printf("A área do triângulo X: %.4f\n", areaX);
        System.out.printf("A área do triângulo Y: %.4f\n", areaY);

        if(areaX > areaY){
            System.out.println("Maior área: X");
        }else{
            System.out.println("Maior área: Y");
        }

        scanner.close();
    }
}
