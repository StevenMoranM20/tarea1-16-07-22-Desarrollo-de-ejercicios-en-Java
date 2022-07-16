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
public class numeroCapicuas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado un número, determine si es capicúa.
        // Nota: un número capicúa es aquel que se lee igual hacia adelante que hacia atrás.
        //entrda
        int numero ;
        //int resto;
        //int falta = 0 ;
        //int numeroInvertido=0;
       
               numero = Integer.parseInt(JOptionPane.showInputDialog("dijite un numero"));
               //proceso
                int resto,falta=numero,numeroInvertido=0;
               while (falta>0) {            
            resto= falta % 10;
            falta = falta /10;
            numeroInvertido =numeroInvertido*10 + resto;
            }
        if (numeroInvertido == numero) {
            JOptionPane.showMessageDialog(null, "El numero ingresado es capicua:");
        } else {
            JOptionPane.showMessageDialog(null, "El numero ingresado no es capicua:");
        }
        
    }
    
}
