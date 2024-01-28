import java.security.SecureRandom;

public abstract class Iabot implements IIngles, IEspanol {

    private String idExobot;
    private String conocimientoIngles;
    private String conocimientoEspanol;

    public String getConocimientoIngles() {
        return conocimientoIngles;
    }

    public void setConocimientoIngles(String conocimientoIngles) {
        this.conocimientoIngles = conocimientoIngles;
    }

    public String getConocimientoEspanol() {
        return conocimientoEspanol;
    }

    public void setConocimientoEspanol(String conocimientoEspanol) {
        this.conocimientoEspanol = conocimientoEspanol;
    }

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
    public void aprenderLexicoEspanol() {
        conocimientoEspanol += " léxico de Español.";

    }

    @Override
    public void aprenderGramaticaEspanol() {
        conocimientoEspanol += " gramática de Español.";
    }

    @Override
    public void aprenderFoneticaEspanol() {
        conocimientoEspanol += " fonética de Español.";
    }

    @Override
    public void aprenderLexicoIngles() {
        conocimientoIngles += " léxico de Inglés.";
    }

    @Override
    public void aprenderGramaticaIngles() {
        conocimientoIngles += " gramática de Inglés.";
    }

    @Override
    public void aprenderFoneticaIngles() {
        conocimientoIngles += " fonética de Inglés.";
    }

}