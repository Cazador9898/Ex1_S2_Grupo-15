/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exp3_s7_grupo15;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author guzma
 */
public class Exp3_S7_Grupo15 {
    
    private static PrimeList lista = new PrimeList();

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean salir = false;
      
        
        Thread hiloAgregar = new Thread(new AgregarPrimos(lista));
        Thread hiloEliminar = new Thread(new EliminarNumeros( lista));
        hiloAgregar.start();
        hiloEliminar.start();
        
        int opcion;
        
        do{
            
            System.out.println("Bienvenido a PrimeSecure");
            System.out.println("Usted a entrado al servicio de mensajeria interno");
            System.out.println("¿Que desea realizar?");
            System.out.println("1.- Verificar numero asignado para ingreso");
            System.out.println("2.- Agregar nuevo numero asignado");
            System.out.println("3.- Revisar lista de numeros asigandos");
            System.out.println("4.- Remover numero de la lista");
            System.out.println("5.- Salir");
            System.out.println("Por Favor Selecciones una opcion del 1 al 5");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el numero que desea verificar");
                    int numeroVerificar = sc.nextInt();
                    sc.nextLine();
                    if (lista.isPrime(numeroVerificar)){
                        System.out.println("El numero" + numeroVerificar + "es primo");
                    }else{
                        System.out.println("El numero" + numeroVerificar + "no es primo");
                    }
                    break;
                                    
                case 2:
                    System.out.println("Ingrese el numero que desea verificar");
                    int numeroAgregar = sc.nextInt();
                    sc.nextLine();
                    try{
                    lista.add(numeroAgregar);
                        System.out.println("Numero agregado correctamente");
                    
                    } catch (IllegalArgumentException e ){
                        System.out.println("Error" + e.getMessage());
                    }
                            break;
                                  
                case 3:
                    System.out.println("Lista Actual de numeros primos");
                    for (Integer n : lista){
                        System.out.println(n + " ");
                    }
                    System.out.println("\n total de primos" + lista.getPrimesCount());
                    break;
                    
                case 4:
                    if (!lista.isEmpty()){
                        int eliminado = lista.remove(0);
                        System.out.println("Numero eliminado: " + eliminado);
                    }else{
                        System.out.println("La lista esta vacia");
                    }
                    
                    break;
                
                case 5:
                     System.out.println("Gracias por usar nuestros servicios del banco BBK");
                     System.out.println("Por Favor vuelva pronto");
                     hiloAgregar.interrupt();
                     hiloEliminar.interrupt();
                     salir= true;
                     break;
                    
                default:
                     System.out.println("Opcion Invalida");
                    
                    
                
            }
            
        }while(!salir);
        sc.close();
        
        
        
        
    }
    
    
    public class PrimesList extends ArrayList<Integer>{
        
        
        
    }
    
    
    
}
