/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstructurasIterativas;

//import java.util.Scanner;

import javax.swing.JOptionPane;


/**
 *
 * @author STEVEN
 */
public class numeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado un número N determinar si es un número primo
        // entrada 
        int numero;
        int a= 0;
        //Scanner entrada = new Scanner(System.in);
        //System.out.println("digite un numero");
        //numero = entrada.nextInt();
        numero= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        // proceso
        for (int i = 1; i <=numero; i++) {
            if (numero%i == 0 ) {
                a++;
            }
        }
        // salida 
        if (a== 2) {
           // System.out.println("El numero SI es primo");
           JOptionPane.showMessageDialog(null, "El numero SI es primo");
        } else {
            //System.out.println("El numero NO es primo");
             JOptionPane.showMessageDialog(null, "El numero NO es primo");
        }
        
    }
    
}
