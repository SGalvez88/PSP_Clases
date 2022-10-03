import java.io.File;

public class pBuilderMkdir {

    public static void main(String[] args) throws Exception {
            
        ProcessBuilder processBuilder = new ProcessBuilder("mkdir","CarpetaCreada");
        processBuilder.directory(new File("d:\\carpetaNueva"));
        Process proceso;

        try {
            proceso = processBuilder.start();

        } catch (Exception exception) {
            System.out.println(exception.getMessage()); 
        }

    }
}
