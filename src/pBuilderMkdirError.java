import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

public class pBuilderMkdirError {
    public static void main(String[] args) {
        
        ProcessBuilder processBuilder = new ProcessBuilder("cmd","/c","mkdir","b");
        processBuilder.directory(new File("C:\\Users\\galve\\Documents"));
        Process proceso = null;
       
        try {
            proceso = processBuilder.start();
            
            String line = "";

            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            while ((line = reader.readLine()) != null) {
              
                System.out.println(line);
                
            }
            reader.close();
            
            reader = new BufferedReader(new InputStreamReader(proceso.getErrorStream()));

            while ((line = reader.readLine()) != null) {
              
                System.out.println("error:"+line);
                
            }
            reader.close();

        } catch (Exception exception) {
            System.out.println(exception.getMessage()); 
        }
        
    }
    
}
