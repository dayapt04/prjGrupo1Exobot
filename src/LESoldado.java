import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;

public abstract class LESoldado {

    public LEExtremidades pierna;
    public LEExtremidades brazo;

    private String leIdSoldado;

    //constructor
    public LESoldado() {
        this.pierna = new LEExtremidades();
        this.brazo = new LEExtremidades();
        generarNuevoIdSoldado();
        guardarDatosEnArchivoCSV();
    }

    public String getLeIdSoldado() {
        return leIdSoldado;
    }

    public void setLeIdSoldado(String leIdSoldado) {
        try {
            if (leIdSoldado == null || leIdSoldado.isEmpty()) {
                generarNuevoIdSoldado();
                guardarDatosEnArchivoCSV();
            } else {
                this.leIdSoldado = leIdSoldado;
            }
        } catch (Exception e) {
            System.err.println("ERROR: Al establecer el ID del soldado. " + e.getMessage());
        }
    }
    
    protected void guardarDatosEnArchivoCSV() {
        String archivoCSV = "dataFile\\leIdSoldados.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoCSV, true))) {
            writer.write("id:" + this.leIdSoldado);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("ERROR: Al guardar los datos en el archivo CSV. " + e.getMessage());
        }
    }

    private void generarNuevoIdSoldado() {
        SecureRandom random = new SecureRandom();
        String caracteresValidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
        StringBuilder leIdSoldadoBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(caracteresValidos.length());
            leIdSoldadoBuilder.append(caracteresValidos.charAt(index));
        }
    
        this.leIdSoldado = leIdSoldadoBuilder.toString();
    }
}
