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

    private String idSoladado;

    public String getIdSoladado() {
        return idSoladado;
    }

    public void setIdSoladado(String idSoladado) {
        this.idSoladado = idSoladado;
    }
}