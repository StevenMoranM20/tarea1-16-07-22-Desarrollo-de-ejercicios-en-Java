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
public class NumeroPositivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dado un (1) número, imprimir Positivo o negativo según sea el numero.
        // entrada
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("*******ingrese un numero*******");
        numero = entrada.nextInt();
        //proceso
        if (numero<0) {
            System.out.println("El numero es negativo:");
        } else if ( numero>0){
            System.out.println("El numero es positivo");
        }

    }
    
}
