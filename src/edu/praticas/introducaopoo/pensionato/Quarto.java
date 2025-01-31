package edu.praticas.introducaopoo.pensionato;

public class Quarto {
    private Boolean ocupado;
    private int numeroDoQuarto;
    private Estudante estudante;

    public Quarto(int numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Boolean getOcupado() {
        return this.ocupado;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    @Override
    public String toString() {
        return numeroDoQuarto + ": " + estudante;
    }
}
