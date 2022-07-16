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
public class expresionesMatemáticasPseudoCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // expresiones matemáticas a pseudo-codigo
       // entrada
     int a = 12,b = 2 ,c = 3 ,x = 0, y = 0;
     // proceso
     x =(a+(b/c)/(a/b)+c);
     y = (a/(a+b))/(a-(a-b));
     //salida
     JOptionPane.showMessageDialog(null, "El resultado de la  operacion x es: "+x+
                                     "\n El resultado de la  operacion y es: "+y);
    }
    
}
