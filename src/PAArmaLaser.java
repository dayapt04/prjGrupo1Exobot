public class PAArmaLaser implements PAIFuentePoder {

    @Override
    public void paRecargarFuente() {
        System.out.println("El arma láser se está recargando...");
    }

    @Override
    public void paReemplazarFuente() {
        System.out.println("La fuente de poder de el arma láser ha sido reemplazada.");
    }

}