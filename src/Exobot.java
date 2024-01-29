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

    @Override
    public void aprenderLexicoIngles() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aprenderLexicoIngles'");
    }

    @Override
    public void aprenderGramaticaIngles() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aprenderGramaticaIngles'");
    }

    @Override
    public void aprenderFoneticaIngles() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aprenderFoneticaIngles'");
    }

}