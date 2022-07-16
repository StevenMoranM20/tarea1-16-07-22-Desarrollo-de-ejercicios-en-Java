/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AccionesFunciones;

import java.util.Scanner;

/**
 *
 * @author STEVEN
 */
public class conviertaDistanciaMillasKilómetros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // convierta una distancia en millas a kilómetros
        double milla;
        double Tconvercion;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la cantidad de millas de ciudad a ciudad");
        milla = entrada.nextDouble();
        
        // proceso
        Tconvercion= (milla * 1.60934);
        // salida 
        System.out.println("la cantidad de milla comvertido a (KM) es:" + Tconvercion);
        
        
    }
    
}
