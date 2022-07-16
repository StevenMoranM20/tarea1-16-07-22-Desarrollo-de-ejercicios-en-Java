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
public class perímetroDelPentágono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Construya una función “Eleva” Que reciba como parámetros una base y un
//exponente y retorne al algoritmo principal el resultado de elevar un numero al otro.
  // entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la longitud: ");
        double distancia =entrada.nextDouble();
        //proceso
        double formulaDistancia =2 * distancia * Math.sin(Math.PI/5);
        double formulaArea =(5 *Math.pow(formulaDistancia, 2))/(4 * Math.tan(Math.PI/5));
       //salida
        if (distancia !=0) {
            System.out.println("el area del pentagono es: "+ Math.rint(formulaArea));
        } else {
            System.out.println("el programa no acepta valores nulos");
            System.exit(1);
        }
        
    }
    
}
