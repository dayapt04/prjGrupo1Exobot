public class Exobot extends Iabot {
    public BrazoDerecho bDerecho;
    public BrazoIzquierdo bIzquierdo;
    public ExtremidadInferior eInferior;
    public Turbo turbo;

    @Override
    public String generarCodigo() {
        return super.generarCodigo();
    }

    public Exobot() {
        bDerecho = new BrazoDerecho();
        bIzquierdo = new BrazoIzquierdo();
        eInferior = new ExtremidadInferior();
        turbo = new Turbo();
    }

    @Override
    public void aprenderFoneticaEspanol() {
        super.aprenderFoneticaEspanol();
        System.out.println("Exobot aprendiendo fonética en español");
    }

    @Override
    public void aprenderFoneticaIngles() {
        super.aprenderFoneticaIngles();
        System.out.println("Exobot aprendiendo fonética en inglés");
    }

    @Override
    public void aprenderGramaticaEspanol() {
        super.aprenderGramaticaEspanol();
        System.out.println("Exobot aprendiendo gramática en español");
    }

    @Override
    public void aprenderGramaticaIngles() {
        super.aprenderGramaticaIngles();
        System.out.println("Exobot aprendiendo gramática en inglés");
    }

    @Override
    public void aprenderLexicoEspanol() {
        super.aprenderLexicoEspanol();
        System.out.println("Exobot aprendiendo léxico en español");
    }

    @Override
    public void aprenderLexicoIngles() {
        super.aprenderLexicoIngles();
        System.out.println("Exobot aprendiendo léxico en inglés");
    }

}