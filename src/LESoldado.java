import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;

public abstract class LESoldado {

    private PAExtremidad leBrazo;
    private PAExtremidad lePierna;

    public PAExtremidad getLeBrazo() {
        return leBrazo;
    }

    public void setLeBrazo(PAExtremidad leBrazo) {
        this.leBrazo = leBrazo;
    }

    public PAExtremidad getLePierna() {
        return lePierna;
    }

    public void setLePierna(PAExtremidad lePierna) {
        this.lePierna = lePierna;
    }

    private String leIdSoldado;

    public String getLeIdSoldado() {
        return leIdSoldado;
    }

    public void setLeIdSoldado(String leIdSoldado) {
        SecureRandom random = new SecureRandom();
        String caracteresValidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        StringBuilder leIdSoldadoBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(caracteresValidos.length());
            leIdSoldadoBuilder.append(caracteresValidos.charAt(index));
        }

        this.leIdSoldado = leIdSoldadoBuilder.toString();

        guardarDatosEnArchivoCSV();
    }

    protected void guardarDatosEnArchivoCSV() {
        String archivoCSV = "leIdSoldados.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoCSV, true))) {
            writer.write("id:" + this.leIdSoldado);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("ERROR: Al guardar los datos. ");
        }
    }

}