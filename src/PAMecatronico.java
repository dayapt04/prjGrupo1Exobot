import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PAMecatronico {
    private SoldadoRuso paSoldado;
    private Exobot paExobot;
    Scanner sc = new Scanner(System.in);

    public SoldadoRuso getSoldado() {
        return paSoldado;
    }

    public void setSoldado(SoldadoRuso paSoldado) {
        this.paSoldado = paSoldado;
    }

    public Exobot getExobot() {
        return paExobot;
    }

    public void setExobot(Exobot paExobot) {
        this.paExobot = paExobot;
    }

    public void paAsignarExobot(SoldadoRuso soldadoAsig, String idSoldado, Exobot exobot) {
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

    public void paArmarExobot() {
        System.out.println("El mecatrónico está armando el [EXOBOT]...");
    }

    public void paPersonalizarExobot(Exobot exobot, String idExobot, PABrazoDerecho bDere, PABrazoIzquierdo bIzq,
            PAArmaLaser laser, PABAntiataque bazuca, PAMK61 metralleta, PALanzafuego lfuego) {
        System.out.println("\n");
        int paBucle = 0;
        boolean paElegidoIzq = false;
        boolean paElegidoDer = false;
        do {
            try {
                System.out.println("\n");
                System.out.println("\tPERSONALIZAR [E X O B O T]\n");
                System.out.println("1. Elegir Arsenal Brazo Izquierdo");
                System.out.println("2. Elegir Arsenal Brazo Derecho");
                System.out.println("3. Regresar al menú principal");
                System.out.print("Ingrese una opción: ");
                int paOption = sc.nextInt();
                sc.nextLine();
                switch (paOption) {
                    case 1: {
                        if (paElegidoIzq) {
                            System.out.println("Ya ha elegido el arma izquierda.");
                            break;
                        } else {
                            System.out.println("\n");
                            System.out.println("Armas disponibles para elegir:");
                            System.out.println("a. ARMA LÁSER");
                            System.out.println("b. LANZA FUEGO");
                            System.out.print("Ingrese una opción: ");
                            String optionIzq = sc.nextLine();

                            if (optionIzq.equals("a")) {
                                System.out.println(
                                        "[E X O B O T]: " + idExobot + "\n");
                                bIzq.paAgregarArmaLaser(laser);
                                paElegidoIzq = true;
                            } else if (optionIzq.equals("b")) {
                                System.out.println(
                                        "[E X O B O T]: " + idExobot + "\n");
                                bIzq.paAgregarLanzafuego(lfuego);
                                paElegidoIzq = true;
                            } else {
                                System.out.println("La opción no es válida, inténtelo nuevamente.\n");
                                paOption = 4;
                            }
                        }
                        break;
                    }
                    case 2: {
                        if (paElegidoDer) {
                            System.out.println("Ya ha elegido el arma derecha.");
                            break;
                        } else {
                            System.out.println("\n");
                            System.out.println("Armas disponibles para elegir:");
                            System.out.println("a. MK61 VULCAN");
                            System.out.println("b. BAZUCA ANTIATAQUE");
                            System.out.print("Ingrese una opción: ");
                            String optionDer = sc.nextLine();
                            if (optionDer.equals("a")) {
                                System.out.println(
                                        "[E X O B O T]: " + idExobot + "\n");
                                bDere.agregarMK61(metralleta);
                                paElegidoDer = true;
                            } else if (optionDer.equals("b")) {
                                System.out.println(
                                        "[E X O B O T]: " + idExobot + "\n");
                                bDere.agregarBazucaAntiataque(bazuca);
                                paElegidoDer = true;
                            } else {
                                System.out.println("La opción no es válida, inténtelo nuevamente.\n");
                                paOption = 4;
                            }
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Regresando...");
                        paBucle = 1;
                        break;
                    }
                    default:
                        System.out.println("La opción no es válida, inténtelo de nuevo.\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Error: Ingrese un número entero válido.");
                sc.nextLine();
                paBucle = 0;
            }
        } while (paBucle != 1);
    }
}