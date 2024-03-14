/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_formula_general;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EVA1_11_FORMULA_GENERAL {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int N; // Número de ecuaciones a resolver
        System.out.print("Ingrese la cantidad de ecuaciones a resolver: ");
        N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Ecuación #" + i);
            System.out.print("Ingrese el valor de A: ");
            double a = input.nextDouble();
            System.out.print("Ingrese el valor de B: ");
            double b = input.nextDouble();
            System.out.print("Ingrese el valor de C: ");
            double c = input.nextDouble();

            double discriminante = b * b - 4 * a * c;

            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            } else if (discriminante == 0) {
                Double x1 = -b / (2 * a);
                System.out.println("Raíces iguales: X1 = X2 = " + x1);
            } else {
                System.out.println("Raíz imaginaria");
            }
        }
    }
}
