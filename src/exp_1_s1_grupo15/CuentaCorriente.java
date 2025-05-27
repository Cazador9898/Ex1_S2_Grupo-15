/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exp_1_s1_grupo15;

import java.util.Scanner;

/**
 *
 * @author wdiazc
 */
public class CuentaCorriente {
    
    private int numeroCuenta;
    private int saldo;

    public CuentaCorriente() {
        this.numeroCuenta = (int)(Math.random() *900000000 + 100000000);
        this.saldo = 0;
    }
    
        
            public void depositar ( int monto) {
     if (monto > 0){
     saldo += monto;
         System.out.println("¡Deposito realizado de manera exitosa!");
         System.out.println("¡Saldo Actual: $" + saldo +"pesos.");
     }else{
         System.out.println("El monto debe ser mayor a 0.");
     }
}


    public void girar (int monto){
        if (monto <= 0){
            System.out.println("EL monto debe ser mayor a cero");
        }else if (monto > saldo) {
            System.out.println("Fondos insuficientes");
} else{
            saldo -= monto;
            System.out.println("¡Giro realizado de manera exitosa!");
            System.out.println("Saldo Actual: $"+ saldo + "pesos");
        }
}
          
    public void consultarSaldo (){
        System.out.println("Saldo Actual: $" + saldo + "pesos.");
    
    }
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    public int getSaldo(){
    return saldo;
    }
}

    
    

