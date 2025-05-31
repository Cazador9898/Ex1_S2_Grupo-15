/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp_1_s1_grupo15;
import exp_1_s1_grupo15.Cliente;
import exp_1_s1_grupo15.CuentaCorriente;
import exp_1_s1_grupo15.CuentaDeAhorro;
import exp_1_s1_grupo15.CuentaDeCredito;
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
                    
                    if (rutBuscado.length()< 11 || rutBuscado.length() > 12){
                        System.out.println("--RUT invalido. debe tener entre 11 y 12 caracteres (inlcuyendo puntos y guion.)");
                    }
                    
                    Cliente ClienteActual=null;
                    for (Cliente c : clientes){
                        if(c.getRut().equals(rutBuscado)){
                            ClienteActual = c;
                            break;
                        }
       
                    }
                    
                    
                    if (ClienteActual != null){
                     System.out.println("Bienvenido Nuevamente "+ ClienteActual.getNombre() +" al Banco BBK");
                     System.out.println("¿Que le gustaria Hacer Hoy?");
                     
                     
                     do{
                          System.out.println("\n 1.- Depositar dinero");
                          System.out.println("2.- Girar dinero");
                          System.out.println("3.- Consulta de Saldo");
                          System.out.println("4.- Visualizar sus datos personales");
                          System.out.println("5.- Salir");
                          System.out.println("Por Favor Selecciones una opcion del 1 al 5");
                          opcion = sc.nextInt();
                          sc.nextLine();
            
        
                         switch (opcion){
                
                            case 1:
                    
                                System.out.println("Ingrese monto a depositar");
                                    int monto = sc.nextInt();
                                    sc.nextLine();
                                    ClienteActual.getCuenta().depositar(monto);
                                
                              break;
                                  
                            case 2:

                                System.out.println("Ingrese monto a girar");
                                    int montoGiro = sc.nextInt();
                                    sc.nextLine();
                                    ClienteActual.getCuenta().girar(montoGiro);
                                    break;
                    
                            case 3:
                                  ClienteActual.getCuenta().consultarSaldo();
                                  break;
                    
                            case 4:
                                System.out.println("\n Mostrando Datos Personales");
                                System.out.println("RUT:"+ClienteActual.getRut());
                                System.out.println("Numbre:"+ClienteActual.getNombre());
                                System.out.println("Apellido Paterno:"+ClienteActual.getApellidoPaterno());
                                System.out.println("Apellido Materno:"+ClienteActual.getApellidoMaterno());
                                System.out.println("Domicilio:"+ClienteActual.getDomicilio());
                                System.out.println("Comuna:"+ClienteActual.getComuna());
                                System.out.println("Telefono: +56"+ClienteActual.getTelefono());
                                System.out.println("Numero de cuenta Corriente:"+ClienteActual.getCuenta().getNumeroCuenta());
                                System.out.println("Saldo en la cuenta :"+ClienteActual.getCuenta().getSaldo());
                    
                                break;

                            case 5:
                                    System.out.println("Gracias por usar nuestros servicios del banco BBK");
                                    System.out.println("Por Favor vuelva pronto");
                                break;
                    
                            default:
                                    System.out.println("Opcion Invalida");
                         
}
                         
                     } while (opcion !=5);
     
            }else{
                   System.out.println("Ingrese un Rut Valido o usted no es un ciente registrado");
                    }
                    break;
    
                case 2:
                    
                    
                            System.out.println("Gracias por eleginos y registrarse en nuestro Bnaco BBK");
                            System.out.println("\n A continuacion le pediremos una serie de datos, por favor rellenarlos lo mejor podible");
                            System.out.println("\n Por Favor ingrese su Rut con puntos y con Guion, Ejemplo (11.222.333-4)");
                            String rut = sc.nextLine();
                            if (rut.length() < 11 || rut.length() > 12){
                                System.out.println("RUT invalido debe ingresar entre 11 y 12 caracteres (incluyendo punto y guion)");
                            break;
                            }
                            System.out.println("Por Favor Ingrese su nombre");
                            String nombre = sc.nextLine();
                            System.out.println("Por Favor Ingrese su Apellido Paterno");
                            String apPaterno = sc.nextLine();
                            System.out.println("Por Favor Ingrese su Apellido Materno");
                            String apMaterno = sc.nextLine();
                            System.out.println("Por Favor Ingrese su Domicilio");
                            String domicilio = sc.nextLine();
                            System.out.println("Por Favor Ingrese su Comuna");
                            String comuna = sc.nextLine();
                            System.out.println("Por Favor ingrese su numero de telefono, tenga en cuenta que el +56 ya esta asignado");
                            int telefono = sc.nextInt();
                            sc.nextLine();
                            
                            CuentaCorriente cuenta = new CuentaCorriente();
                            Cliente nuevoCliente = new CuentaCorriente(rut, nombre, apPaterno, apMaterno, domicilio, comuna, telefono, cuenta);

                            clientes.add(nuevoCliente);
                            
                            ClienteActual = nuevoCliente;
                                    
                                    
                    System.out.println("\nMuchas gracias por su registro");
                    System.out.println("Su nuevo numero de cuenta es: "+ nuevoCliente.getCuenta().getNumeroCuenta());
                    System.out.println("\nAhora puede iniciar secion en nuetro banca en Linea para realizar las transacciones que necesites");
                    
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
