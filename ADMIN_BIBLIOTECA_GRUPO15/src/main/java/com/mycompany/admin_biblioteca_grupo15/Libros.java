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
public class Libros {
 private String titulo;
 private String autor;
 private int anio;
 private boolean prestado;

    public Libros(String titulo, String autor, int anio, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.prestado = false;
    }
 
 public String getTitulo(){
 return titulo;
 }
    
 public String getAutor(){
return autor;
}
 
 public int getAnio(){
 return anio;
 }
 
 public boolean isPrestado(){
 return prestado;
 }
 
 public void prestar(){
 prestado = true;
 }
 
 public void devolver(){
prestado = false;
}
 
 @Override
 public String toString(){
 return "Titulo:" + titulo+
         "\nAutor:" + autor +
         "\nAño" + anio +
         "\nEstado" + (prestado ? "Prestado" : "Disponible");
 }
 
 
 
 
}
