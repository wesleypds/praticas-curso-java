package edu.exercicios.tratamentoexcecoes.estruturatrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Começo do programa!");
        metodo1();
        System.out.println("Fim do programa!");
    }

    public static void metodo1() {
        System.out.println("**** COMEÇO DO MÉTODO1 ****");
        metodo2();
        System.out.println("**** TÉRMINO DO MÉTODO1 ****");
    }

    public static void metodo2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("**** COMEÇO DO MÉTODO2 ****");
        try {
            String[] vet = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            System.out.println(vet[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida");
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
        }
        System.out.println("**** TÉRMINO DO MÉTODO2 ****");
        sc.close();
    }
}
