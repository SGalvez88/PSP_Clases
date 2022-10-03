public class Ejercicio29sep {
    public static void main(String[] args) {
        //1- Crea un programa que dado un String devuelva el primer carácter que no se repita, en caso de no existir devolver "*".
        //2- Crea un programa que ejecute el Ejercicio anterior y muestra su resultado y su valor de salida. 
        
        String cadena = "Hola";
        char letraAlmacenadaI;
        char letraAlmacenadaJ;
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            
            letraAlmacenadaI = cadena.charAt(i);
            //System.out.println(">>letra I: "+letraAlmacenadaI);

            for (int j = 0; j < cadena.length(); j++) {

                //letraAlmacenadaJ = cadena.charAt(j);
                
                System.out.println("i: "+ i +": "+letraAlmacenadaI+" - j :"+j+": "+cadena.charAt(j));

                if(letraAlmacenadaI == cadena.charAt(j+1)){
                    System.out.println("*");
                    contador++;
                    //return;
                    
                }else{
                    
                    System.out.println("primera letra que no se repite: "+letraAlmacenadaI);
                    //return;
                }
            }
        }

    
    }
}
