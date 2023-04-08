package edu.exercicios.smarttv;

public class SmartTV {
    private boolean ligada;
    private int canal;
    private int volume;

    public void ligarSmartTV() {
        ligada = true;
    }

    public void desligarSmartTV() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        if (volume > 0)
            volume--;
    }

    public void mudarCanal(int canal) {
        if (canal > 1)
            this.canal = canal;
        else 
            this.canal += canal;
    }

    public boolean isLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
}
