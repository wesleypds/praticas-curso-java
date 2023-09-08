package edu.exercicios.introducaopoo.contabancaria;

import java.util.Scanner;

public class App { 
    public static void main(String[] args) throws Exception {
        Conta conta;
        Scanner scan = new Scanner(System.in);
        long numeroDaConta;
        String nomeDoTitular;
        double valor;

        System.out.println("\t| Insira os dados |");
        System.out.print("Numero da conta..: ");
        numeroDaConta = scan.nextLong();
        scan.nextLine();
        System.out.print("Nome do titular..: ");
        nomeDoTitular = scan.nextLine();
        System.out.print("Valor do deposito: ");
        valor = scan.nextDouble();

        if (valor != 0) {
            conta = new Conta(numeroDaConta, nomeDoTitular, valor);
        } else {
            conta = new Conta(numeroDaConta, nomeDoTitular);
        } 

        System.out.println("\nDados da conta:");
        System.out.println(conta.toString());

        System.out.print("\nInsira o valor do deposito: ");
        valor = scan.nextDouble();
        conta.depositar(valor);
        System.out.println("Dados atualizados da conta:");
        System.out.println(conta.toString());

        System.out.print("\nInsira o valor do saque: ");
        valor = scan.nextDouble();
        conta.sacar(valor);
        System.out.println("Dados atualizados da conta:");
        System.out.println(conta.toString());

        scan.close();
    }
}
