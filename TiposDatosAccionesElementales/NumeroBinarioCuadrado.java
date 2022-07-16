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
public class NumeroBinarioCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado un (1) número binario de cuatro (4) dígitos imprimir su bit da paridad. El bit
        // de paridad es 1 si el número de bits 1 es impar y 0 en caso contrario.
        // entrada
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
        if (numero% 2 == 0) {
             System.out.println(numero + " es numero par");
        } else {
             System.out.println(numero +" es numero impar ;");
        }
        
    
        
    }
    
}
