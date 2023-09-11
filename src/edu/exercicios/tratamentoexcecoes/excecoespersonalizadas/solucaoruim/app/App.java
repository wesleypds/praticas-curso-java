package edu.exercicios.tratamentoexcecoes.excecoespersonalizadas.solucaoruim.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import edu.exercicios.tratamentoexcecoes.excecoespersonalizadas.solucaoruim.model.entidades.Reserva;

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

        if (!checkout.before(checkin)) {
            Reserva reserva = new Reserva(numeroQuarto, checkin, checkout);
            System.out.println("Reserva: " + reserva);
            System.out.println("\nInsira os dados para atualizar a reserva:");
            System.out.print("Data de check-in (DD/MM/AAAA): ");
            checkin = dateFormat.parse(sc.nextLine());
            System.out.print("Data de checkout (DD/MM/AAAA): ");
            checkout = dateFormat.parse(sc.nextLine());
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
