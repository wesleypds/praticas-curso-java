package edu.exercicios.genericssetmap.printservicegenerics.app;

import java.util.Scanner;

import edu.exercicios.genericssetmap.printservicegenerics.model.PrintService;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<Double> ps = new PrintService<>();

        ps.imprimir();

        System.out.print("Quantos valores serão digitados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double value = sc.nextDouble();
            ps.addValor(value);
        }

        ps.imprimir();
        System.out.println("Primeiro: " + ps.primeiro());

        sc.close();
    }
}
