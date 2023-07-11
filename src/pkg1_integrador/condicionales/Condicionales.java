
package pkg1_integrador.condicionales;
import java.util.Scanner;


public class Condicionales {

   
    public static void main(String[] args) {
        
        
        
        int tipoEmpleado;
        double sueldo;
        int pregunta;
        
        
        
        System.out.println("Quieres ingresar un empleado? (1 o 0): ");
        Scanner tteclado = new Scanner(System.in);
        pregunta = tteclado.nextInt();
    
        

            
            if(pregunta == 1){
                
                System.out.println("Ingrese tipo de Empleado: \n");
        Scanner teclado = new Scanner (System.in);
        tipoEmpleado = teclado.nextInt();
        
                
        switch (tipoEmpleado) {
            
            case 1: 
                sueldo = 15890;
                sueldo = sueldo + sueldo * 0.10;
                System.out.println("El sueldo de un repositor es: " + sueldo);
            break;
            
            case 2:
                sueldo = 25630.89;
                System.out.println("El sueldo de un cajero es: " + sueldo);
            break;
            
            case 3:
                sueldo = 35560.20;
                sueldo = sueldo - sueldo * 0.11;
                System.out.println("El sueldo de un supervisor con descuento de"
                        + " jubilacion es: " + sueldo);
            break;
            
            default:
                System.out.println("No existe este tipo de empleado");
            break;
        
        
        }
            
            }
            else{
                return ;
            }
        
       }
        
        
        
    
    
}
