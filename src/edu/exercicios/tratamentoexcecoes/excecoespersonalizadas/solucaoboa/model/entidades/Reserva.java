package edu.exercicios.tratamentoexcecoes.excecoespersonalizadas.solucaoboa.model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import edu.exercicios.tratamentoexcecoes.excecoespersonalizadas.solucaoboa.model.excecoes.ExcecaoPersonalizada;

public class Reserva {
    private Integer numeroQuarto;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat dateFormatada = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva() {
    }

    public Reserva(Integer numeroQuarto, Date checkin, Date checkout) throws ExcecaoPersonalizada {
        if (!checkout.after(checkin)) {
            throw new ExcecaoPersonalizada("Erro na reserva: A data de Check-out tem que ser maior que a data de Check-in.");
        }
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

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public Long duracao() {
        long dif = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
    }

    public void atualizaDatas(Date checkin, Date checkout) throws ExcecaoPersonalizada {
        Date agora = new Date();
        if (checkout.before(agora) || checkin.before(agora)) {
            throw new ExcecaoPersonalizada("Erro na reserva: As datas de reserva devem ser datas futuras.");
        }
        if (!checkout.after(checkin)) {
            throw new ExcecaoPersonalizada("Erro na reserva: A data de Check-out tem que ser maior que a data de Check-in.");
        }
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
