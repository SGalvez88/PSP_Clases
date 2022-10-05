import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class clase4octOutputStream {
    public static void main(String[] args) {
        /** getOuputStream() */
        
        ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "date");
        Process proceso = null;
        
        try {
          
          proceso = processBuilder.start(); //Ejecutamos el proceso

          OutputStream outputStream = proceso.getOutputStream(); 
          
          outputStream.write("04/10/2022".getBytes());
          
          outputStream.flush();

          int caracterUnicode;

          InputStream inputStream = proceso.getInputStream();

          while ((caracterUnicode = inputStream.read()) != -1) { // Imprimimos la salida caracter a caracter
            System.out.print((char) caracterUnicode);
          }

          inputStream.close();

          InputStream errorStream = proceso.getErrorStream(); // Creamos un InpuStream para leer el error
          BufferedReader br = new BufferedReader(
            new InputStreamReader(errorStream)
          );

          String linea;

          while ((linea = br.readLine()) != null) System.out.println(
            "Error-> " + linea
          );

          errorStream.close();

        } catch (IOException e) {
          e.printStackTrace();
        }
    
        try {
          int valorSalida = proceso.waitFor(); // Recojemos la salida de System.exit
          System.out.println("El valor de la salida: " + valorSalida);
        
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

    }
}
