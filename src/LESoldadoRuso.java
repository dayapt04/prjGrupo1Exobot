public class LESoldadoRuso extends LESoldado implements IFuentePoder {

    public LESoldadoRuso() {
        super();  
        setLeIdSoldado(getLeIdSoldado());
        recargarFuente();
    }

    @Override
    public void recargarFuente() {
        System.out.println("Soldado está recargando la fuente de poder del Exobot...");
    }

    @Override
    public void reemplazarFuente() {
        System.out.println("Soldado está reemplazando la fuente de poder del Exobot...");
    }

}