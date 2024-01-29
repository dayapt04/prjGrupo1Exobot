public class PALanzafuego implements PAIFuentePoder {

    @Override
    public void recargarFuente() {
        System.out.println("El lanzafuego se está recargando...");
    }

    @Override
    public void reemplazarFuente() {
        System.out.println("La fuente de poder del lanzafuego ha sido reemplazada.");
    }

}