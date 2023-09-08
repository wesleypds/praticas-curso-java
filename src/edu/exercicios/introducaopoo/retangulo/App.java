package edu.exercicios.introducaopoo.retangulo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Retangulo retangulo;
        double base;
        double altura;

        System.out.println("Digite o valor da base e da altura:");
        base = scan.nextDouble();
        altura = scan.nextDouble();
        retangulo = new Retangulo(altura, base);
        System.out.println(retangulo.toString());

        scan.close();
    }
}
