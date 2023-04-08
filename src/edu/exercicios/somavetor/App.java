package edu.exercicios.somavetor;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        double soma = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        System.out.print("VALORES: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.2f ", vetor[i]);
        }
        System.out.printf("\nSOMA: %.2f", soma);
        System.out.printf("\nMEDIA: %.2f", soma / vetor.length);

        sc.close();
    }
}
