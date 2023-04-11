package edu.exercicios.somavetor;

import java.util.Scanner;

public class App {
    private double[] vetor;
    private double soma;

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.preencheArray();
        app.imprimirArray();
    }

    public void preencheArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        vetor = new double[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }
        sc.close();
    }

    public void imprimirArray() {
        System.out.print("VALORES: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.2f ", vetor[i]);
        }
        System.out.printf("\nSOMA: %.2f", soma);
        System.out.printf("\nMEDIA: %.2f", soma / vetor.length);
    }
}
