public class JSExobot extends JSIabot {
    public PABrazoDerecho bDerecho;
    public PABrazoIzquierdo bIzquierdo;
    public PAExtremidadInferior eInferior;
    public PATurbo turbo;

    @Override
    public String generarCodigo() {
        return super.generarCodigo();
    }

    public JSExobot() {
        bDerecho = new PABrazoDerecho();
        bIzquierdo = new PABrazoIzquierdo();
        eInferior = new PAExtremidadInferior();
        turbo = new PATurbo();
    }

}