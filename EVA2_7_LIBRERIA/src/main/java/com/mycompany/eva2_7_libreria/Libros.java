/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_7_libreria;

/**
 *
 * @author nacho
 */
public class Libros extends Publicaciones {
   private String autor; 
   
 //constructores
   //regla siempre se llama al constructor de la superclase
    public Libros(String autor) {
        super();
        this.autor = "----";
    }
    
    public Libros(String autor, String titulo, double precio, int copias) {
        super(titulo, precio, copias);
        this.autor = autor;
    }

    //get y set
    
    public void ordenarCopias(int cantidad) {
        //las copias se deben agregar a la variable
        //copias de clase Publicaciones
        int existencias = getCopias();
        setCopias(existencias + cantidad);
    }
   @Override
   public void imprimirDatos(){
   super.imprimirDatos();
   System.out.println("Autor" + autor);
    }
}
