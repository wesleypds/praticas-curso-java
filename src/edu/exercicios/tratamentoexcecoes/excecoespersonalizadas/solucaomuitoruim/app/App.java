package edu.exercicios.tratamentoexcecoes.excecoespersonalizadas.solucaomuitoruim.app;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import edu.exercicios.tratamentoexcecoes.excecoespersonalizadas.solucaomuitoruim.model.entidades.Reserva;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Número do quarto: ");
        int numeroQuarto = sc.nextInt();
        sc.nextLine();
        System.out.print("Data de check-in (DD/MM/AAAA): ");
        LocalDate checkin = LocalDate.parse(sc.next(), dateFormat);
        System.out.print("Data de checkout (DD/MM/AAAA): ");
        LocalDate checkout = LocalDate.parse(sc.next(), dateFormat);

        LocalDate now = LocalDate.now();

        if (checkout.isBefore(now) || checkin.isBefore(now)) {
            System.out.println("Erro na reserva: As datas de reserva devem ser datas futuras.");
        } else if (checkout.isAfter(checkin)) {
            Reserva reserva = new Reserva(numeroQuarto, checkin, checkout);
            System.out.println("Reserva: " + reserva);

            System.out.println("\nInsira os dados para atualizar a reserva:");
            System.out.print("Data de check-in (DD/MM/AAAA): ");
            checkin = LocalDate.parse(sc.next(), dateFormat);
            System.out.print("Data de checkout (DD/MM/AAAA): ");
            checkout = LocalDate.parse(sc.next(), dateFormat);

            LocalDate agora = LocalDate.now();

            if (checkout.isBefore(agora) || checkin.isBefore(agora)) {
                System.out.println("Erro na reserva: As datas de reserva devem ser datas futuras.");
            } else if (!checkout.isAfter(checkin)) {
                System.out.println("Erro na reserva: A data de Check-out tem que ser maior que a data de Check-in.");
            } else {
                reserva.atualizaDatas(checkin, checkout);
                System.out.println("Reserva: " + reserva);
            }
        } else {
            System.out.println("Erro na reserva: A data de Check-out tem que ser maior que a data de Check-in.");
        }

        sc.close();
    }
}
