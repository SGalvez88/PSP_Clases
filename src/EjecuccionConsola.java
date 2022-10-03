import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.stream.ImageInputStream;

public class EjecuccionConsola {
    public static void main(String[] args) {
        String linea = "";
        ProcessBuilder processBuilder = new ProcessBuilder("cmd","/c ","dir");
        Process process;
        
        try {
            process = processBuilder.start();

            InputStreamReader inputStreamReader = new InputStreamReader(process.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            
            while(( linea = bufferedReader.readLine()) != null){
                System.out.println(linea);
            }

            bufferedReader.close();
            
        } catch (IOException iOException) {
            System.out.println(iOException.getMessage());
        }
        
    }
}
