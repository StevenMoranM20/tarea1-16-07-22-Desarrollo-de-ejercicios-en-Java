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
public class masaDeUnIndividuo {

   public static double calculoIMC(double peso, double estatura){
   return peso/ Math.pow(estatura, 2);
   }
   // proceso
   public static String estadoPeso(double IMC){
       if (IMC < 16 )
           return "criterio ingreso";
       else if (IMC >= 16 && IMC <=16.9)
           return "infra peso";
        else if (IMC >= 18 && IMC <=18.4)
           return "bajo peso";
       else if (IMC >= 17 && IMC <=24.9)
           return "normal";
       else if (IMC >= 25 && IMC <=29.9)
           return "sobrepeso";
       else if (IMC >= 30 && IMC <=34.9)
           return "obesidad pre-morbida";
       else if ( IMC >=35 && IMC <=39.9)
           return "obesidad morbida";
       else if (IMC >= 40 && IMC <= 49.9)
           return "obesidad hiper-morbida";
       return "obesidad grave";
       
   }
    public static void main(String[] args) {
        // Dado el peso de una persona en libras (1 libra = 0,453592 Kg) y su estatura en
//centímetros, calcule su IMC e indique como salida el peso en kilogramos, el valor
//de IMC de la persona y la categoría en la cual fue clasificado.
// entrada
double peso;
double estatura;

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese peso (KM): ");
        peso = entrada.nextDouble();
        System.out.println("ingrese estatura (M): ");
        estatura =entrada.nextDouble();
        
        System.out.println("su peso es: "+ estadoPeso(calculoIMC(peso, estatura)) );

    }
    
}
