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
        

        int opcion;
        int opcion1;
       
        
      
        Cliente Nuevo1 = new Cliente("18.526.852-8","Nuevo","Apellido Paterno","Apellido Materno","Mi casa","hause",963524152,528961456,0,753159852);
        
        
       clientes.add(Nuevo1);
       
       Cliente ClienteActual = null;
        
  
        do{
            
        
        System.out.println("Bienvenido al Banco BBK");
        System.out.println("Por Favor inicie secion o cree un usuario");
        System.out.println("1.- Iniciar Secion");
        System.out.println("2.- Registrar Nuevo Usuario");
        System.out.println("3.- Salir");
        System.out.println("Seleccione una de las opciones.");
        opcion1 = sc.nextInt();
        sc.nextLine();
        
            switch (opcion1){
                case 1:
                    System.out.println("Ingrese su RUT con puntos y guion.");
                    String rutBuscado = sc.nextLine();
                    
                    ClienteActual=null;
                    for (Cliente c : clientes){
                        if(c.getRut().equals(rutBuscado)){
                            ClienteActual = c;
                            break;
                        }
       
                    }
                    
                    
                    if (ClienteActual != null){
                     System.out.println("Bienvenido Nuevamente "+Nuevo1.getNombre()+"al Banco BBK");
                     System.out.println("¿Que le gustaria Hacer Hoy?");
                     
                     
                     do{
                          System.out.println("1.- Depositar dinero");
                          System.out.println("2.- Girar dinero");
                          System.out.println("3.- Consulta de Saldo");
                          System.out.println("4.- Visualizar sus datos personales");
                          System.out.println("5.- Salir");
                          System.out.println("Por Favor Selecciones una opcion del 1 al 5");
                          opcion = sc.nextInt();
                          sc.nextLine();
            
        
                         switch (opcion){
                
                            case 1:
                    
                                Nuevo1.depositar(sc);
 
                             break;
                                  
                            case 2:

                                Nuevo1.girar(sc);
         
                             break;
                    
                            case 3:

                                Nuevo1.consultarSaldo(sc);
         
                                break;
                    
                            case 4:
                                System.out.println("Mostrando Datos Personales");
                                System.out.println("RUT:"+Nuevo1.getRut());
                                System.out.println("Numbre:"+Nuevo1.getNombre());
                                System.out.println("Apellido Paterno:"+Nuevo1.getApellidoPaterno());
                                System.out.println("Apellido Materno:"+Nuevo1.getApellidoMaterno());
                                System.out.println("Domicilio:"+Nuevo1.getDomicilio());
                                System.out.println("Comuna:"+Nuevo1.getComuna());
                                System.out.println("Telefono: +56"+Nuevo1.getTelefono());
                                System.out.println("Numero de cuenta Corriente:"+Nuevo1.getNumeroCuenta());
                                System.out.println("Saldo en la cuenta :"+Nuevo1.getSaldo());
                    
                                break;
       
                            case 5:
                                    System.out.println("Gracias por usar nuestros servicios del banco BBK");
                                    System.out.println("Por Favor vuelva pronto");
                    
                                 break;
                    
                            default:
                                    System.out.println("Opcion Invalida");
      
                          }
                         
                     }while (opcion !=5);
     
            }else{
                   System.out.println("Ingrese un Rut Valido o usted no es un ciente registrado");
                    }
                    break;
    
                case 2:
                    
                   
                 
                    clientes.add(Nuevo1);
                            System.out.println("Gracias por eleginor y registrarse en nuestro Bnaco BBK");
                            System.out.println("A continuacion le pediremos una serie de datos, por favor rellenarlos lo mejor podible");
                            System.out.println("Por Favor ingrese su Rut con puntos y con Guion, Ejemplo (11.222.333-4)");
                            Nuevo1.setRut(sc.next());
                            System.out.println("Por Favor Ingrese su nombre");
                            Nuevo1.setNombre(sc.next());
                            System.out.println("Por Favor Ingrese su Apellido Paterno");
                            Nuevo1.setApellidoPaterno(sc.next());
                            System.out.println("Por Favor Ingrese su Apellido Materno");
                            Nuevo1.setApellidoMaterno(sc.next());
                            System.out.println("Por Favor Ingrese su Domicilio");
                            Nuevo1.setDomicilio(sc.next());
                            System.out.println("Por Favor Ingrese su Comuna");
                            Nuevo1.setComuna(sc.next());
                            System.out.println("Por Favor ingrese su numero de telefono, tenga en cuenta que el +56 ya esta asignado");
                            Nuevo1.setTelefono(sc.nextInt());
                            int NumeroCuetna =(int)(Math.random()*900000000)+100000000;
                            Nuevo1.setNumeroCuenta(NumeroCuetna);
        
                    System.out.println("Muchas gracias por su registro");
                    System.out.println("Su nuevo numero de cuenta es"+Nuevo1.getNumeroCuenta());
                    System.out.println("Ahora puede iniciar secion en nuetro banca en Linea para realizar las transacciones que necesites");
                    
                    break;
                    
                case 3:
                    System.out.println("Gracias por usar nuestros servicios del banco BBK");
                    System.out.println("Por Favor vuelva pronto");
                    
                    break;
                    
                default:
                    System.out.println("Opcion Invalida");
     
                
            }
    
        }while (opcion1 !=3);
        
    }
    
        public static Cliente buscarCliente(ArrayList<Cliente> clientes, String rutBuscado) {
        for (Cliente c : clientes) {
            if (c.getRut().equalsIgnoreCase(rutBuscado)) {
                return c;
            }
        }
        return null;
    }
        

}
