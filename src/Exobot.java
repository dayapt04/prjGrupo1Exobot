public class Exobot extends JSIabot {
    public PABrazoDerecho bDerecho;
    public PABrazoIzquierdo bIzquierdo;
    public PAExtremidadInferior eInferior;
    public PATurbo turbo;

    @Override
    public String generarCodigo() {
        return super.generarCodigo();
    }

    public Exobot() {
        bDerecho = new PABrazoDerecho();
        bIzquierdo = new PABrazoIzquierdo();
        eInferior = new PAExtremidadInferior();
        turbo = new PATurbo();
    }

}