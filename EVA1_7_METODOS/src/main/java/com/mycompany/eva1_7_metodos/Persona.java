/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_7_metodos;

/**
 *
 * @author nacho
 */
public class Persona {
    /* nombre, apellidos, edad*/
    private String nombre;
    private String apellido;
    private int edad; 
    
    //metodos get y set 
    //intemediarior entre nuestros atributos 
    //Escribir nombre 
     public String getNombre(){
        return nombre;
    }
    //ESCRIBIR nombre
    public void setNombre(String valor){
       nombre = valor; 
     }
    
    //Escribir apellido 
     public String getApellido(){
        return apellido;
    }
    //ESCRIBIR apellido
    public void setApellido(String valor){
       apellido = valor; 
    }
    
    //Escribir edad 
    public int getEdad(){
        return edad;
    }
    //ESCRIBIR edad
    public void setEdad(int valor){
       edad = valor;
 }
    
 //reglas para el nombre de los metodos en java 
 //es un verbo, empieza en minusculas 
    public String generarnombre(){
    return nombre +" "+ apellido;
                }
    //calcular año de nacimineto 
    public int calcularannionac(){
     return 2024 - edad;    
    }
}
