/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_herencia;

/**
 *
 * @author nacho
 */
public class EVA2_4_HERENCIA {

    public static void main(String[] args) {
    Persona perso = new Persona();
    System.out.println(perso.toString());
    //el metodo string viene por herencia no fue implementado por nosotros 
    //todas las clases por herencia decienden de la clase object
    Estudiante estu = new Estudiante();
    System.out.println("nombre: " + estu.getNombre());
    System.out.println("apellido : " + estu.getApellidos());
    System.out.println("edad: " + estu.getEdad());
        
    }
}

    class Persona{
        
    private String nombre;
    private String apellidos;
    private int edad;
    
     public Persona() {
     }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
 }

class Estudiante extends Persona{
private String NoControl;

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }


}