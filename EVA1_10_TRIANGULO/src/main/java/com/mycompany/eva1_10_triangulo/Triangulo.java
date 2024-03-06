/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_10_triangulo;

/**
 *
 * @author nacho
 */
public class Triangulo {
  private double base;
  private double altura;
  private double peri;
  
  //constructor
  public Triangulo(){
  base = -1;
  altura =-1;
  }
  
  //metodos get y set 
  
  public double getAltura(){
  return altura;
  }
  
  public double setAltura(double valor){
  altura = valor ;
      return 0;
  }
  
  public double getBase(){
  return base;
  }
  
  public double setBase(double valor){
  altura = valor ;
      return 0;
  }
  
  private double calcularArea(){
  return (base * altura) / 2;
  }
  
  private double calcularPerimetro(){
    double peri;
  peri= base + altura + Math.sqrt(Math.pow( base, 2)+Math.pow(altura, 2));
  //suma los tres lados, falta el lado mayor (hipotenusa)
  
  return peri;
  }
  
  public void imprimirDatos(){
  System.out.println("base: " + getBase());
  System.out.println("altura: "+ getAltura());
  System.out.println("El area de un tringulo es: " + calcularArea());
  System.out.println("El perimetro del tringulo es: " + calcularPerimetro() ) ;    
  
  
  }
}
