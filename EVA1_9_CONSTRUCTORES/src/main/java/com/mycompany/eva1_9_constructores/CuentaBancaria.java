/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_9_constructores;

/**
 *
 * @author nacho
 */
public class CuentaBancaria {
    private int Nocuenta;
    private double saldo;
    private String cliente;
    
    //constructor default
    public CuentaBancaria(){
    Nocuenta = 0;
    cliente= "SIN CLIENTE";
    saldo = 1000000;
    }
    
    //get y set 
    public int getNoCuenta(int cuenta){
    return Nocuenta;
    }
    
    public int setNoCuenta(int cuenta){
    Nocuenta = cuenta;
        return 0; 
    }
    
    public String getCliente(){
    return cliente;
    }
    public void setCliente(String nomcliente){
    cliente = nomcliente;
    }
    
    public double getsaldo(){
    return saldo;
    }
    
    public void retirar (double monto){
    if (saldo>= monto)// hay que tener dinero
        saldo = saldo - monto;
    }
    public void depositar(double deposito){
    saldo = saldo + deposito;
    
    }
    
}
