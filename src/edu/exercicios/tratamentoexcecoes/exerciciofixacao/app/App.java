package edu.exercicios.tratamentoexcecoes.exerciciofixacao.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import edu.exercicios.tratamentoexcecoes.exerciciofixacao.model.entidades.Conta;
import edu.exercicios.tratamentoexcecoes.exerciciofixacao.model.excecoes.ContaExcecoes;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira os dados da conta:");
            System.out.print("Número: ");
            int numeroDaConta = sc.nextInt();
            sc.nextLine();
            System.out.print("Titular: ");
            String titularDaConta = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double saldoDaConta = sc.nextDouble();
            System.out.print("Limite de saque: ");
            double limiteDeSaque = sc.nextDouble();
            Conta conta = new Conta(numeroDaConta, titularDaConta, saldoDaConta, limiteDeSaque);
            System.out.print("\nInsira valor do saque: ");
            conta.saca(sc.nextDouble());
            System.out.println("Novo saldo: " + conta.getSaldo());
        } catch (ContaExcecoes e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Insira dados válidos.");
        }

        sc.close();
    }
}
