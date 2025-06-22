/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.admin_biblioteca_grupo15;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
import com.mycompany.admin_biblioteca_grupo15.LibroNoEncontradoException;
import com.mycompany.admin_biblioteca_grupo15.LibroYaPrestadoException;
import java.util.HashMap;



/**
 *
 * @author guzma
 */
public class Biblioteca {

    private ArrayList<Libros> listaLibros;
    private HashMap< String, Usuario> mapaUsuario = new HashMap<>();
    private HashSet<Usuario> usuariosUnicos = new HashSet<>();
    private TreeSet<Libros> catalogoOrdenado = new TreeSet<>();
    
    
    public Biblioteca (){
    listaLibros = new ArrayList<>();
    
      }
    
    
    
        public void ListaDeLibros(String[] args){
            
            List<String> listaLibros1;
        listaLibros1 = Arrays.asList("Los tres Chiflados","El Ticket Dorado","El arte de la guerra","Java para principiantes","Pedrisimo",
                "El maravilloso mundo de Jack","La Niebla","Mundo Jurasico","Pepe y sus globos","La llamada de chutulu","Viaje al centro de la tierra");
        
                    List<String> listaLibros2;
        listaLibros2 = Arrays.asList("El Vagabundo","Charly y la Fabrica de Chocolate","Todo en Crypto","Amor  primer Vista",
                 "El viaje del mañana","El Gran Robo","Solo Leveling");
        
        
        
        Set<String> ListaFinal = new HashSet<>(listaLibros1);
        ListaFinal.addAll(listaLibros2);
        
            System.out.println("Lista de los libros en la Biblioteca, recordar revisar si los libros estan disponibles son: "+ListaFinal.size());
            for(String e:ListaFinal){
                System.out.println(e);
            }
            

        }
        
        public void UsuariosActivos (String[] args){
            
            Set<String> UsuariosActivos = new TreeSet<>();
            UsuariosActivos.add("Yochua");
            UsuariosActivos.add("Alex");
            UsuariosActivos.add("MR.LIBROS");
            UsuariosActivos.add("Juanin");
            UsuariosActivos.add("Ouguro");
            UsuariosActivos.add("Ochulu");
            
            UsuariosActivos.forEach(System.out::println);
            
        }
        
    
    //Registro de libros
        public void registrarLibro(Scanner sc){
            System.out.println("\n---Registro de Libro---");
            System.out.println("Titulo del libro");
            String titulo = sc.nextLine();
            System.out.println("Autor: ");
            String autor = sc.nextLine();
            System.out.println("Año de publicacion");
            int anio = sc.nextInt();
            sc.nextLine();
            
            Libros libroNuevo = new Libros (titulo, autor, anio, true);
            listaLibros.add(libroNuevo);
            catalogoOrdenado.add(libroNuevo);
            
            System.out.println("---LIBRO REGISTRADO CON EXITO---");
        }
        
        
        

            //Registro de Usurario
            
        public void registrarUsuario(Scanner sc){
            System.out.println("\n---Registro de Usuario---");
            System.out.println("Nombre");
            String nombre = sc.nextLine();
            System.out.println("Apellido Paterno");
            String apellidoPaterno = sc.nextLine();
            System.out.println("Apellido Materno");
            String apellidoMaterno = sc.nextLine();
            System.out.println("Direccion");
            String direccion = sc.nextLine();
            System.out.println("Comuna");
            String comuna = sc.nextLine();
            int telefono = 0;
            boolean telefonoValido =false;
            String rut = "";
            boolean rutValido = false;
            
            while(!telefonoValido){
            try{
                System.out.println(" telefono (sin +56)");
                telefono = sc.nextInt();
                sc.nextLine();
                telefonoValido=true;
            } catch (InputMismatchException e){
                System.out.println("Ingresar numero Valido");
                sc.nextLine(); 
            }
}
            
            while (!rutValido){
            
            try{
                System.out.println("Rut (con puntos y con guion");
                rut = sc.nextLine();
                
                if(rut.isEmpty()){
                throw new IllegalArgumentException("El rut no puede estar vacio");
                }
            if (rut.length() < 11 || rut.length() >12){
                throw new IllegalArgumentException ("El RUT debe tener entre 11 y 12 caracteres");
            }
            
            rutValido = true;
            }catch (IllegalArgumentException e){
                System.out.println("rut mail ingresado" + e.getMessage());
            }
            }
             
    
            Usuario nuevoUsuario = new Usuario( nombre, apellidoPaterno, apellidoMaterno, direccion, comuna, telefono, rut);
            mapaUsuario.put(rut, nuevoUsuario);
            usuariosUnicos.add(nuevoUsuario);
            System.out.println("---USUARIO REGISTRADO CON EXITO---");
            }
           //busqueda de libro
        
        public void buscarLibro( Scanner sc){
            System.out.println("\n---Buscar libro por nombre---");
            System.out.println("Ingrese titulo del libro");
            String tituloBuscado = sc.nextLine();
            
            boolean encontrado =false;
            for( Libros libro : listaLibros){
            if (libro.getTitulo().equalsIgnoreCase(tituloBuscado)){
                System.out.println("\n--Libro Encontrado");
                System.out.println("Titulo: " + libro.getTitulo());
                System.out.println("Autor: "+ libro.getAutor());
                System.out.println("Año:" + libro.getAnio());
                encontrado = true;
                break;            
            }
        }
        if(!encontrado){
        
            System.out.println("Libro no encontrado en la biblioteca");
        
        }
        }
        public void prestarLibro(String titulo) throws LibroNoEncontradoException, LibroYaPrestadoException {
        boolean encontrado = false;
        
        for (Libros libro : listaLibros){
                if(libro.getTitulo().equalsIgnoreCase(titulo)){
        encontrado = true;
        
        if (libro.isPrestado()){
        throw new LibroYaPrestadoException("El Libro" + titulo + "Ya esta ocupado");
        }else {
        libro.prestar();
            System.out.println("Libro" + titulo + "prestado con exito");
        }
        
        }
            
       }
        if (!encontrado){
        throw new LibroNoEncontradoException ("El Libro" + titulo + "no existe en la biblioteca");
}
}
        public void mostrarUsuariosUnicos(){
            System.out.println("\n---Lista de usuarios registrados---");
            for (Usuario usuario : usuariosUnicos){
                System.out.println(usuario.getNombre());
            }
        }
        
        
        
}
