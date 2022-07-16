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
public class HipotenusaDelTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dados dos (2) lados de un triángulo en cm, calcular la hipotenusa del mismo
        // entrada 
        
        double cateto1;
        double cateto2;
        double hipotenusa;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el primer cateto: ");
        cateto1 = entrada.nextDouble();
        System.out.println("ingrese el segundo cateto: ");
        cateto2 = entrada.nextDouble();
        // proceso
        hipotenusa=Math.sqrt(Math.pow(cateto1, 2)+ Math.pow(cateto2, 2));
        //salida
        System.out.println("El resultado de la hipotenusa es: "+ hipotenusa);
    }
    
}
