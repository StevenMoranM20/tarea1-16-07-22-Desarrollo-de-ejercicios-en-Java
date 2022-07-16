/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TiposDatosAccionesElementales;

import java.util.Scanner;

/**
 *
 * @author STEVEN
 */
public class separarPorUnidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado un (1) número de cuatro (4) dígitos imprimirlo por separado en unidades,
       //decenas, centenas y unidades de mil
       // entrada
       int numero =1234;
       int unidades;
       int decenas;
       int centena;
       int unidad;
        
       //proceso
       unidades = numero%10;
       numero=numero/10;
       decenas=numero%10;
       numero=numero/10;
       centena=numero%10;
       unidad=numero/10;
       //salida
        System.out.println("Unidades: " +unidades);
        System.out.println("Decenas: " +decenas);
        System.out.println("Centenas: "+ centena);
        System.out.println("Unidad: "+ unidad);
        
        
       
       
    }
    
}
