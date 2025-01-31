package edu.praticas.introducaopoo.dadospessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Pessoa> listPessoa = new ArrayList<>();
        int i = 1;
        float alturaDaPessoa;
        char sexoDaPessoa;
        float menorAltura = 3;
        float maiorAltura = 0;
        float somaAlturaMulheres = 0;
        int contadorF = 0;
        int contadorM = 0;
        int j = 1;

        while (i != 0) {
            System.out.printf("Altura da %d° pessoa: ", j);
            alturaDaPessoa = sc.nextFloat();
            System.out.printf("Genero da %d° pessoa: ", j);
            sexoDaPessoa = sc.next().charAt(0);
            Pessoa pessoas = new Pessoa(alturaDaPessoa, sexoDaPessoa);

            if (pessoas.getAltura() > maiorAltura) {
                maiorAltura = pessoas.getAltura();
            } 
            
            if (pessoas.getAltura() < menorAltura) {
                menorAltura = pessoas.getAltura();
            }

            if (pessoas.getSexo() == 'F') {
                somaAlturaMulheres += pessoas.getAltura();
                contadorF++;
            }

            if (pessoas.getSexo() == 'M') {
                contadorM++;
            }

            listPessoa.add(pessoas);

            System.out.print("0 pra sair.\nQualquer numero para continuar.\n--> ");
            i = sc.nextInt();
            j++;
        }

        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.printf("Media das alturas das mulheres: %.2f%n", somaAlturaMulheres/contadorF);
        System.out.println("Numero de homens: " + contadorM);

        System.out.println("\nPessoas registradas:");
        for (Pessoa pessoa : listPessoa) {
            System.out.println(pessoa);
        }

        sc.close();
    }
}
