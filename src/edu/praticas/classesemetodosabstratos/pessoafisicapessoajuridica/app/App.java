package edu.praticas.classesemetodosabstratos.pessoafisicapessoajuridica.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.praticas.classesemetodosabstratos.pessoafisicapessoajuridica.enums.TipoPessoa;
import edu.praticas.classesemetodosabstratos.pessoafisicapessoajuridica.model.Pessoa;
import edu.praticas.classesemetodosabstratos.pessoafisicapessoajuridica.model.PessoaFisica;
import edu.praticas.classesemetodosabstratos.pessoafisicapessoajuridica.model.PessoaJuridica;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Pessoa> listPessoas = new ArrayList<>();
        TipoPessoa tipoPessoa;
        Pessoa pessoa;
        System.out.print("Insira o número de contribuintes: ");
        int numeroContribuintes = scan.nextInt();
        for (int i = 0; i < numeroContribuintes; i++) {
            scan.nextLine();
            System.out.printf("Dados do %d contribuinte:\n", 1+i);
            System.out.print("PJ ou PF (1/2): ");
            int escolhaTipoPessoa = scan.nextInt();
            scan.nextLine();
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Rendimento anual: ");
            double rendimentoAnual = scan.nextDouble();
            if (escolhaTipoPessoa == 1) {
                System.out.print("Número de funcionários: ");
                int numeroFuncionarios = scan.nextInt();
                tipoPessoa = TipoPessoa.JURIDICA;
                pessoa = new PessoaJuridica(nome, rendimentoAnual, tipoPessoa, numeroFuncionarios);
                listPessoas.add(pessoa);
            } else {
                System.out.print("Gastos com saúde: ");
                double gastosSaude = scan.nextDouble();
                tipoPessoa = TipoPessoa.FISICA;
                pessoa = new PessoaFisica(nome, rendimentoAnual, tipoPessoa, gastosSaude);
                listPessoas.add(pessoa);
            }
        }
        double totalArrecadado = 0.0; 
        System.out.println("\nTAXAS PAGAS:");
        for (Pessoa p : listPessoas) {
            System.out.println(p.getNome() + ": R$" + String.format("%.2f", p.impostoPago()));
            totalArrecadado += p.impostoPago();
        }
        System.out.print("\nTOTAL ARRECADADO: " + totalArrecadado);
        scan.close();
    }
}
