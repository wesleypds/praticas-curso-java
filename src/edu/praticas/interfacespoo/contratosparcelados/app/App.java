package edu.praticas.interfacespoo.contratosparcelados.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import edu.praticas.interfacespoo.contratosparcelados.model.Contrato;
import edu.praticas.interfacespoo.contratosparcelados.model.Parcela;
import edu.praticas.interfacespoo.contratosparcelados.service.ContratoService;
import edu.praticas.interfacespoo.contratosparcelados.service.PaypalService;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número: ");
        String numeroContrato = sc.next();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate dataContrato = LocalDate.parse(sc.next(), formatter);
        System.out.print("Valor do contrato: ");
        double valor = sc.nextDouble();
        System.out.print("Entre com o número de parcelas: ");
        int parcelas = sc.nextInt();

        Contrato contrato = new Contrato(numeroContrato, dataContrato, valor);

        ContratoService servico = new ContratoService(new PaypalService());
        servico.gerarParcelas(contrato, parcelas);

        System.out.println();

        System.out.println("Parcelas:");
        for (Parcela parcela : contrato.getParcelas()) {
            System.out.println(String.format("%s - %.2f", formatter.format(parcela.getData()), parcela.getValor()));
        }

        sc.close();
    }
}
