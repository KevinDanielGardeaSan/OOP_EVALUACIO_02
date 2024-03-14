/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_clase_persona;

/**
 *
 * @author nacho
 */
public class EVA1_5_CLASE_PERSONA {

 public static void main(String[] args) {
 Persona perso1 = new Persona ();
      
    perso1.setNombre("Kevin");
    System.out.println(perso1.getNombre());
    perso1.setApellidos("Gardea");
      System.out.println(perso1.getApellidos());
      perso1.setEdad(18);
      System.out.println(perso1.getEdad(0));
      
    }
}

class Persona{
    //ATRIBUTOS --> ESTADO DEL OBJETO
    // NO DEBEN SER ACCESIBLES DIRECTAMENTE
    private String nombre;
    private String apellidos;
    private int edad;
    
    //METODOS:
    //PUBLICOS --> SON LA INTERFAZ
    //SI SON PARA MANIPULAR LOS ATRIBUTOS HAY UN ESTANDAR
    //EN JAVA
    //METODOS SET (ESCRITURA GET (LECTURA
    //METODOS SET Y GET
    
    //LEER NOMBRE:
    public String getNombre(){
        return nombre;
    }
    //ESCRIBIR NOMBRE
    public void setNombre(String valor){
       nombre = valor; 
    }
    //APELLIDO
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String valor){
    apellidos = valor; }
    
    //EDAD
    public int getEdad (int valor){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;   
    }
}  
 
    
