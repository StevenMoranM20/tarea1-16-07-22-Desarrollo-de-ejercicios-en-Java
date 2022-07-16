/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ControlFlujoDatos;

import java.util.Scanner;

/**
 *
 * @author STEVEN
 */
public class añoBisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Todos los años que se dividen exactamente entre 400, o que son divisibles
exactamente entre 4 y no son divisibles exactamente entre 100 son años bisiestos.
Usando estas premisas crea un algoritmo que lea una fecha como un número
entero con el formato ddmmaaaa, y luego extraiga el año de la fecha indicando si
el mismo es un año bisiesto o no.*/
        // entrada 
        int ano;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el año a verificar ");
        ano = entrada.nextInt();
        
        // proceso
        if ((ano % 4 ==0 && ano % 100 != 0)|| ano % 400 ==0) {
        //salida   
            System.out.println("El año es bisiesto");
        } else {
                System.out.println("El año no es bisiesto");
        }
        // año visiesto 2024
        
        
        
        
    }
    
}
