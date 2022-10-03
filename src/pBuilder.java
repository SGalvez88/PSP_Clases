import java.io.File;

public class pBuilder {
    public static void main(String[] args) throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder("Notepad");
        Process proceso = null;

        try {
            proceso = processBuilder.start();
            System.out.println("Ok");
            
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
}
