/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.admin_biblioteca_grupo15;
import java.util.ArrayList;
/**
 *
 * @author guzma
 */
public abstract class Libros {
    
    private String Fantasia;
    private String Accion;
    private String Drama;
    private String Romance;
    private String Miedo;

    public Libros(String Fantasia, String Accion, String Drama, String Romance, String Miedo) {
        this.Fantasia = Fantasia;
        this.Accion = Accion;
        this.Drama = Drama;
        this.Romance = Romance;
        this.Miedo = Miedo;
    }

    public String getFantasia() {
        return Fantasia;
    }

    public String getAccion() {
        return Accion;
    }

    public String getDrama() {
        return Drama;
    }

    public String getRomance() {
        return Romance;
    }

    public String getMiedo() {
        return Miedo;
    }

    public void setFantasia(String Fantasia) {
        this.Fantasia = Fantasia;
    }

    public void setAccion(String Accion) {
        this.Accion = Accion;
    }

    public void setDrama(String Drama) {
        this.Drama = Drama;
    }

    public void setRomance(String Romance) {
        this.Romance = Romance;
    }

    public void setMiedo(String Miedo) {
        this.Miedo = Miedo;
    }
    
    
    
    
}
