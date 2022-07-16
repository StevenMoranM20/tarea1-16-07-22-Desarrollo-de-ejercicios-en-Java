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
public class numero0ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado un (1) número, imprimir 0 si es par y 1 si es impar.
        // entrada
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("*******ingrese un numero:*******");
         numero = entrada.nextInt();
         // proceso
         if (numero% 2 == 0) {
             System.out.println(numero + " es numero par");
        } else {
             System.out.println(numero +" es numero impar ;");
        }
    }
    
}
