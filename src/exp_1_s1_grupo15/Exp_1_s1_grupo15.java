/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp_1_s1_grupo15;
import exp_1_s1_grupo15.Cliente;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author wdiazc
 */
public class Exp_1_s1_grupo15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int opcion;
        
        
        do{
            
        
        System.out.println("Bienvenido al Banco BBK");
        System.out.println("Por Favor seleccione que le Gustaria hacer en su cuenta");
        System.out.println("1.- Depositar dinero a su cuenta");
        System.out.println("2.- Girar dinero de su cuenta");
        System.out.println("3.- Consulta de Saldo");
        System.out.println("4.- Visualizar sus datos personales");
        System.out.println("5.- Registrar nuevo usuario a su cuenta");
        System.out.println("6.- Salir");
        System.out.println("Por Favor Selecciones una opcion");
        opcion = sc.nextInt();
        sc.nextLine();
            
        
            switch (opcion){
                
                case 1:
                    System.out.println("Revisando el estado de la cuenta para el Deposito");
                    System.out.println("");
                    
                    break;
                    
                case 2:
                    System.out.println("Revisando el estado de la cuenta para el Giro");
                    System.out.println("");
                    
                    
                    break;
                    
                case 3:
                    System.out.println("Revisando estado de cuenta...");
                    System.out.println("");
                    
                    break;
                    
                case 4:
                    System.out.println("Mostrando datos personales de su cuenta");
                    System.out.println("");
                    
                    break;
                    
                case 5:
                    System.out.println("Bienbenido al menu de registro de nuevo Usuario");
                    System.out.println("");
                    
                    break;
                    
                case 6:
                    System.out.println("Gracias por usar nuestros servicios del banco BBK");
                    System.out.println("Por Favor vuelva pronto");
                    
                    break;
                    
                default:
                    System.out.println("Opcion Invalida");
                    
  
                
            }
            
        }while (opcion !=6);
        

        
        
        
        
        
        
    }
    
}
