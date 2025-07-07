/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exp3_s7_grupo15;

import java.util.Scanner;

/**
 *
 * @author wdiazc
 */
public class AgregarPrimos implements Runnable {
    
    private PrimeList lista;
    private int numero ;
    
    
    
    public AgregarPrimos (PrimeList lista){
    this.lista = lista; 
    this.numero = numero;
    }
    
    
    @Override
    public void run(){
     try{
        lista.add(numero);
         System.out.println("numero agregado: " + numero);
         }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
               
        }
        
    }
   
