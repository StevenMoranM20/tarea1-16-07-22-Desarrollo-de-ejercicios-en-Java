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
public class elMayorDeLosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dados tres números enteros positivos A, B y C, determine ¿cuál de ellos es el
        //mayor? y ¿cuál es el segundo mayor?
        int numero1;
        int numero2;
        int numero3;
        int numeroMayor;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese primer numero positivo: ");
        numero1 = entrada.nextInt();
        
        System.out.println("ingrese segundo numero positivo: ");
        numero2 = entrada.nextInt();
        
        System.out.println("ingrese tercer numero positivo: ");
        numero3 = entrada.nextInt();
        
        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("los numeros son iguales");
        }else if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("el numero positivo mayor: "+ numero1);
            
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("el numero positivo mayor es: " + numero2);
        }else{
        System.out.println("el numero positivo mayor es:" + numero3);
        }
    }
    
}
