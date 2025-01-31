package edu.praticas.tratamentoexcecoes.excecoespersonalizadas.solucaoboa.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import edu.praticas.tratamentoexcecoes.excecoespersonalizadas.solucaoboa.model.entidades.Reserva;
import edu.praticas.tratamentoexcecoes.excecoespersonalizadas.solucaoboa.model.excecoes.ExcecaoPersonalizada;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Número do quarto: ");
            int numeroQuarto = sc.nextInt();
            System.out.print("Data de check-in (DD/MM/AAAA): ");
            LocalDate checkin = LocalDate.parse(sc.next(), dateFormatada);
            System.out.print("Data de checkout (DD/MM/AAAA): ");
            LocalDate checkout = LocalDate.parse(sc.next(), dateFormatada);

            
            Reserva reserva = new Reserva(numeroQuarto, checkin, checkout);
            System.out.println("Reserva: " + reserva);
            System.out.println("\nInsira os dados para atualizar a reserva:");
            System.out.print("Data de check-in (DD/MM/AAAA): ");
            checkin = LocalDate.parse(sc.next(), dateFormatada);
            System.out.print("Data de checkout (DD/MM/AAAA): ");
            checkout = LocalDate.parse(sc.next(), dateFormatada);
            reserva.atualizaDatas(checkin, checkout);
            System.out.println("Reserva: " + reserva);
        } catch (InputMismatchException e) {
            System.out.println("Dado de entrada inválido.");
        } catch (ExcecaoPersonalizada e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro inesperado.");
        }

        sc.close();
    }
}
