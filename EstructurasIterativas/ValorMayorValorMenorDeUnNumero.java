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
public class ValorMayorValorMenorDeUnNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dada una secuencia de números terminada en cero (0), elaborar un algoritmo que
        //informe al usuario qué valor tiene el número mayor y qué valor tiene el número
        //menor, sin contar el cero (0)
        // salida
        int cantNumeros;
        int NumeroMenor =0;
        int posicion = 0;
        cantNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero "));
        for (int i = 0; i < cantNumeros; i++) {
            JOptionPane.showMessageDialog(null, "dijite la posicion: "+ (i+1));
            if (i==0) {
                NumeroMenor=posicion;
            }else if (posicion<NumeroMenor) {
                NumeroMenor=posicion;
            }
        }
        JOptionPane.showMessageDialog(null, "el numero es menor: "+ NumeroMenor);
        
    }
    
}
