package edu.praticas.introducaopoo.smarttv;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void limparTela() throws InterruptedException, IOException {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scan = new Scanner(System.in);
        SmartTV minhaTV = new SmartTV();
        int op = 1;
        int canal;

        minhaTV.ligarSmartTV();
        while (op != 0) {
            if (minhaTV.isLigada()) {
                System.out.println("Ligada: " + minhaTV.isLigada());
                System.out.println("Canal: " + minhaTV.getCanal());
                System.out.println("Volume: " + minhaTV.getVolume());
                System.out.println("1- Desligar TV\n" +
                        "2- Avançar canal\n" +
                        "3- Inserir canal\n" +
                        "4- Aumentar volume\n" +
                        "5- Diminuir volume");
                System.out.print("--> ");
                op = scan.nextInt();
                switch (op) {
                    case 1:
                        minhaTV.desligarSmartTV();
                        break;
                    case 2:
                        minhaTV.mudarCanal(1);
                        break;
                    case 3:
                        System.out.print("--> ");
                        canal = scan.nextInt();
                        minhaTV.mudarCanal(canal);
                        break;
                    case 4:
                        minhaTV.aumentarVolume();
                        break;
                    case 5:
                        minhaTV.diminuirVolume();
                        break;
                    default:
                        System.out.println("Opção invalida!");
                        if (op == 0)
                            op = 1;
                        break;
                }
                limparTela();
            } else {
                System.out.println("SmartTV desligada!");
                op = 0;
            }

        }

        scan.close();
    }
}
