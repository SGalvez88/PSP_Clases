import java.io.File;
import java.io.InputStream;

public class EjercicioDirectory {
    public static void main(String[] args) {
        
        File file = new File(".\\bin");
        ProcessBuilder processBuilder = new ProcessBuilder("java", "LecturaCmdBits");

        processBuilder.directory(file);
        System.out.println("El directorio de trabajo es: " + processBuilder.directory());
        Process process = null;

        try {
            
            process = processBuilder.start();
            int caracterUnicode;
            InputStream inputStream = process.getInputStream();

            while ((caracterUnicode = inputStream.read()) != -1) {
                System.out.print((char) caracterUnicode);
            }

            inputStream.close();

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
