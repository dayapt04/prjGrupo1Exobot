import java.security.SecureRandom;

public abstract class JSIabot {

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
    //----------
    public void aprenderIngles(){}

    public void aprenderEspanol(){}
    //--------

}