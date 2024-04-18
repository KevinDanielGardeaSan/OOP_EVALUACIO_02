/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_polimorfismo;

/**
 *
 * @author nacho
 */
public class EVA2_12_POLIMORFISMO {

    public interface MostrarDatos {
    public void imprimirDatos();
    }}
   /*
 imprimirDatos(perso1);   
 imprimirDatos(perso2); 
 imprimirDatos(perso3); 
 imprimirDatos(estu1); 
 imprimirDatos(estu2); 
 imprimirDatos(estu3); */

//poblacion de estudiantes del tec 2 
Estudiante estudiante[] = new Estudiante [3000];
for (int i = 0; < estudiantes.lenght; i++){
      estudiantes [i]=i new estudiante ("0000", "estudiantes", "sin datos");
}
for (int i = 0; < estudiantes.lenght; i++){
imprimirDatos(estudiantes[i]);
}

}
    public static void imprimirDatos(MostrarDatos datos){
    datos.imprimirDatos();
    //cASTINg
    Estudiante estu;
    if(datos instanceof)
        estu = (Estudiante)datos;
    else
        perso = (persona)datos;
    }
}
   

