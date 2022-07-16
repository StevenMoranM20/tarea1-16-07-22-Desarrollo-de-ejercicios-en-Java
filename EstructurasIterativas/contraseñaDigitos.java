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
public class contraseñaDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String celular = "";
        int longitud = 0;

        // proceso 
       celular = JOptionPane.showInputDialog("ingrese contraseña:");
       longitud = celular.length();
        for (int indice = 0; indice < longitud; indice++) {
            //validacion
            if (celular.charAt(indice)!='0' || celular.charAt(indice)!='1' || celular.charAt(indice)!='2' ||
                    celular.charAt(indice)!='3' || celular.charAt(indice)!='4' || celular.charAt(indice)!='5' ||
                    celular.charAt(indice)!='6' || celular.charAt(indice)!='8' || celular.charAt(indice)!='9' ) {
                //rompemos el ciclo
                indice = longitud;
                JOptionPane.showMessageDialog(null, "la contraseña esta correcta");
                
            }else{
            JOptionPane.showMessageDialog(null, "la contraseña NO esta correcta");}
        }
            
        
    }
    
}
