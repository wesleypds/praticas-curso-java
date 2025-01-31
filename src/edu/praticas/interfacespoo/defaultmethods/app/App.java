package edu.praticas.interfacespoo.defaultmethods.app;

import java.util.Scanner;

import edu.praticas.interfacespoo.defaultmethods.interfaces.JurosService;
import edu.praticas.interfacespoo.defaultmethods.service.JurosAmericanoService;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantia: ");
        double quantia = sc.nextDouble();
        System.out.print("Meses: ");
        int meses = sc.nextInt();

        JurosService j = new JurosAmericanoService(1.0);
        double pagamento = j.pagamento(quantia, meses);

        System.out.println("Pagamento depois de " + meses + " meses: ");
        System.out.println(String.format("%.2f", pagamento));

        sc.close();
    }
}
