package edu.exercicios.introducaopoo.novosalario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private Funcionario funcionario;
    private List<Funcionario> listFuncionario = new ArrayList<>();
    static Scanner scanner;
        
    public static void main(String[] args) {
        scanner = new Scanner(System.in, "ISO-8859-1");
        App app = new App();
        app.registroDeFuncionario();
        app.aumentarSalario();
        app.imprimirListaFuncionarios();
        scanner.close();
    }

    public void registroDeFuncionario() {
        String nome;
        Double salario;
        int n;
        System.out.print("Quantos funcionários serão registrados? ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("\nFuncionário #%d:\n", (i+1));
            System.out.println("Id....................: " + (i+1));
            System.out.print("Nome do funcionário...: ");
            scanner.nextLine();
            nome = scanner.nextLine();
            System.out.print("Salário do funcionário: ");
            salario = scanner.nextDouble();
            funcionario = new Funcionario(i+1, nome, salario);
            listFuncionario.add(funcionario);
        }
    }

    public void aumentarSalario() {
        int porcentagem;
        int id;
        System.out.print("\nInsira o Id do funcionário: ");
        id = scanner.nextInt();
        System.out.print("Insira a porcentagem: ");
        porcentagem = scanner.nextInt();
        Funcionario func = listFuncionario.stream().filter(funcc -> funcc.getId() == id).findFirst().orElse(null);
        if (func != null) {
            func.novoSalario(porcentagem);
        } else {
            System.out.println("Funcionário não encontrado!");
            aumentarSalario();
        } 
    }

    public void imprimirListaFuncionarios() {
        System.out.println("\nLista de funcionários:");
        for (Funcionario func : listFuncionario) {
            System.out.println(func);
        }
    }
}
