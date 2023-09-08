package edu.exercicios.introducaojava.somavetores;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter em cada vetor: ");
        int n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = sc.nextInt();
            vetorC[i] = vetorB[i] + vetorA[i];
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorC[i]);
        }

        sc.close();
    }
}
