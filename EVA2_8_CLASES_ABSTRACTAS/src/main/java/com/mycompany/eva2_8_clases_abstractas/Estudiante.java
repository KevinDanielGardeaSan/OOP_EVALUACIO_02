/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_8_clases_abstractas;

/**
 *
 * @author nacho
 */
public class Estudiante extends Persona{
 private String noControl;

    public Estudiante() {
    }

    public Estudiante(String noControl) {
        super();
        this.noControl = noControl;
    }

    public Estudiante(String noControl, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    //al ser protect podemos ver los atributos al estar vinculados por herencia
    //tambien hay visibilidad de paquete: clases en mismo paquete pueden ver atributos y metodos protegidos 
public void imprimirDatos(){
System.out.println("Nombre: " + nombre);
System.out.println("Apellidos: " + apellidos);
System.out.println("Edad: " + edad);
System.out.println("NoControl: " + noControl);

}    
 
}
