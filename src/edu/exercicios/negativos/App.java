package edu.exercicios.negativos;

import java.util.Scanner;

public class App {
    private int[] vetor;
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.preencheArray();
        app.imprimirNegativos();
    }

    public void preencheArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        if (n <= 10) {
            vetor = new int[n];
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("Digite um numero: ");
                vetor[i] = sc.nextInt();
            }           
        } else {
            System.out.println("O número tem que ser <= 10!");
            System.out.print("Quantos números você vai digitar? ");
            n = sc.nextInt();
            preencheArray();
        }
        sc.close();
    }

    public void imprimirNegativos() {
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.printf("-> %d\n", vetor[i]);
            }
        }
    }

}
