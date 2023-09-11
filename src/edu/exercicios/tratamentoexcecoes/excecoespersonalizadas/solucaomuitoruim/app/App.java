package edu.exercicios.tratamentoexcecoes.excecoespersonalizadas.solucaomuitoruim.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import edu.exercicios.tratamentoexcecoes.excecoespersonalizadas.solucaomuitoruim.model.entidades.Reserva;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Número do quarto: ");
        int numeroQuarto = sc.nextInt();
        sc.nextLine();
        System.out.print("Data de check-in (DD/MM/AAAA): ");
        Date checkin = dateFormat.parse(sc.nextLine());
        System.out.print("Data de checkout (DD/MM/AAAA): ");
        Date checkout = dateFormat.parse(sc.nextLine());

        if (checkout.after(checkin)) {
            Reserva reserva = new Reserva(numeroQuarto, checkin, checkout);
            System.out.println("Reserva: " + reserva);

            System.out.println("\nInsira os dados para atualizar a reserva:");
            System.out.print("Data de check-in (DD/MM/AAAA): ");
            checkin = dateFormat.parse(sc.nextLine());
            System.out.print("Data de checkout (DD/MM/AAAA): ");
            checkout = dateFormat.parse(sc.nextLine());

            Date agora = new Date();

            if (checkout.before(agora) || checkin.before(agora)) {
                System.out.println("Erro na reserva: As datas de reserva devem ser datas futuras.");
            } else if (!checkout.after(checkin)) {
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
