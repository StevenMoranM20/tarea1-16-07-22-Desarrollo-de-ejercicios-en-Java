/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstructurasIterativas;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author STEVEN
 */
public class calculosDeDigitosDeUnNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Dado un número entero N, calcular e informar al usuario cuántos dígitos tiene
        //dicho número.
       //entrada
         int numero;
        int cifras;
        Scanner entrada = new Scanner(System.in);
      //proceso
        char car;
        do{
            System.out.print("Introduce un número entero: ");
            numero = entrada.nextInt();
            cifras= 0;    
            while(numero!=0){             
                    numero = numero/10;         
                   cifras++;          
            }
            //salida
            System.out.println("El número tiene " + cifras+ " cifras");
            System.out.print("Digite 'n' para salir:? ");
            car = (char)System.in.read();
        }while(car!='n' && car != 'N');   
       
             
    }
    
}
