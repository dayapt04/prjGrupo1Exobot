import java.util.InputMismatchException;
import java.util.Scanner;

public class AppLZExobot {
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

    private static JSExobot exobot = new JSExobot();
    private static JSIabot ia = new JSIabot();

    private static PABrazoDerecho bder = new PABrazoDerecho();
    private static PABrazoIzquierdo bizq = new PABrazoIzquierdo();
    private static PAArmaLaser laser = new PAArmaLaser();
    private static PABAntiataque bazuca = new PABAntiataque();
    private static PAMK61 mk = new PAMK61();
    private static PALanzafuego fuego = new PALanzafuego();
    private static LZDisenoExabot exabotDiseno = new LZDisenoExabot();

    Scanner sc = new Scanner(System.in);

    public void LZAppPrincipalExobot() {
        for (int soldadoNumero = 1; soldadoNumero <= 20; soldadoNumero++) {
            System.out.println("--------------------------------------------");
            System.out.println("Soldado " + soldadoNumero + ":");
            int opcion = 0, opcion2 = 0;

            LESoldadoRuso soldadoRuso = new LESoldadoRuso();
            PAMecatronico oMecatronico = new PAMecatronico();

            do {
                try {
                    System.out.println("-----------------------------------------------");
                    System.out.println("      B I E N V E N I D O  A  E X O B O T ");
                    System.out.println("-----------------------------------------------");
                    System.out.println(
                            AZUL + "1. Mostrar datos del Soldado" + ROJO + "\n2. Pasar al siguiente soldado. " + ROSA
                                    + "\n3. Salir del programa. " + RESET);
                    System.out.print(TURQUESA + "\nIngrese una opción:" + RESET);
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("***************************************************************");
                            System.out.println(
                                    AZULD + "Bienvenido a ExoBot SOLDADO, por favor guarde sus datos: " + RESET);
                            System.out.println(TURQUESA + "            O");
                            System.out.println("           /|\\");
                            System.out.println("           / \\" + RESET);
                            System.out.println(ROJOD + "Su ID es: " + ROSA + soldadoRuso.getLeIdSoldado() + RESET);
                            System.out.println("***************************************************************");
                            System.out
                                    .println("El IABOT ha proporcionado el código de activación: " + ia.getIdExobot());
                            System.out.println();
                            oMecatronico.paAsignarExobot(soldadoRuso, soldadoRuso.getLeIdSoldado(), exobot);

                            oMecatronico.paArmarExobot();
                            System.out.println();

                            do {
                                System.out.println("----------------------------------------");
                                System.out.println("\t [E X O B O T]");
                                System.out.println("----------------------------------------");
                                System.out.println(GRIS + "1. Personalizar Exobot" + AZUL + "\n2. Recargar Fuente"
                                        + AZULD
                                        + "\n3. Reemplazar Fuente" + ROJO + "\n4. Aprender un idioma" + ROJOD
                                        + "\n5. Volar con ayuda del EXOBOT" + GREENC
                                        + "\n6. Correr con ayuda del EXOBOT"
                                        + AZULD +
                                        "\n7. Saltar con ayuda del EXOBOT." + TURQUESA
                                        + "\n8. Mostrar Exobot." + GRIS
                                        + "\n9. Pasar al siguiente soldado." + VIOLETA + "\n10. Salir del programa."
                                        + RESET);
                                System.out.print(ROSA + "Ingrese una opción:" + RESET);
                                opcion2 = sc.nextInt();
                                switch (opcion2) {
                                    case 1:
                                        oMecatronico.paPersonalizarExobot(exobot, ia.getIdExobot(), bder, bizq, laser,
                                                bazuca, mk,
                                                fuego);
                                        break;
                                    case 2:
                                        soldadoRuso.paRecargarFuente();
                                        laser.paRecargarFuente();
                                        bazuca.paRecargarFuente();
                                        mk.paRecargarFuente();
                                        fuego.paRecargarFuente();
                                        break;

                                    case 3:
                                        soldadoRuso.paReemplazarFuente();
                                        laser.paReemplazarFuente();
                                        bazuca.paReemplazarFuente();
                                        mk.paReemplazarFuente();
                                        fuego.paReemplazarFuente();
                                        break;

                                    case 4:
                                        System.out.println(TURQUESA);
                                        System.out.println(exobot.jsaprenderLexicoEspanol());
                                        System.out.println(exobot.jsaprenderFoneticaEspanol());
                                        System.out.println(exobot.jsaprenderGramaticaEspanol());
                                        System.out.println();
                                        System.out.println(exobot.jsaprenderLexicoIngles());
                                        System.out.println(exobot.jsaprenderFoneticaIngles());
                                        System.out.println(exobot.jsaprenderGramaticaIngles());

                                        System.out.println(RESET);

                                        System.out.println(GREENC + "\n--------CONOCIMIENTOS OBTENIDOS--------\n");
                                        exobot.jsConocimientoEspanol();
                                        exobot.jsConocimientoIngles();
                                        System.out.println(RESET);
                                        break;
                                    case 5:
                                        exobot.turbo.paVolar();
                                        break;
                                    case 6:
                                        exobot.eInferior.paCorrer(200);
                                        break;
                                    case 7:
                                        exobot.eInferior.paSaltar(50);
                                        break;
                                    case 8:
                                        System.out.println("\n\t\t [ E X O B O T ]\n");
                                        exabotDiseno.lzVerExabot();
                                        break;
                                    case 9:
                                        System.out.println(VIOLETA + " -> Pasando al siguiente soldado..." + RESET);
                                        System.out.println();
                                        opcion = 2;

                                        break;
                                    case 10:
                                        System.out.println("Saliendo del programa...");
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println(ROJO + "Opción no valida, intentelo de nuevo." + RESET);
                                        break;
                                }
                            } while (opcion2 != 9);
                            System.out.println();
                            break;
                        case 2:
                            System.out.println(VIOLETA + " -> Gracias por usar Exobot" + RESET);
                            break;
                        case 3:
                            System.out.println("Programa finalizado.");
                            System.exit(0);
                            break;
                        default:
                            System.out.println(ROJO + "No es una opción válida, intentelo de nuevo" + RESET);
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.err.println(ROJOD + " Error: Ingrese un número entero válido." + RESET);
                    sc.nextLine();
                    opcion = 0;
                }
            } while (opcion != 2);

        }

    }
}