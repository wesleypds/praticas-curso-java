package edu.exercicios.contratos.programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import edu.exercicios.contratos.enums.NivelTrabalhador;
import edu.exercicios.contratos.model.Contrato;
import edu.exercicios.contratos.model.Departamento;
import edu.exercicios.contratos.model.Trabalhador;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        Departamento dp;
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com departamento: ");
        String nomeDp = scan.nextLine();
        dp = new Departamento(nomeDp);

        System.out.println("Entre com dados do trabalhador:");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.println("Nível: ");
        System.out.println("1 - Junior");
        System.out.println("2 - Pleno");
        System.out.println("3 - Senior");
        System.out.print("--> ");
        Integer opNivel = scan.nextInt();
        NivelTrabalhador nivelTrabalhador;
        if (opNivel == 1) {
            nivelTrabalhador = NivelTrabalhador.JUNIOR;
        } else if (opNivel == 2) {
            nivelTrabalhador = NivelTrabalhador.PLENO;
        } else {
            nivelTrabalhador = NivelTrabalhador.SENIOR;
        }
        System.out.print("Salário base: ");
        Double salarioBase = scan.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nome, nivelTrabalhador, salarioBase);
        trabalhador.setDepartamento(dp);

        System.out.print("Quantos contratos para este trabalhador? ");
        Integer qtdContratos = scan.nextInt();
        for (int i = 0; i < qtdContratos; i++) {
            scan.nextLine();
            System.out.println("Entre com dados do " + (i+1) + "° contrato:");
            System.out.print("Data (DD/MM/AAAA): ");
            Date data = formatoData.parse(scan.nextLine());
            System.out.print("Valor por hora: ");
            Double valorPorHora = scan.nextDouble();
            System.out.print("Duração (Horas): ");
            Integer duracao = scan.nextInt();
            Contrato contrato = new Contrato(data, valorPorHora, duracao);
            trabalhador.addContrato(contrato);
        }

        scan.nextLine();
        System.out.print("\n\nEntre com o mes e ano para calcular o rendimento (MM/AAAA): ");
        String dataDigitada = scan.nextLine();
        int mesContrato = Integer.parseInt(dataDigitada.substring(0, 2));
        int anoContrato = Integer.parseInt(dataDigitada.substring(3));
        System.out.println("Nome: " + trabalhador.getName());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.printf("Rendimento do mes %s: %.2f", dataDigitada, trabalhador.calculaRendimentoDoMes(mesContrato, anoContrato));
        scan.close();
    }
}
