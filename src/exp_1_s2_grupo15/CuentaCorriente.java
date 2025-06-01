/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exp_1_s2_grupo15;

import java.util.Scanner;

/**
 *
 * @author wdiazc
 */
public class CuentaCorriente extends CuentaBancaria{
    
    @Override
    public void depositar ( int monto) {
     if (monto > 0){
     saldo += monto;
         System.out.println("¡Deposito realizado de manera exitosa!");
         System.out.println("¡Saldo Actual: $" + saldo +"pesos.");
     }else{
         System.out.println("El monto debe ser mayor a 0.");
     }
}

    @Override
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
     @Override     
    public void consultarSaldo (){
        System.out.println("Saldo Actual: $" + saldo + "pesos.");
    
    }
}

    
    

