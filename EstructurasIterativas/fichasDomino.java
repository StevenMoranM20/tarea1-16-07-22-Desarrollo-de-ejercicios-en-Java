/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstructurasIterativas;

/**
 *
 * @author STEVEN
 */
public class fichasDomino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // muestre todas las fichas de dominó, sin repetir.
        // entrada
        int i=0;
        int cantidad=5;
        int rango=10;
        int arreglo[] = new int[cantidad];
        arreglo[i]=(int)(Math.random()*rango);
        for (int j = 0; j < 1; j++) {
            if (arreglo[1]==arreglo[j]) {
                i++;
            }
        }
        
    }
    
}
