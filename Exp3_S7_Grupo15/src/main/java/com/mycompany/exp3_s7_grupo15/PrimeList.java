/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exp3_s7_grupo15;
import java.util.ArrayList;

/**
 *
 * @author wdiazc
 */
public class PrimeList extends ArrayList<Integer>{
    
    public boolean isPrime(int n){
    if(n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++){
        if (n % i == 0) return false;
    
    }
    return true;
    }
    
    @Override
    public boolean add (Integer numero){
    
        if (!isPrime(numero)){
        throw new IllegalArgumentException ("El numero" + numero + "no es primo");
        }
        return super.add(numero);
           }
    
    
    
    public int getPrimesCount(){
    return this.size();
    
    }
    public boolean agregarNumero (int numero) throws IllegalArgumentException {
    if (isPrime(numero)){
    this.add(numero);
    return true;
   
    }else{
    throw new IllegalArgumentException("El numero no es primo");
    }
    }
    public void eliminarPares(){
    this.removeIf(n -> n%2 ==0);
    
    }
    
    
}
