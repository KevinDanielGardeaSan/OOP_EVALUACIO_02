/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_constructores;

/**
 *
 * @author nacho
 */
public class EVA1_9_CONSTRUCTORES {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("cliente: " + cuenta.getCliente());
        System.out.println("cuenta: " + cuenta.getNoCuenta(0));
        System.out.println("saldo: " + cuenta.getsaldo());
        
    }
}
