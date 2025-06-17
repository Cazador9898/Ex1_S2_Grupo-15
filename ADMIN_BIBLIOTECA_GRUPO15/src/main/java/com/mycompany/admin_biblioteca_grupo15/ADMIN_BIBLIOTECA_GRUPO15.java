/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.admin_biblioteca_grupo15;
import java.util.Scanner;
import java.util.ArrayList;
import com.mycompany.admin_biblioteca_grupo15.LibroNoEncontradoException;
import com.mycompany.admin_biblioteca_grupo15.LibroYaPrestadoException;
/**
 *
 * @author guzma
 */
public class ADMIN_BIBLIOTECA_GRUPO15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca miBiblioteca = new Biblioteca();
        int opcion = 0;
        
        do{
            System.out.println("--Bienvenido a la BIBLIOTECA DUOC UC");
            System.out.println("1-. Registrar libro");
            System.out.println("2-. Registrar Uruario");
            System.out.println("3-. Buscar libro por nombre");
            System.out.println("4-. Prestar libro");
            System.out.println("5-. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            
            
        switch (opcion){
        
            case 1:
                miBiblioteca.registrarLibro(sc);
                break;
            case 2:
                miBiblioteca.registrarUsuario(sc);
                break;
            case 3:
                miBiblioteca.buscarLibro(sc);
                break;
            case 4:
                try{
                    System.out.println("Indica el nombre del libro que deseas");
                    String titulo = sc.nextLine();
                    miBiblioteca.prestarLibro(titulo);                
                } catch (LibroNoEncontradoException e){
                    System.out.println("Lo siento" + e.getMessage());
                }catch (LibroYaPrestadoException e){
                    System.out.println("Lo siento" + e.getMessage());
                }
                break;                
            case 5:    
                System.out.println("Gracias por usar la BIBLIOTECA DUOC UC ");
                break;
          }
    }while (opcion != 4);
           
        
        
    }
    
    
    
}
