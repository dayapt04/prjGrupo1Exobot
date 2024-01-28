public abstract class Soldado {
    private Extremidad brazo;
    private Extremidad pierna;

    public Extremidad getBrazo() {
        return brazo;
    }

    public void setBrazo(Extremidad brazo) {
        this.brazo = brazo;
    }

    public Extremidad getPierna() {
        return pierna;
    }

    public void setPierna(Extremidad pierna) {
        this.pierna = pierna;
    }

    private String idSoldado;

    public String getIdSoldado() {
        return idSoldado;
    }

    public void setIdSoldado(String idSoldado) {
        this.idSoldado = idSoldado;
    }
}