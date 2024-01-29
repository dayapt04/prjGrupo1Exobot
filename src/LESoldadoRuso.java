public class LESoldadoRuso extends LESoldado implements PAIFuentePoder {

    public LESoldadoRuso() {
        super();
        setLeIdSoldado(getLeIdSoldado());

    }

    @Override
    public void paRecargarFuente() {
        System.out.println(" -> Soldado está recargando la fuente de poder del Exobot....");
    }

    @Override
    public void paReemplazarFuente() {
        System.out.println(" -> Soldado está reemplazando la fuente de poder del Exobot...");
    }

    public void agregarExoBot(){
        System.out.println(" -> El soldado Ruso  ha incorporado a su equipo un nuevo exobot.");
    }
    public void inicializarExobot(){
        System.out.println(" -> El soldado ha iniciado el exobot.");
    }
}