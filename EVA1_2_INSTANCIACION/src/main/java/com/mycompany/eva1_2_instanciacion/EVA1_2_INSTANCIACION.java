/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_2_instanciacion;

/**
 *
 * @author nacho
 */
public class EVA1_2_INSTANCIACION {

    public static void main(String[] args) {
        
        int valor= 100;
        //INSTANCIACION: Crear el objeto --> darlke memoria
        //CLASE IDENTIFICADOR = new Constructor();
        //contructor --> Metodo con el micmo nombre que la clase 
        Persona perso1 = new Persona() ;//instanciacion
        System.out.println(perso1);
        //perso1 --> referencia --> dirección en memoria 
        Vehiculo carrito = new Vehiculo();
        System.out.println(carrito);
        carrito.marca = "Ford";
        carrito.modelo = "Mustan";
        carrito.annio = 1977; 
        System.out.println("Marca: " + carrito.marca);
        System.out.println("Modelo: " + carrito.modelo);
        System.out.println("Año: " + carrito.annio);
    }
}
//Tipo de dato abstracto
class Persona{ 

}

class Vehiculo{
//ATRIBUTOS
String marca;
int annio;
String modelo;

}