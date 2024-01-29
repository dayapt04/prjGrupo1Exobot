public class PABrazoDerecho {

    private PAMK61 paMetralleta;
    private PABAntiataque paBazuca;

    public void agregarMK61(PAMK61 metraMk61) {
        this.paMetralleta = metraMk61;
        if (metraMk61 != null)
            System.out.println("La metralleta ha sido correctamente agregada al brazo derecho del Exobot.");
        else
            System.out.println("No existe una metralleta MK61 diponible para agregarla al arsenal.");
    }

    public void agregarBazucaAntiataque(PABAntiataque bA) {
        this.paBazuca = bA;
        if (bA != null)
            System.out.println("La bazuca antiataque ha sido correctamente agregada al brazo derecho del Exobot.");
        else
            System.out.println("No existe una bazuca antiataque MK61 diponible para agregarla al arsenal.");
    }
}