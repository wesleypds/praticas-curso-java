package edu.exercicios.introducaojava.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    
    public static void main(String[] args) {

        // Instancia para formatar datas personalizadas
        DateTimeFormatter dtForm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Pegando a data local
        LocalDate date = LocalDate.now();
        System.out.println("Data local: " + date);

        // Pegando a data e hora local
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Data e hora local: " + dateTime);

        // Pegando a data e hora global
        Instant instant = Instant.now();
        System.out.println("Data e hora global: " + instant);

        // Gerando uma data a partir de um texto padrao ISO
        LocalDate dataTexto = LocalDate.parse("2023-05-24");
        System.out.println("Data a partir de um texto padrao ISO: " + dataTexto);

        // Gerando uma data e hora a partir de um texto padrao ISO
        LocalDateTime dataHoraTexto = LocalDateTime.parse("2023-05-24T15:41");
        System.out.println("Data e hora a partir de um texto padrao ISO: " + dataHoraTexto);

        // Gerando uma data e hora global a partir de um texto padrao ISO
        Instant dataHoraInst = Instant.parse("2023-05-24T15:41:40Z");
        System.out.println("Data e hora global a partir de um texto padrao ISO: " + dataHoraInst);

        // Gerando uma data e hora global com fuso a partir de um texto padrao ISO
        Instant dataHoraItt = Instant.parse("2023-05-24T15:41:40-03:00");
        System.out.println("Data e hora global com fuso a partir de um texto padrao ISO: " + dataHoraItt);

        // Formatando data personalizada
        LocalDate dataFmt = LocalDate.parse("24/05/2023", dtForm);
        System.out.println("Data personalizada formatada: " + dataFmt);

    }

}
