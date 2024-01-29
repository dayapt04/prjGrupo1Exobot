public class PALanzafuego implements PAIFuentePoder {

    @Override
    public void paRecargarFuente() {
        System.out.println("El lanzafuego se está recargando...");
    }

    @Override
    public void paReemplazarFuente() {
        System.out.println("La fuente de poder del lanzafuego ha sido reemplazada.");
    }

}