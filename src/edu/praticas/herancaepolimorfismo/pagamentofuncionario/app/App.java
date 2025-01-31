package edu.praticas.herancaepolimorfismo.pagamentofuncionario.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.praticas.herancaepolimorfismo.pagamentofuncionario.model.Funcionario;
import edu.praticas.herancaepolimorfismo.pagamentofuncionario.model.FuncionarioTerceirizado;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> listFuncionarios = new ArrayList<>();
        System.out.print("Números de funcionários: ");
        Integer numeroFuncionarios = sc.nextInt();
        for (int i = 0; i < numeroFuncionarios; i++) {
            //sc.nextLine();
            System.out.printf("Dados do funcionário %d°:\n", i + 1);
            System.out.print("Terceirizado (s/n): ");
            Character op = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            Integer horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            Double valor = sc.nextDouble();
            if (op == 'n') {
                listFuncionarios.add(new Funcionario(nome, horas, valor));
            } else {
                System.out.print("Despesa adicional: ");
                Double despesaAdicional = sc.nextDouble();
                listFuncionarios.add(new FuncionarioTerceirizado(nome, horas, valor, despesaAdicional));
            }
        }
        System.out.println("\nPAGAMENTOS:");
        for (Funcionario funcionario : listFuncionarios) {
            System.out.println(funcionario);
        }
        sc.close();
    }
}
