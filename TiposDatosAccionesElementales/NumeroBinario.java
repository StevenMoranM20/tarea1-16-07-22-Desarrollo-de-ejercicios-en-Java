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
public class NumeroBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  número binario de cuatro (4) dígitos imprimir su valor
         int numero;
    int digito;
    String binario="";
        Scanner entrada = new Scanner(System.in);
        System.out.println("*********Ingrese un numero:*******");
        numero =entrada.nextInt();
        // proceso
        do {            
            digito= numero %2;
            binario += digito;
            numero = numero / 2;
            
        } while (numero != 0);
        binario = new StringBuilder(binario).reverse().toString();
        System.out.println("el numero en binario es: " + binario);
    }
    
}
