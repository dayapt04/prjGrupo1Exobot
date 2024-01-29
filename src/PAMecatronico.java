import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PAMecatronico {
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

    private LESoldadoRuso paSoldado;
    private JSExobot paExobot;
    Scanner sc = new Scanner(System.in);

    public LESoldadoRuso getSoldado() {
        return paSoldado;
    }

    public void setSoldado(LESoldadoRuso paSoldado) {
        this.paSoldado = paSoldado;
    }

    public JSExobot getExobot() {
        return paExobot;
    }

    public void setExobot(JSExobot paExobot) {
        this.paExobot = paExobot;
    }

    public void paAsignarExobot(LESoldadoRuso soldadoAsig, String idSoldado, JSExobot exobot) {
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

    public void paArmarExobot() {
        System.out.println(GREENC+"El mecatrónico está armando el [EXOBOT]..."+RESET);
    }

    public void paPersonalizarExobot(JSExobot exobot, String idExobot, PABrazoDerecho bDere, PABrazoIzquierdo bIzq,
            PAArmaLaser laser, PABAntiataque bazuca, PAMK61 metralleta, PALanzafuego lfuego) {
        System.out.println("\n");
        int paBucle = 0;
        boolean paElegidoIzq = false;
        boolean paElegidoDer = false;
        do {
            try {
                System.out.println("\n");
                System.out.println(BLANCO+"\tPERSONALIZAR [E X O B O T]\n");
                System.out.println(AZUL+"1. Elegir Arsenal brazo izquierdo");
                System.out.println(ROJO+"2. Elegir Arsenal brazo derecho");
                System.out.println(ROJOD+"3. Regresar al menú principal");
                System.out.print(ROSA+"Ingrese una opción: "+RESET);
                int paOption = sc.nextInt();
                sc.nextLine();
                switch (paOption) {
                    case 1: {
                        if (paElegidoIzq) {
                            System.out.println(GREENC+"Ya ha elegido el arma izquierdo."+RESET);
                            break;
                        } else {
                            System.out.println("\n");
                            System.out.println(BLANCO+"Armas disponibles para elegir:");
                            System.out.println(AZUL+"a. ARMA LÁSER");
                            System.out.println(ROJO+"b. LANZA FUEGO");
                            System.out.print(ROSA+"Ingrese una opción: "+RESET);
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
                                System.out.println(ROJOD+"La opción no es válida, inténtelo nuevamente.\n"+RESET);
                                paOption = 4;
                            }
                        }
                        break;
                    }
                    case 2: {
                        if (paElegidoDer) {
                            System.out.println(GREENC+"Ya ha elegido el arma derecha."+RESET);
                            break;
                        } else {
                            System.out.println("\n");
                            System.out.println(BLANCO+"Armas disponibles para elegir:");
                            System.out.println(AZUL+"a. MK61 VULCAN");
                            System.out.println(ROJO+"b. BAZUCA ANTIATAQUE");
                            System.out.print(ROSA+"Ingrese una opción: "+RESET);
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
                                System.out.println(ROJOD+"La opción no es válida, inténtelo nuevamente.\n"+RESET);
                                paOption = 4;
                            }
                        }
                        break;
                    }
                    case 3: {
                        System.out.println(TURQUESA+"Regresando..."+RESET);
                        paBucle = 1;
                        break;
                    }
                    default:
                        System.out.println(ROJOD+"La opción no es válida, inténtelo de nuevo.\n"+RESET);
                        break;
                }
            } catch (InputMismatchException e) {
                System.err.println(ROJOD+"Error: Ingrese un número entero válido."+RESET);
                sc.nextLine();
                paBucle = 0;
            }
        } while (paBucle != 1);
    }
}