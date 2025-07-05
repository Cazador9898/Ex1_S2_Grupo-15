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

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<NPrimos> NPrimos = new ArrayList<>();
        
        int opcion;
        
        do{
            
            System.out.println("Bienvenido a PrimeSecure");
            System.out.println("Usted a entrado al servicio de mensajeria interno");
            System.out.println("¿Que desea realizar?");
            System.out.println("1.- Verificar numero aignado para ingreso");
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
                    int Primo1;
                    Primo1 = sc.nextInt();
                    sc.nextLine();
                    boolean NoPrimo = false;
                    for (int i = 2; i < Primo1/2; i++) {
                        if (Primo1 % i ==0){
                            NoPrimo = true;
                            break;
                        }
                        
                    }
                    if (!NoPrimo){
                        
                        System.out.println("El numero ingresado"+Primo1+ "Es un numero primo");
                        System.out.println("Su numero a sido correctamente asignado");
                    }else{
                        System.out.println("El numero ingresado"+Primo1+ "No es un numero primo");
                        System.out.println("Su numero no esta correctamente asignado, por favor solicite uno nuevo");
                    }
                    
                    
                    break;
                
                case 2:
                    System.out.println("Ingrese el numero que desea verificar");
                    int Primo2;
                    Primo2 = sc.nextInt();
                    sc.nextLine();
                    boolean NoPrimox = false;
                    for (int i = 2; i < Primo2/2; i++) {
                        if (Primo2 % i ==0){
                            NoPrimox = true;
                            break;
                        }
                        
                    }
                    if (!NoPrimox){
                        
                        System.out.println("El numero ingresado"+Primo2+ "Es un numero primo");
                        System.out.println("Su numero a sido correctamente agregado a la lista");
                        NPrimos.add(Primo2);
                         
                    }else{
                        System.out.println("El numero ingresado"+Primo2+ "No es un numero primo");
                        System.out.println("Su numero no esta correctamente asignado, por favor solicite uno nuevo");
                    }
                    break;
                
                case 3:
                    break;
                    
                case 4:
                    break;
                
                case 5:
                     System.out.println("Gracias por usar nuestros servicios del banco BBK");
                     System.out.println("Por Favor vuelva pronto");
                     break;
                    
                default:
                     System.out.println("Opcion Invalida");
                    
                    
                
            }
            
        }while(opcion !=5);
        
        
        
        
    }
    
    
    public class PrimesList extends ArrayList<Integer>{
        
        
        
    }
    
    
    
}
