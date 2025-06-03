/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exp_1_s2_grupo15;

/**
 *
 * @author wdiazc
 */
public abstract class CuentaBancaria {
    protected int numeroCuenta;
    protected int saldo;
    
    
    public CuentaBancaria(){
    this.numeroCuenta = (int)(Math.random() * 900000000) + 100000000;
    this.saldo = 0;
    }
    
    public CuentaBancaria (int numeroCuenta, int saldo){
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
    
    }
    
    public int getNumeroCuenta(){
    return numeroCuenta;
    }
    public int getSaldo(){
    return saldo;
    
    }
    
    public abstract void depositar (int monto);
    public abstract void girar (int monto);
    public abstract void consultarSaldo();
}
