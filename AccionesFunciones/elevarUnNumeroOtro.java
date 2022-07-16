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
public class elevarUnNumeroOtro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Construya una función “Eleva” Que reciba como parámetros una base y un
//exponente y retorne al algoritmo principal el resultado de elevar un numero al otro.
  //entrada
int potencia =0;
int numero =0;
int resultado =0;
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite numero a elevar");
        numero =entrada.nextInt();
        
        System.out.println("potencia a elevar");
        potencia = entrada.nextInt();
    //proceso
resultado = numero;
        for (int i = 1; i < potencia; i++) {
            resultado = resultado * numero;
        }
        //resultado= numero;
        System.out.println("el resultado es :");
        System.out.println(resultado);
        
    }
    
}
