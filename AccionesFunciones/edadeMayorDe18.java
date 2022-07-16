/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AccionesFunciones;

import java.util.Scanner;

/**
 *
 * @author STEVEN
 */
public class edadeMayorDe18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Construya una función que solicite edades al usuario y determine el promedio de
las edades mayores a 18 años. El usuario indicará cuando desea dejar de
suministrar datos de entrada. En la Acción Principal se informará el promedio
calculado.*/
        //entrada
        Scanner entrada= new Scanner(System.in);
        System.out.println("ingrese la edad");
        int edad = entrada.nextInt();
        
        if (edad> 17) {
            System.out.println("es mayor de edad:");
        } else {
            System.out.println("eres menor edad: ");
            System.out.println("NO tiene los años necesarios para ser mayor de edad: "+ (18- edad));
        }
    }
    
}
