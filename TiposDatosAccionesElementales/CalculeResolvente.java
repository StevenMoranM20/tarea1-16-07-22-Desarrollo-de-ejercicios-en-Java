/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TiposDatosAccionesElementales;

import java.util.Scanner;

/**
 *
 * @author STEVEN
 */
public class CalculeResolvente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dados tres (3) números, Hacer una aplicación que calcule la resolvente.
        // entrada
        double a;
        double b;
        double c;
        double X0;
        double X1;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese valor a ");
        a = entrada.nextDouble();
        System.out.println("ingrese valor b ");
        b = entrada.nextDouble();
        System.out.println("ingrese valor c ");
        c = entrada.nextDouble();
        // proceso
        double numero = (b*b) - (4*a*c);
        if (numero > 0) {
            X0 = (-b + Math.sqrt(numero))/2*a;
             X1 = (-b + Math.sqrt(numero))/2*a;
             System.out.println("la ecuacion tiene soluciones");
             System.out.println("X0; " +X0);
             System.out.println("X1; " +X1);
             
        } else {
            if (numero == 0) {
                X0 = (-b)/2*a;
                System.out.println("La solucion de la ecuacion es: ");
                System.out.println("X0: " +X0);
            } else {
                System.out.println("No tiene solucion la ecuacion: ");
            }
        }
        
        
    }
    
}
