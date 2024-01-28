import java.util.Scanner;

public class AppExobot {
    public static final String ROJO = "\033[38;5;196m";
    public static final String ROJOD = "\033[38;5;160m";
    public static final String AZUL = "\033[38;5;20m";
    public static final String AZULD = "\033[38;5;21m";
    public static final String BLANCO = "\033[38;5;15m";
    public static final String GRIS = "\033[38;5;255m";
    public static final String ROSA = "\033[38;5;205m";
    public static final String VIOLETA = "\033[38;5;177m";
    public static final String RESET = "\u001B[0m";

    Scanner scString = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    private Exobot exobot;

    public void AppPrincipalExobot(){
        int opcion, opcion2;
        SoldadoRuso soldadoRuso = new SoldadoRuso();
        Mecatronico mecha = new Mecatronico();

        do {
            System.out.println(BLANCO +"Bienvenido a ExoBot" +RESET);
            System.out.println(AZUL+"1. Ingresar datos del Soldado" +ROJO+"\n2. Salir "+ROSA+"\nIngrese una opcion"+RESET);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println(AZULD+"Bienvenido a ExoBot Soldado, por favor ingrese sus datos: "+RESET);
                    // System.out.println("Ingrese su nombre: ");
                    // String nombreSoldado = scString.next();
                    System.out.println(ROJOD+"Ingrese su ID: "+RESET);
                    String idSoldado = scString.next();
                    soldadoRuso.setIdSoldado(idSoldado);
                    System.out.println();
                    mecha.asignarExobot(soldadoRuso, soldadoRuso.getIdSoldado(), exobot);
                    System.out.println();
                    mecha.armarExobot();
                    do {
                        System.out.println(BLANCO+"[E X O B O T]");
                        System.out.println(GRIS+"1. Personalizar Exobot"+AZUL+"\n2. Recargar Fuente"+AZULD+"\n3. Reemplazar Fuente"+ROJO+"\n4. Aprender un idioma"+ROJOD+"\n5. Salir");
                        System.out.println(ROSA+"Ingrese una opcion"+RESET);
                        opcion2 = sc.nextInt();
                        switch (opcion2) {
                            case 1:
                                mecha.personalizarExobot(exobot, exobot.generarCodigo());
                                break;
                            case 2:
                                soldadoRuso.recargarFuente();
                                break;

                            case 3:
                                soldadoRuso.reemplazarFuente();
                                break;

                            case 4:
                                    
                                break;

                            case 5:
                                System.out.println(VIOLETA+"Saliendo del programa..."+RESET);
                                break;
                            default:
                            System.out.println(ROJO+"Opción no valida, intentelo de nuevo."+RESET);
                                break;
                            }
                    } while (opcion2 != 5);
                    System.out.println();
                    break;
                case 2:
                    System.out.println(VIOLETA+"Gracias por usar Exobot"+RESET);
                    System.exit(0);
                    break;
                default:
                    System.out.println(ROJO + "No es una opción válida, intentelo de nuevo" + RESET);
                    break;
            }
            
        } while (opcion != 2);
        
    }
}