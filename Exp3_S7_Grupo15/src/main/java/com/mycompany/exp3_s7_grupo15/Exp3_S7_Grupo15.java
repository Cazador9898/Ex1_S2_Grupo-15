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
      Thread hiloAgregar = null;
      Thread hiloEliminar = null;
        
            
        int opcion;
        
        do{
            
            System.out.println("\nBienvenido a PrimeSecure");
            System.out.println("\nUsted a entrado al servicio de mensajeria interno");
            System.out.println("¿Que desea realizar?");
            System.out.println("1.- Verificar numero asignado para ingreso");
            System.out.println("2.- Agregar nuevo numero a la lista");
            System.out.println("3.- Revisar lista de numeros asignados");
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
                    System.out.println("Ingrese el numero que desea agregar:");
                    int numeroAgregar = sc.nextInt();
                     sc.nextLine();

                    hiloAgregar = new Thread(() -> {
                        try {
                            if (lista.isPrime(numeroAgregar)) {
                            lista.add(numeroAgregar);
                            System.out.println("Numero agregado correctamente: " + numeroAgregar);
                        } else {
                        System.out.println("\nEl numero: " + numeroAgregar + " NO es primo. No se agrego.");
                          }
                        } catch (IllegalArgumentException e) {
                        System.out.println(" Error: " + e.getMessage());
                        }
                        });
                     hiloAgregar.start();

                    try {
                    hiloAgregar.join();
                    } catch (InterruptedException e) {
                    System.out.println(" Error " + e.getMessage());
                     }
                     break;
                                  
                case 3:
                    System.out.println("Lista Actual de numeros primos");
                    if (lista.isEmpty()){
                        System.out.println("la lista esta vacia");
                    }else{
                    lista.forEach(System.out::println);
                    }
                    System.out.println("\n total de primos" + lista.getPrimesCount());
                    break;
                    
                case 4:
                    System.out.println("Ingrese el número que desea eliminar:");
                     int numeroEliminar = sc.nextInt();
                    sc.nextLine();

                    hiloEliminar = new Thread(() -> {
                    if (lista.remove((Integer) numeroEliminar)) {
                        System.out.println("\nNúmero eliminado correctamente: " + numeroEliminar);
                    } else {
                    System.out.println("\nEl número " + numeroEliminar + " NO estaba en la lista.");
                    }
                    });
                        hiloEliminar.start();

                    try {
                    hiloEliminar.join();
                    } catch (InterruptedException e) {
                         System.out.println("Error: " + e.getMessage());
                    }
                    break;
                
                case 5:
                     System.out.println("Gracias por usar nuestros servicios del banco BBK");
                     System.out.println("Por Favor vuelva pronto");
                     if (hiloAgregar != null) hiloAgregar.interrupt();
                     if (hiloEliminar != null) hiloEliminar.interrupt();
                     salir= true;
                     break;
                    
                default:
                     System.out.println("Opcion Invalida");
                    
                    
                
            }
            
        }while(!salir);
        sc.close();
        
        
        
        
    }
    
    
    
    
}
