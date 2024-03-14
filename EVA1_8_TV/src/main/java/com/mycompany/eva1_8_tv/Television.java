/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_8_tv;

/**
 *
 * @author nacho
 */
public class Television {
    //atributos privados
    int volumen;
    int canal;
    boolean estaEncendida;
    
    //contructor
    //contructor sin argumentos: constructor default 
    //Metoso para inicilizar los objetos 
    public Television(){
        //no es obligatorio 
    volumen = 30;
    canal = 5;
    estaEncendida = false;
    }
    
    //
    public void subirVolumen(){
      if (estaEncendida && (volumen < 100));
      volumen = volumen + 1;
      //volumen++;
      
    }
    public void bajarvolumen(){
    if (estaEncendida && (volumen > 0 ));
    volumen = volumen - 1;
    }
    public void subirCanal(){
    if (estaEncendida);
    canal = canal + 1;
    //canal+=1;
    //canal++;
    }
    public void bajarCanal(){
    if (estaEncendida && (canal > 0 ));
    canal = canal - 1 ;
    }
    public void cambiarCanal (int Nocanal){
                       //!---> negacion
    if (estaEncendida && !(Nocanal >= 0 ));
    canal = Nocanal;
    }
    public void power(){
     /*if (estaEncendida == true)
         estaEncendida = false;
     else
         estaEncendida = true;*/
     estaEncendida = !estaEncendida;
     
     
    }
    public void emprimirConfiguracion(){
        if (estaEncendida);
    System.out.println("Volumen: "+ volumen);
    System.out.println("canal: "+ canal);
    System.out.println("power: "+ estaEncendida);
    }
}
