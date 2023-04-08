package edu.exercicios.funcionario;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String nome;
        double salarioBruto;
        double imposto;
        double porcentagem;

        System.out.print("Nome do funcionario: ");
        nome = scan.nextLine();
        System.out.print("Salario bruto: ");
        salarioBruto = scan.nextDouble();
        System.out.print("Valor do imposto: ");
        imposto = scan.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);

        System.out.format("\nFuncionario: %s, R$ %.2f\n\n", funcionario.getNome(), funcionario.salarioLiquido());

        System.out.print("Digite a porcentagem de aumento salarial: ");
        porcentagem = scan.nextInt();

        System.out.format("\nFuncionario - dados atualizados: %s, R$ %.2f\n\n", funcionario.getNome(), funcionario.novoSalario(porcentagem));

        scan.close();
    }
}
