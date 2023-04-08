package edu.exercicios.dadospessoas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitas?: ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];
        float alturaDaPessoa;
        char sexoDaPessoa;
        float menorAltura = 3;
        float maiorAltura = 0;
        float somaAlturaMulheres = 0;
        int contadorF = 0;
        int contadorM = 0;

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Altura da %d° pessoa: ", i+1);
            alturaDaPessoa = sc.nextFloat();
            System.out.printf("Genero da %d° pessoa: ", i+1);
            sexoDaPessoa = sc.next().charAt(0);
            pessoas[i] = new Pessoa(alturaDaPessoa, sexoDaPessoa);

            if (pessoas[i].getAltura() > maiorAltura) {
                maiorAltura = pessoas[i].getAltura();
            } 
            
            if (pessoas[i].getAltura() < menorAltura) {
                menorAltura = pessoas[i].getAltura();
            }

            if (pessoas[i].getSexo() == 'F') {
                somaAlturaMulheres += pessoas[i].getAltura();
                contadorF++;
            }

            if (pessoas[i].getSexo() == 'M') {
                contadorM++;
            }
        }

        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.printf("Media das alturas das mulheres: %.2f\n", somaAlturaMulheres/contadorF);
        System.out.println("Numero de homens: " + contadorM);

        sc.close();
    }
}
