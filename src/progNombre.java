import java.util.Scanner;

public class progNombre {
    public static void main(String[] args) {
        //lanzar programa como proceso, pasarle el nombre como proceso, recoger la salida de pantalla
        // y recoger los errores recoger por flujo de caracteres.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("introduce tu nombre");
        
        String nombre = scanner.nextLine();
       
        System.out.println("hola "+nombre);

        scanner.close();

    }
}
