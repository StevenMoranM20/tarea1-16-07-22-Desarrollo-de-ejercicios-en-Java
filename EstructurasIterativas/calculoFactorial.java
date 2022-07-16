/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstructurasIterativas;

import javax.swing.JOptionPane;

/**
 *
 * @author STEVEN
 */
public class calculoFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Construya un programa que dado un valor entero N, haga el cálculo de la función
//factorial utilizando estructuras iterativas.
  // entrada
  int numero;
  int factorial =1;
  numero= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
  // proceso
        while (numero !=0) {            
            factorial *= numero;
            numero--;
        }
JOptionPane.showMessageDialog(null, "El numero factoria es: " +factorial);
    }
    
}
