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
public class mesCorrespondienteAlNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitar un número entre el 1 y el 12 e imprimir el mes correspondiente a dicho número
  // entrada
        int numero;
        Scanner entrada = new Scanner(System.in);
         System.out.println("ingrese un mumero");
         numero= entrada.nextInt();
         //proceso
         switch (numero) {
            case 1:
                System.out.println("el mes es enero");
                break;
                case 2:
                System.out.println("el mes es febrero");
                break;
                case 3:
                System.out.println("el mes es marzo");
                break;
                case 4:
                System.out.println("el mes es abril");
                break;
                case 5:
                System.out.println("el mes es mayo");
                break;
                case 6:
                System.out.println("el mes es junio");
                break;
                case 7:
                System.out.println("el mes es julio");
                break;
                case 8:
                System.out.println("el mes es agosto");
                break;
                case 9:
                System.out.println("el mes es septiembre");
                break;
                case 10:
                System.out.println("el mes es octubre");
                break;
                case 11:
                System.out.println("el mes es noviembre");
                break;
                case 12:
                System.out.println("el mes es diciembre");
                break;
               
            default: System.out.println("no es un mes ");
                
        }

    }
    
}
