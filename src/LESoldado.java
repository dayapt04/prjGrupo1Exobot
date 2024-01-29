public abstract class LESoldado {
    private PAExtremidad brazo;
    private PAExtremidad pierna;

    public PAExtremidad getBrazo() {
        return brazo;
    }

    public void setBrazo(PAExtremidad brazo) {
        this.brazo = brazo;
    }

    public PAExtremidad getPierna() {
        return pierna;
    }

    public void setPierna(PAExtremidad pierna) {
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