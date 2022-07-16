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
public class numeroCapicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Ejercicio 2.
Dado un número entero cuya cantidad de dígitos es igual a 5, determine si es
capicúa.
Nota: un número capicúa es aquel que se lee igual hacia adelante que hacia atrás*/
        // entrada 
 int numero ;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrse un numero");
        numero =entrada.nextInt();
         int resto,falta=numero,numeroInvertido=0;
        // proceso
       
        while( falta>0){
        resto = falta% 10;
        falta = falta /10;
        numeroInvertido = numeroInvertido * 10 + resto;
         }
        if (numeroInvertido== numero) {
            System.out.println("es un numero capicua");
            
        } else {
            System.out.println("no es numero capicua");
        }
 
        

    }
    
        
    }

