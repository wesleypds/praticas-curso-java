package edu.praticas.introducaopoo.maisvelho;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar: ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];
        String nomeDaPessoa;
        int idadeDaPessoa;
        int maiorIdade = 0;
        int indice = 0;

        for (int i = 0; i < pessoas.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %d pessoa:\n", i+1);
            System.out.print("Nome: ");
            nomeDaPessoa = sc.nextLine();
            System.out.print("Idade: ");
            idadeDaPessoa = sc.nextInt();
            pessoas[i] = new Pessoa(nomeDaPessoa, idadeDaPessoa);
        }

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() > maiorIdade) {
                maiorIdade = pessoas[i].getIdade();
                indice = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + pessoas[indice].getNome());

        sc.close();

    }
}
