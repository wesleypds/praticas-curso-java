package edu.exercicios.tratamentoexcecoes.excecoespersonalizadas.solucaoboa.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import edu.exercicios.tratamentoexcecoes.excecoespersonalizadas.solucaoboa.model.entidades.Reserva;
import edu.exercicios.tratamentoexcecoes.excecoespersonalizadas.solucaoboa.model.excecoes.ExcecaoPersonalizada;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Número do quarto: ");
            int numeroQuarto = sc.nextInt();
            sc.nextLine();
            System.out.print("Data de check-in (DD/MM/AAAA): ");
            Date checkin = dateFormat.parse(sc.nextLine());
            System.out.print("Data de checkout (DD/MM/AAAA): ");
            Date checkout = dateFormat.parse(sc.nextLine());

            
            Reserva reserva = new Reserva(numeroQuarto, checkin, checkout);
            System.out.println("Reserva: " + reserva);
            System.out.println("\nInsira os dados para atualizar a reserva:");
            System.out.print("Data de check-in (DD/MM/AAAA): ");
            checkin = dateFormat.parse(sc.nextLine());
            System.out.print("Data de checkout (DD/MM/AAAA): ");
            checkout = dateFormat.parse(sc.nextLine());
            reserva.atualizaDatas(checkin, checkout);
            System.out.println("Reserva: " + reserva);
        } catch (ParseException e) {
            System.out.println("Formato da data é inválido.");
        } catch (InputMismatchException e) {
            System.out.println("Dado de entrada inválido.");
        } catch (ExcecaoPersonalizada e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
