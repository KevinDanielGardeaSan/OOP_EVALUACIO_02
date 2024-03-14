/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_metodos;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EVA1_7_METODOS {

    public static void main(String[] args) {
       
       
        Persona perso = new Persona();
        perso.setNombre("Kevin");
        perso.setApellido("Gardea");
        perso.setEdad(18);
        
        System.out.println("El nombre es " + perso.getNombre());
        System.out.println("Nacio en año " + perso.calcularannionac());
        //----
        Persona[] grupo = new Persona[5];
        //tipo objeto hay que crear cada objeto 
        for (int i =0; i < grupo.length; i++){Scanner input = new Scanner(System.in);
          grupo[i] = new Persona();
          //una vez creado el objeto, hay que llenarlo:
          
          System.out.println("Introduce el nombre: ");
          String nombre = input.nextLine();
          grupo[i].setNombre(nombre);
          
          //apellido
          System.out.println("Introduce el apellido: ");
          String ape = input.nextLine();
          grupo[i].setApellido(ape);
          
          //edad
          System.out.println("Introduce la edad: ");
          int edad = input.nextInt();
          grupo[i].setEdad(edad);
        }
        //leer
        for (int i =0; i < grupo.length; i++){
         System.out.println("El nombre es " + grupo[i].getNombre());
          System.out.println("Nacio en año " + grupo[i].calcularannionac());
          
        }
    }
}
