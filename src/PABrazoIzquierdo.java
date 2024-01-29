public class PABrazoIzquierdo {

    private PAArmaLaser paArmaLaser;
    private PALanzafuego paLanzafuego;

    public void paAgregarArmaLaser(PAArmaLaser laser) {
        this.paArmaLaser = laser;
        if (laser != null)
            System.out.println(" -> El arma láser ha sido correctamente agregada al brazo izquierdo del Exobot.");
        else
            System.out.println(" - No existe un arma láser diponible para agregarla al arsenal.");
    }

    public void paAgregarLanzafuego(PALanzafuego lFuego) {
        this.paLanzafuego = lFuego;
        if (lFuego != null)
            System.out.println(" -> El lanza fuego ha sido correctamente agregada al brazo izquierdo del Exobot.");
        else
            System.out.println(" - No existe un lanza fuego diponible para agregarla al arsenal.");
    }
}