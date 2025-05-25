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
    
    
    public CuentaCorriente (int numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
    this.saldo = 0;
    }
    
    public int getNumeroCuenta(){
    return numeroCuenta;
    }
    
    
    
    public int getSaldo(){
    return saldo;    
    }
    
    public void depositar (Scanner sc) {
    int monto

    do{
    System.out.println("ingrese el monto a depositar: $");
    monto = sc.nextInt();
    sc.nextLine();
    
    if (monto > 0){
    System.out.println("¡Deposito realizado de manuera exitosa!");
    System.out.println("Saldo Actual: $" + saldo + "pesos.");
    }else{
        System.out.println("el monto a ingresar, debe ser mayor a 0.");
    }
    }while (monto <= 0);
}

    public void girar (Scanner sc){
        int monto;
        do{
            System.out.println("Ingrese el monto a girar: $");
            monto = sc.nextInt();
            sc.nextLine();
        
        if (monto <= 0){
    System.out.println("El monto debe ser mayor a cero.");
        }else if (monto > saldo) {
    System.out.println("fondos insuficientes.");
        }else{
    saldo -= monto;
    System.out.println("¡Giro realizado de manera exitosa!");
    System.out.println("Saldo Actual: $" + saldo + "pesos.");
 }
} while (true);
}
    
    public void consultarSaldo (Scanner sc){
        System.out.println("Saldo Actual: $" + saldo + "pesos.");
    
    }
}

