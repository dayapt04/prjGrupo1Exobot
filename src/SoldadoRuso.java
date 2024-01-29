public class SoldadoRuso extends Soldado implements PAIFuentePoder {

    @Override
    public void paRecargarFuente() {
        System.out.println("Soldado está recargando la fuente de poder del Exobot...");
    }

    @Override
    public void paReemplazarFuente() {
        System.out.println("Soldado está reemplazando la fuente de poder del Exobot...");
    }

}