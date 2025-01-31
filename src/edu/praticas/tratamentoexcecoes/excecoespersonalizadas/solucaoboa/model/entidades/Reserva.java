package edu.praticas.tratamentoexcecoes.excecoespersonalizadas.solucaoboa.model.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import edu.praticas.tratamentoexcecoes.excecoespersonalizadas.solucaoboa.model.excecoes.ExcecaoPersonalizada;

public class Reserva {
    private Integer numeroQuarto;
    private LocalDate checkin;
    private LocalDate checkout;

    private static DateTimeFormatter dateFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reserva() {
    }

    public Reserva(Integer numeroQuarto, LocalDate checkin, LocalDate checkout) throws ExcecaoPersonalizada {
        validacoes(checkin, checkout);
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

    public void atualizaDatas(LocalDate checkin, LocalDate checkout) throws ExcecaoPersonalizada {
        validacoes(checkin, checkout);
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public void validacoes(LocalDate checkin, LocalDate checkout) throws ExcecaoPersonalizada {
        LocalDate agora = LocalDate.now();
        if (checkin.isBefore(agora)) {
            throw new ExcecaoPersonalizada("Erro na reserva: A data de Checkin deve ser igual a hoje ou posterior.");
        }
        if (checkout.isBefore(agora)) {
            throw new ExcecaoPersonalizada("Erro na reserva: A data de Checkout deve ser posterior a hoje.");
        }
        if (!checkout.isAfter(checkin)) {
            throw new ExcecaoPersonalizada("Erro na reserva: A data de Check-out tem que ser maior que a data de Check-in.");
        }
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
