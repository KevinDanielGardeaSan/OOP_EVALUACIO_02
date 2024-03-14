/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_6_vehiculo;

/**
 *
 * @author nacho
 */
public class VEHICULO {
        /*
    Marca
    Modelo
    año
    color
    valor
    */
    private String marca;
    private String modelo;
    private int annio;
    private String color;
    private double precio;
    
    
    
     //LEER MARCA:
    public String getMarca(){
        return marca;
    }
    //ESCRIBIR MODELO
    public void setMarca(String valor){
       marca = valor; 
    
       
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public int getAnnio(){
        return annio;
    }
    public void setAnnio(int valor){
        annio = valor;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String valor){
        color = valor;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double valor){
        precio = valor;   
}
}
