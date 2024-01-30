import java.util.Hashtable;

public class JSExobot extends JSIabot implements JSIEspanol, JSIIngles {

    public PABrazoDerecho bDerecho;
    public PABrazoIzquierdo bIzquierdo;
    public PAExtremidadInferior eInferior;
    public PATurbo turbo;

    public JSExobot() {
        bDerecho = new PABrazoDerecho();
        bIzquierdo = new PABrazoIzquierdo();
        eInferior = new PAExtremidadInferior();
        turbo = new PATurbo();
    }

    Hashtable<Integer, String> jsConocimientoI = new Hashtable<>();
    Hashtable<Integer, String> jsConocimientoE = new Hashtable<>();

    @Override
    public String jsaprenderFoneticaIngles() {
        jsConocimientoI.put(1, " Aprendió fonética en inglés");
        return " Aprendiendo fonética en Ingles";
    }

    @Override
    public String jsaprenderGramaticaIngles() {
        jsConocimientoI.put(2, " Aprendió gramática en inglés");
        return " Aprendiendo gramática en Ingles";
    }

    @Override
    public String jsaprenderLexicoIngles() {
        jsConocimientoI.put(3, " Aprendió léxico en inglés");
        return " Aprendiendo léxico en Ingles";
    }

    @Override
    public String jsaprenderFoneticaEspanol() {
        jsConocimientoE.put(1, " Aprendió fonética en Español");
        return " Aprendiendo fonética en Español ";
    }

    @Override
    public String jsaprenderGramaticaEspanol() {
        jsConocimientoE.put(2, " Aprendió gramática en Español");
        return " Aprendiendo gramática en Español";
    }

    @Override
    public String jsaprenderLexicoEspanol() {
        jsConocimientoE.put(3, " Aprendió léxico en Español");
        return " Aprendiendo léxico en Español";
    }

    public void jsConocimientoIngles() {

        jsConocimientoI.forEach((k, v) -> {
            System.out.println(v);
        });
    }

    public void jsConocimientoEspanol() {

        jsConocimientoE.forEach((k, v) -> {
            System.out.println(v);
        });
    }

    @Override
    public void aprenderEspanol() {
        System.out.println(" - El exobot ahora tiene conocimientos del idioma español.");
    }

    @Override
    public void aprenderIngles() {
        System.out.println(" - El exobot ahora tiene conocimientos del idioma inglés.");
    }

    @Override
    public String generarCodigo() {
        return super.generarCodigo();
    }

}