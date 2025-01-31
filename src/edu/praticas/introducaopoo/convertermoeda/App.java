package edu.praticas.introducaopoo.convertermoeda;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar...................: ");
        double dolarPreco = scan.nextDouble();
        System.out.print("Digite o valor de dólares que deseja comprar: ");
        double dolar = scan.nextDouble();
        double result = CurrecyConverter.dolarConvertido(dolarPreco, dolar);
        System.out.printf("O valor a ser pago em R$: %.2f", result);

        scan.close();
    }
}
