/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exp3_s7_grupo15;

/**
 *
 * @author wdiazc
 */
public class EliminarNumeros implements Runnable {
    private PrimeList lista;

    public EliminarNumeros(PrimeList lista) {
        this.lista = lista;
    }
    
   @Override
   public void run(){
   while (!Thread.currentThread().isInterrupted()){
   if (!lista.isEmpty()){
   int eliminado = lista.remove(0);
       System.out.println("eliminado automaticamente: " + eliminado);
   
   }
   try{
   Thread.sleep(20000);   
   }catch (InterruptedException e){
   break;
   }
   }
   
   }
    
    }
    
