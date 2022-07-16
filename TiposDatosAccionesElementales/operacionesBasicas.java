/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TiposDatosAccionesElementales;

import javax.swing.JOptionPane;

/**
 *
 * @author STEVEN
 */
public class operacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dados dos (2) números calcule la suma, resta, multiplicación, división y módulo.
    int numero1;
    int numero2;
    int suma =0;
    int resta = 0;
    int multiplicacion =0;
    int division =0;
    int modulo =0;
    // entrada
    numero1 = Integer.parseInt( JOptionPane.showInputDialog("ingresar primer numero; "));
    numero2 = Integer.parseInt( JOptionPane.showInputDialog("ingresar primer numero; " ));
   //proceso
    suma = numero1+ numero2;
   resta= numero1- numero2;
      multiplicacion = numero1* numero2;
        division = numero1/ numero2;
          modulo = numero1% numero2;
          // salida
           JOptionPane.showMessageDialog(null,"El resultado de la suma es: " + suma );
          JOptionPane.showMessageDialog(null,"El resultado de la resta es: " + resta);
           JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es: " + multiplicacion);
           JOptionPane.showMessageDialog(null,"El resultado de la division es: " + division);
           JOptionPane.showMessageDialog(null,"El resultado del modulo es: " + modulo);
    }
    
}
