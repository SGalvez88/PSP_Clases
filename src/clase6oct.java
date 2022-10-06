import java.io.File;

public class clase6oct {

    /*.redirectOutput(file), .redirectError(file), redirectInpunt(file)*/
    public static void main(String[] args) {
        Process proceso = null;
        ProcessBuilder processBuilder = new ProcessBuilder("cmd");
        File fileEntrada = new File("resources\\fichero.bat");
        File fileSalida = new File("resources\\salida.txt");
        File fileError = new File("resources\\error.txt");

        processBuilder.redirectInput(fileEntrada);
        processBuilder.redirectOutput(fileSalida);
        processBuilder.redirectError(fileError);

        try {

            proceso = processBuilder.start();
            
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}
