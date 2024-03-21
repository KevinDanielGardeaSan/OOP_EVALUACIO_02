/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_has_a;

/**
 *
 * @author nacho
 */
public class EVA2_11_HAS_A {

    public static void main(String[] args) {
        Direccion direc = new Direccion ("Arco","15", "pasos", "12910", "chihuahua","chihuahua");
        Persona person = new Persona ("kevin","Gardea",18,direc);
        System.out.println(person);
    }   
}
