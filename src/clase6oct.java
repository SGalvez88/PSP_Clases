import java.io.File;

public class clase6oct {

    /*.redirectOutput(file), .redirectError(file), redirectInpunt(file)*/
    public static void main(String[] args) {
        
        ProcessBuilder processBuilder = new ProcessBuilder();
        File fileSalida = new File("src\\salida.txt");
        File fileError = new File("src\\error.txt");

        processBuilder.redirectOutput(fileSalida);
        processBuilder.redirectError(fileError);

        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}
