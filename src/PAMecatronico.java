import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PAMecatronico {
    private SoldadoRuso soldado;
    private Exobot exobot;
    Scanner sc = new Scanner(System.in);

    public SoldadoRuso getSoldado() {
        return soldado;
    }

    public void setSoldado(SoldadoRuso soldado) {
        this.soldado = soldado;
    }

    public Exobot getExobot() {
        return exobot;
    }

    public void setExobot(Exobot exobot) {
        this.exobot = exobot;
    }

    public void asignarExobot(SoldadoRuso soldadoAsig, String idSoldado, Exobot exobot) {
        String fileCSV = "dataFile\\asignacionExobot.csv";
        try {
            FileWriter fileWriter = new FileWriter(fileCSV, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(idSoldado + ";" + exobot.generarCodigo());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Error al manipular el archivo " + fileCSV + ": " + e.getMessage());
        }
    }

    public void armarExobot() {
        System.out.println("El mecatrónico está armando el [EXOBOT]...");
    }

    public void personalizarExobot(Exobot exobot, String idExobot) {
        System.out.println("\n");
        int bucle = 0;
        do {
            System.out.println("PERSONALIZAR [E X O B O T]");
            System.out.println("1. Elegir Arsenal Brazo Derecho");
            System.out.println("2. Elegir Arsenal Brazo Izquierdo");
            System.out.print("Ingrese una opción: ");
            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("Armas disponibles para elegir:");
                    System.out.println("1. ARMA LÁSER");
                    System.out.println("2. LANZA FUEGO");
                    System.out.print("Ingrese una opción: ");
                    String optionDer = sc.nextLine();
                    if (optionDer == "1") {
                        System.out.println(
                                "Al exobot " + idExobot + "se le ha añadido un Arma Láser a su brazo derecho.");
                    } else if (optionDer == "2") {
                        System.out.println(
                                "Al exobot " + idExobot + "se le ha añadido un Lanza Fuego a su brazo derecho.");
                    } else {
                        System.out.println("La opción no es válida, inténtelo nuevamente.");
                        return;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Armas disponibles para elegir:");
                    System.out.println("1. MK61 VULCAN");
                    System.out.println("2. BAZUCA ANTIATAQUE");
                    System.out.print("Ingrese una opción: ");
                    String optionDer = sc.nextLine();
                    if (optionDer == "1") {
                        System.out.println(
                                "Al exobot " + idExobot + " se le ha añadido un MK61 Vulcan a su brazo izquierdo.");
                    } else if (optionDer == "2") {
                        System.out.println("Al exobot " + idExobot
                                + " se le ha añadido una Bazuca Antiataque a su brazo izquierdo.");
                    } else {
                        System.out.println("La opción no es válida, inténtelo nuevamente.");
                        return;
                    }
                    break;
                }
                default:
                    System.out.println("La opción no es válida, inténtelo de nuevo.");
                    break;
            }
        } while (bucle != 1);
    }
}