public class BrazoIzquierdo {

    private ArmaLaser armaLaser;
    private Lanzafuego lanzafuego;

    public void agregarMK61(ArmaLaser laser) {
        this.armaLaser = laser;
        if (laser != null)
            System.out.println("El arma láser ha sido correctamente agregada al brazo izquierdo del Exobot.");
        else
            System.out.println("No existe un arma láser diponible para agregarla al arsenal.");
    }

    public void agregarBazucaAntiataque(Lanzafuego lFuego) {
        this.lanzafuego = lFuego;
        if (lFuego != null)
            System.out.println("El lanza fuego ha sido correctamente agregada al brazo izquierdo del Exobot.");
        else
            System.out.println("No existe un lanza fuego diponible para agregarla al arsenal.");
    }
}