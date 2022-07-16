/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstructurasIterativas;

import java.util.Scanner;

/**
 *
 * @author STEVEN
 */
public class CalcularPromedioSerie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TDados N número positivos (N>1) calcular el promedio de esta serie. Considere que
//la serie termina al leer un 0
// entrada
float acumulador =1;
float nota =0;
        Scanner entrada =new Scanner(System.in);
        System.out.println("ingresar las notas");
        float cantidasNotas =entrada.nextFloat();
        //proceso
        while (acumulador <= cantidasNotas) {            
            System.out.println("ingresar nota: "+ acumulador);
            float n =entrada.nextFloat();
            nota+= n;
            acumulador++;
        }
        float promedio = nota/ cantidasNotas;
        System.out.println("el promedio de las notas es: "+ promedio);

    }
    
}
