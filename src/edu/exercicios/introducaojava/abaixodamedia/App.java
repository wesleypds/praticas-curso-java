package edu.exercicios.introducaojava.abaixodamedia;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai ter no vetor: ");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        System.out.printf("\nMEDIA DO VETOR: %.3f", soma / vetor.length);
        System.out.println("\nVALORES ABAIXO DA MEDIA:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < (soma/vetor.length)) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
