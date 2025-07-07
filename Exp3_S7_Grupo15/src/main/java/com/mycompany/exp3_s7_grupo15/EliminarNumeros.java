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
public class EliminarNumeros implements Runnable {
    private PrimeList lista;
    private int numero;

    public EliminarNumeros(PrimeList lista) {
        this.lista = lista;
        this.numero = numero;
    }
    
   @Override
   public void run(){
    if (lista.remove((Integer) numero)) {
        System.out.println("Numero eliminado: " + numero);
    } else {
           System.out.println("El numero no esta en la lista");
       }
       }
    
    }
    
