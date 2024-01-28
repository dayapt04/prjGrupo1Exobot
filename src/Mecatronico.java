import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Mecatronico {
    public static final String ROJO = "\033[38;5;196m";
    public static final String ROJOD = "\033[38;5;160m";
    public static final String AZUL = "\033[38;5;20m";
    public static final String AZULD = "\033[38;5;21m";
    public static final String BLANCO = "\033[38;5;15m";
    public static final String GRIS = "\033[38;5;255m";
    public static final String ROSA = "\033[38;5;205m";
    public static final String VIOLETA = "\033[38;5;177m";
    public static final String TURQUESA = "\033[38;5;43m";
    public static final String GREENC = "\033[38;5;76m";
    public static final String RESET = "\u001B[0m";

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
            System.err.println(ROJOD+"Error al manipular el archivo " + fileCSV + ": " + ROJOD+e.getMessage()+RESET);
        }
    }

    public void armarExobot() {
        System.out.println(GREENC+"El mecatrónico está armando el [EXOBOT]..."+RESET);
    }

    public void personalizarExobot(Exobot exobot, String idExobot) {
        System.out.println("\n");
        int bucle = 0;
        do {
            System.out.println(BLANCO+"PERSONALIZAR [E X O B O T]");
            System.out.println(AZUL+"1. Elegir Arsenal Brazo Derecho");
            System.out.println(ROJO+"2. Elegir Arsenal Brazo Izquierdo");
            System.out.print(ROSA+"Ingrese una opción: "+RESET);
            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    System.out.println(BLANCO+"Armas disponibles para elegir:");
                    System.out.println(AZUL+"1. ARMA LÁSER");
                    System.out.println(ROJO+"2. LANZA FUEGO");
                    System.out.println(ROSA+"Ingrese una opción: "+RESET);
                    String optionDer = sc.nextLine();
                    if (optionDer == "1") {
                        System.out.println(
                                AZULD+"Al exobot " +TURQUESA +idExobot + AZULD+"se le ha añadido un Arma Láser a su brazo derecho."+RESET);
                    } else if (optionDer == "2") {
                        System.out.println(
                                ROJOD+"Al exobot " + ROSA + idExobot + ROJOD +"se le ha añadido un Lanza Fuego a su brazo derecho."+RESET);
                    } else {
                        System.out.println(ROJOD+"La opción no es válida, inténtelo nuevamente."+RESET);
                        return;
                    }
                    break;
                }
                case 2: {
                    System.out.println(BLANCO+"Armas disponibles para elegir:");
                    System.out.println(AZUL+"1. MK61 VULCAN");
                    System.out.println(ROJO+"2. BAZUCA ANTIATAQUE");
                    System.out.print(ROSA+"Ingrese una opción: ");
                    String optionDer = sc.nextLine();
                    if (optionDer == "1") {
                        System.out.println(
                                AZULD+"Al exobot " +TURQUESA+ idExobot + AZULD+ " se le ha añadido un MK61 Vulcan a su brazo izquierdo."+RESET);
                    } else if (optionDer == "2") {
                        System.out.println(ROJOD+"Al exobot " + ROSA+ idExobot
                                + ROJOD+" se le ha añadido una Bazuca Antiataque a su brazo izquierdo."+RESET);
                    } else {
                        System.out.println(ROJOD+"La opción no es válida, inténtelo nuevamente."+RESET);
                        return;
                    }
                    break;
                }
                default:
                    System.out.println(ROJOD+"La opción no es válida, inténtelo de nuevo."+RESET);
                    break;
            }
        } while (bucle != 1);
    }
}