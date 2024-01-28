import java.util.Scanner;

public class AppExobot {
    Scanner scString = new Scanner(System.in);
    private Exobot exobot;

    public void AppPrincipalExobot(){
        SoldadoRuso soldadoRuso = new SoldadoRuso();
        Mecatronico mecha = new Mecatronico();
        System.out.println("Bienvenido a ExoBot Soldado, por favor ingrese sus datos: ");
        // System.out.println("Ingrese su nombre: ");
        // String nombreSoldado = scString.next();
        System.out.println("Ingrese su ID: ");
        String idSoldado = scString.next();
        soldadoRuso.getIdSoldado(idSoldado);
        mecha.asignarExobot(soldadoRuso, idSoldado, exobot);
        mostrarMenu();
    }
}