package edu.exercicios.tratamentoexcecoes.excecoespersonalizadas.solucaomuitoruim.model.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private Integer numeroQuarto;
    private LocalDate checkin;
    private LocalDate checkout;

    private static DateTimeFormatter dateFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reserva() {
    }

    public Reserva(Integer numeroQuarto, LocalDate checkin, LocalDate checkout) {
        this.numeroQuarto = numeroQuarto;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public Integer duracao() {
        return checkout.getDayOfYear() - checkin.getDayOfYear();
    }

    public void atualizaDatas(LocalDate checkin, LocalDate checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Quarto: " 
            + numeroQuarto
            + ", check-in: "
            + dateFormatada.format(checkin)
            + ", check-out: "
            + dateFormatada.format(checkout)
            + ", "
            + duracao()
            + " noites.";
    }
}
