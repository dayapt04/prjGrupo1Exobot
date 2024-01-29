import java.security.SecureRandom;
import java.util.Hashtable;

public abstract class JSIabot implements JSIIngles, JSIEspanol {

    Hashtable<Integer, String> jsConocimientoI = new Hashtable<>();
    Hashtable<Integer, String> jsConocimientoE = new Hashtable<>();

    private String idExobot;

    public String getIdExobot() {
        idExobot = generarCodigo();
        return idExobot;
    }

    public void setIdExobot(String idExobot) {
        this.idExobot = idExobot;
    }

    public String generarCodigo() {
        SecureRandom idExobot = new SecureRandom();
        String caracteresPosibles = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder builder = new StringBuilder(4);
        for (int i = 0; i < 4; i++) {
            int pos = idExobot.nextInt(caracteresPosibles.length());
            builder.append(caracteresPosibles.charAt(pos));
        }
        return builder.toString().toUpperCase();
    }

    @Override
    public String jsaprenderFoneticaIngles() {
        jsConocimientoI.put(1, " Aprendio Fonetica en Ingles");
        return " Aprendiendo Fonetica en Ingles";
    }

    @Override
    public String jsaprenderGramaticaIngles() {
        jsConocimientoI.put(2, " Aprendio Gramática en Ingles");
        return " Aprendiendo Gramática en Ingles";
    }

    @Override
    public String jsaprenderLexicoIngles() {
        jsConocimientoI.put(3, " Aprendio Lexico en Ingles");
        return " Aprendiendo Lexico en Ingles";
    }

    @Override
    public String jsaprenderFoneticaEspanol() {
        jsConocimientoE.put(1, " Aprendio Fonetica en Español");
        return " Aprendiendo Fonetica en Español ";
    }

    @Override
    public String jsaprenderGramaticaEspanol() {
        jsConocimientoE.put(2, " Aprendio Gramaticaen Español");
        return " Aprendiendo Gramatica en Español";
    }

    @Override
    public String jsaprenderLexicoEspanol() {
        jsConocimientoE.put(3, " Aprendio Lexico en Español");
        return " Aprendiendo Lexico en español";
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
}