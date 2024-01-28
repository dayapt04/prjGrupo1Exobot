public class AppExobot {
    public static void main(String[] args) throws Exception {
    Exobot ex = new Exobot();

    System.out.println("\n------------ESPAÑOL-----------\n");
    System.out.println(ex.jsaprenderFoneticaEspanol());
    System.out.println(ex.jsaprenderGramaticaEspanol());
    System.out.println(ex.jsaprenderLexicoEspanol());
    System.out.println("\n------Conocimientos--------\n");
    ex.jsConocimientoEspanol();

    System.out.println("\n------------INGLES----------\n");
    System.out.println(ex.jsaprenderFoneticaIngles());
    System.out.println(ex.jsaprenderGramaticaIngles());
    System.out.println(ex.jsaprenderLexicoIngles());
    System.out.println("\n------Conocimientos--------\n");
    ex.jsConocimientoIngles();

    }
}