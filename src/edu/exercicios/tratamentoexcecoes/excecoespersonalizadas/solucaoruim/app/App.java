package edu.exercicios.tratamentoexcecoes.excecoespersonalizadas.solucaoruim.app;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import edu.exercicios.tratamentoexcecoes.excecoespersonalizadas.solucaoruim.model.entidades.Reserva;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Número do quarto: ");
        int numeroQuarto = sc.nextInt();
        System.out.print("Data de check-in (DD/MM/AAAA): ");
        LocalDate checkin = LocalDate.parse(sc.next(), dateFormat);
        System.out.print("Data de checkout (DD/MM/AAAA): ");
        LocalDate checkout = LocalDate.parse(sc.next(), dateFormat);

        if (!checkout.isBefore(checkin)) {
            Reserva reserva = new Reserva(numeroQuarto, checkin, checkout);
            System.out.println("Reserva: " + reserva);
            System.out.println("\nInsira os dados para atualizar a reserva:");
            System.out.print("Data de check-in (DD/MM/AAAA): ");
            checkin = LocalDate.parse(sc.next(), dateFormat);
            System.out.print("Data de checkout (DD/MM/AAAA): ");
            checkout = LocalDate.parse(sc.next(), dateFormat);
            String erro = reserva.atualizaDatas(checkin, checkout);
            if (erro == null) {
                System.out.println("Reserva: " + reserva);
            } else {
                System.out.println(erro);
            }
        }

        sc.close();
    }
}
