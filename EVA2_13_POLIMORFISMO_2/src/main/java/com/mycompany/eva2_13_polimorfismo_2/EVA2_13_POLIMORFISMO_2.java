/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_13_polimorfismo_2;

/**
 *
 * @author nacho
 */
public class EVA2_13_POLIMORFISMO_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*Persona perso1 = new Persona("mauricio", "guerrero");
        Persona perso2 = new Persona("uriel", "parra");
        Persona perso3 = new Persona("pablo", "alegandro");
        
        Estudiante estu1 = new Estudiante("23550398", "maurico", "guerrero");
        Estudiante estu2 = new Estudiante("23550873", "uriel", "parra");
        Estudiante estu3 = new Estudiante("23550254", "pablo", "alegandro");
        
        imprimirDatos(perso1);
        imprimirDatos(perso2);
        imprimirDatos(perso3);
        imprimirDatos(estu1);
        imprimirDatos(estu2);
        imprimirDatos(estu3);*/

        //poblacion de estudiantes del Tec 2
        Estudiante estudiantes[] = new Estudiante[3000];
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante("0000", "Estudiante", "Sin Datos");
        }
        for (int i = 0; i < estudiantes.length; i++) {
            imprimirDatos(estudiantes[i]);
        }
    }

    public static void imprimirDatos(MostrarDatos datos) {
        datos.imprimirDatos();
        //CASTING
        Estudiante estu;
        Persona perso;
        if (datos instanceof Estudiante) { //DETERMINA LA CLASE DEL OBJETO 
            estu = (Estudiante) datos;
        } else {
            perso = (Persona) datos;
        }
    }
}
    

