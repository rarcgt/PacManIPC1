
package practica_uno_pacman770c;

import java.util.Scanner;

public class Practica_uno_Pacman770c {

   
    public static void main(String[] args) {
       int opt=0;
       String nombreUsuario="";
       String tableroP [][] = new String[5][6];
       String tableroG [][] = new String[10][10];
        
       
        
        CargarMenu();
        opt=CargarOpcionElegida();
        
        switch(opt){
            
            case 1:
                
                break;
                
            case 2:
                
                break;
                
            case 3:
                System.out.println("Espero que vuelvas pronto :)");
               
               break;   
               
            default:
                System.out.println("Ingrese una opcion valida");
                
                
            
        }
        
     
        
        
    }
      
private static Integer CargarOpcionElegida(){
    Scanner entradaTeclado=new Scanner(System.in);
    int opcionElegida=0;
    
    opcionElegida= entradaTeclado.nextInt();
    
    return opcionElegida;
}     
  
private static String CargarMenu(){
    System.out.println("===MENU DE INICIO");
        System.out.println("1. Iniciar Juego");
        System.out.println("2. Historial de Partidas");
        System.out.println("3. Salir");
        return null;
    
}

}
