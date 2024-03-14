/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_vehiculo;

/**
 *
 * @author nacho
 */
public class EVA1_6_VEHICULO {

    public static void main(String[] args) {
     VEHICULO Micarro = new VEHICULO();
     Micarro.setMarca("FORD");
     Micarro.setModelo("F150");
     Micarro.setAnnio(2024);
     Micarro.setPrecio(500000);
     Micarro.setColor("RoJo");
     
     System.out.println("Marca: " + Micarro.getMarca());
     System.out.println("Modelo: " + Micarro.getModelo());
     System.out.println("Años: " + Micarro.getAnnio());
     System.out.println("Color: " + Micarro.getColor());
     System.out.println("Valor: " + Micarro.getPrecio());
     
    }
}
