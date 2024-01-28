public class ArmaLaser implements IFuentePoder {

    @Override
    public void recargarFuente() {
        System.out.println("El arma láser se está recargando...");
    }

    @Override
    public void reemplazarFuente() {
        System.out.println("La fuente de poder de el arma láser ha sido reemplazada.");
    }

}