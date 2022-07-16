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
public class expresiónMatemática {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* ¿Siguiendo la prioridad de operadores, convierta a expresión matemática,
resuelva e indique en cuál tipo de variable almacenará el resultado de las
siguientes expresiones:*/
        // entrada
boolean ejercicio1 = (5+3*2)+9>3*5*14%3;
        double ejercicio2 = 2*(4-10+8)/2*36*(1/2);
        double ejercicio3 = 260 / 12 + 54 % 3 - 85 % 7;
        boolean ejercicio4 = (48<2*3) || (2*7<12);
        boolean  ejercicio5 =((8>2) || (932<23)) && 4==2;
//salida
        JOptionPane.showMessageDialog(null, ejercicio1);
        JOptionPane.showMessageDialog(null, ejercicio2);
        JOptionPane.showMessageDialog(null, ejercicio3);
        JOptionPane.showMessageDialog(null, ejercicio4);
        JOptionPane.showMessageDialog(null, ejercicio5);
    }
    
}
