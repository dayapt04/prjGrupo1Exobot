import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;

public abstract class Soldado {

    private Extremidad brazo;
    private Extremidad pierna;

    public Extremidad getBrazo() {
        return brazo;
    }

    public void setBrazo(Extremidad brazo) {
        this.brazo = brazo;
    }

    public Extremidad getPierna() {
        return pierna;
    }

    public void setPierna(Extremidad pierna) {
        this.pierna = pierna;
    }

    private String idSoldado;

    public String getIdSoldado() {
        return idSoldado;
    }

    public void setIdSoldado(String idSoldado) {
        SecureRandom random = new SecureRandom();
        String caracteresValidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        StringBuilder idSoldadoBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(caracteresValidos.length());
            idSoldadoBuilder.append(caracteresValidos.charAt(index));
        }

        this.idSoldado = idSoldadoBuilder.toString();

        guardarDatosEnArchivoCSV();
    }

    protected void guardarDatosEnArchivoCSV() {
        String archivoCSV = "idSoldados.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoCSV, true))) {
            writer.write( "id:" + this.idSoldado);
            writer.newLine();
            System.out.println(" -> Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("ERROR: Al guardar los datos. ");
        }
    }

}