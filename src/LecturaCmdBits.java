import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LecturaCmdBits {

    public static final int CARACTER_FINAL = -1;
    public static void main(String[] args) {
               
        ProcessBuilder processBuilder = new ProcessBuilder("cmd","/c","dir");
        Process process;

        try{
        
			process = processBuilder.start();
            int caracterUnicode;
                       
            InputStream inputStream = process.getInputStream();
           				
            while((caracterUnicode = inputStream.read()) != -1){
                
				System.out.print((char)caracterUnicode);
            }

            try {

                int valorSalida = process.waitFor();//recogemos valor de salida de system.exit
                System.out.println("El valor de salida es: "+valorSalida);

            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
			
            inputStream.close();

		}catch(Exception exception){
		
			System.out.println(exception.getMessage());
		
		}
    }
}
