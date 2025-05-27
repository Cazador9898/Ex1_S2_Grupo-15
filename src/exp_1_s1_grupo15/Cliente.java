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
    private CuentaCorriente cuentaCorriente;

    public Cliente(String Rut, String Nombre, String ApellidoPaterno, String ApellidoMaterno, String Domicilio, String Comuna, int Telefono, CuentaCorriente cuentaCorriente) {
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Domicilio = Domicilio;
        this.Comuna = Comuna;
        this.Telefono = Telefono;
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


    public void setCuenta( CuentaCorriente cuentaCorriente) {
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
    public CuentaCorriente getCuenta() {
        return cuentaCorriente;
    }

    }


      
    
    

