/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exp3_s7_grupo15;

/**
 *
 * @author wdiazc
 */
public class AgregarPrimos implements Runnable {
    
    private PrimeList lista;
    private int numero = 2;
    
    
    
    public AgregarPrimos (PrimeList lista){
    this.lista = lista;    
    }
    
    
    @Override
    public void run(){
        while (!Thread.currentThread().isInterrupted()){
        try{
        lista.add(numero);
            System.out.println("Agregado Automaticamente: " + numero);
        } catch (IllegalArgumentException ignored){
                
        }
        numero++;
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
        break;
        }
               
        }
    
    
    }
    
}
