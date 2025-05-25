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
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        Cliente ClienteEncontrado = null;
        String rutBuscado = "";
        int opcion;
        
        
        do{
            
        
        System.out.println("Bienvenido al Banco BBK");
        System.out.println("Por Favor seleccione que le Gustaria hacer en su cuenta");
        System.out.println("1.- Depositar dinero");
        System.out.println("2.- Girar dinero");
        System.out.println("3.- Consulta de Saldo");
        System.out.println("4.- Visualizar sus datos personales");
        System.out.println("5.- Registrar nuevo usuario");
        System.out.println("6.- Salir");
        System.out.println("Por Favor Selecciones una opcion del 1 al 6");
        opcion = sc.nextInt();
        sc.nextLine();
            
        
            switch (opcion){
                
                case 1:
                    System.out.println("Ingrese su RUT con puntos y guion.");
                    rutBuscado = sc.nextLine();
                    ClienteEncontrado = buscarCliente(clientes, rutBuscado);
                    
                    
                    if (ClienteEncontrado != null){
                    ClienteEncontrado.getCuentaCorriente().depositar(sc);
            }else{
                   System.out.println("ciente no registrado");
                    }
                    break;
                                  
                case 2:
                    System.out.println("Ingrese su RUT con puntos y guion.");
                    rutBuscado = sc.nextLine();
                    ClienteEncontrado = buscarCliente(clientes, rutBuscado);
                    
                   if (ClienteEncontrado != null){
                    ClienteEncontrado.getCuentaCorriente().girar(sc);
            }else{
                   System.out.println("ciente no registrado");
                    }
                    break;
                    
                case 3:
                    System.out.println("Ingrese su RUT con puntos y guion.");
                    rutBuscado = sc.nextLine();
                    ClienteEncontrado = buscarCliente(clientes, rutBuscado);
                    
                   if (ClienteEncontrado != null){
                    ClienteEncontrado.getCuentaCorriente().consultarSaldo(sc);
            }else{
                   System.out.println("ciente no registrado");
                    }
                    break;
                case 4:
                    
                    
                    
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
    
        public static Cliente buscarCliente(ArrayList<Cliente> clientes, String rutBuscado) {
        for (Cliente c : clientes) {
            if (c.getRut().equals(rutBuscado)) {
                return c;
            }
        }
        return null;
    }
}
