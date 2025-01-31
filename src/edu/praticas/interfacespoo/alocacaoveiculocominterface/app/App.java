package edu.praticas.interfacespoo.alocacaoveiculocominterface.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import edu.praticas.interfacespoo.alocacaoveiculoseminterface.model.Veiculo;
import edu.praticas.interfacespoo.alocacaoveiculoseminterface.model.VeiculoAluguel;
import edu.praticas.interfacespoo.alocacaoveiculoseminterface.services.AluguelService;
import edu.praticas.interfacespoo.alocacaoveiculoseminterface.services.BrasilTaxaService;

public class App {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Scanner sc = new Scanner(System.in);

        VeiculoAluguel veiculoAluguel;

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do veículo: ");
        String modelo = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), formatter);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(), formatter);

        veiculoAluguel = new VeiculoAluguel(retirada, retorno, new Veiculo(modelo));

        System.out.print("Entre com o preço por hora: ");
        double precoHora = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double precoDia = sc.nextDouble();

        AluguelService aluguel = new AluguelService(precoHora, precoDia, new BrasilTaxaService());
        aluguel.processarFatura(veiculoAluguel);

        System.out.println();
        System.out.println("FATURA:");
        System.out.println("Pagamento básico: " + veiculoAluguel.getFatura().getPagamentoBasico());
        System.out.println("Imposto: " + veiculoAluguel.getFatura().getTaxa());
        System.out.println("Pagamento total: " + veiculoAluguel.getFatura().getPagamentoTotal());

        sc.close();
    }
}
