package edu.exercicios.genericssetmap.printservicecomlistapadrao.app;

import java.util.Scanner;

import edu.exercicios.genericssetmap.printservicecomlistapadrao.model.PrintService;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        ps.imprimir();

        System.out.print("Quantos valores serão digitados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValor(value);
        }

        ps.imprimir();
        System.out.println("Primeiro: " + ps.primeiro());

        sc.close();
    }
}
