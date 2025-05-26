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
public class Cliente {
    
    private String Rut;
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String Domicilio;
    private String Comuna;
    private int Telefono;
    private int numeroCuenta;
    private int saldo;
    private int cuentaCorriente;

    public Cliente(String Rut, String Nombre, String ApellidoPaterno, String ApellidoMaterno, String Domicilio, String Comuna, int Telefono, int numeroCuenta, int saldo,int cuentaCorriente) {
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Domicilio = Domicilio;
        this.Comuna = Comuna;
        this.Telefono = Telefono;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cuentaCorriente = cuentaCorriente;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public void setComuna(String Comuna) {
        this.Comuna = Comuna;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setCuenta(int cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public String getRut() {
        return Rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public String getComuna() {
        return Comuna;
    }

    public double getTelefono() {
        return Telefono;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getCuenta() {
        return cuentaCorriente;
    }


    
    
            public void depositar (Scanner sc) {
    int monto;

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
        break;
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


      
    
    

