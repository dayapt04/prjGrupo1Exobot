public class App {
    private static Exobot exobot = new Exobot();
    private static PABrazoDerecho bder = new PABrazoDerecho();
    private static PABrazoIzquierdo bizq = new PABrazoIzquierdo();
    private static PAArmaLaser laser = new PAArmaLaser();
    private static PABAntiataque bazuca = new PABAntiataque();
    private static PAMK61 mk = new PAMK61();
    private static PALanzafuego fuego = new PALanzafuego();

    public static void main(String[] args) throws Exception {
        PAMecatronico oMecatronico = new PAMecatronico();
        oMecatronico.paPersonalizarExobot(exobot, "1234se", bder, bizq, laser, bazuca, mk, fuego);
    }
}
