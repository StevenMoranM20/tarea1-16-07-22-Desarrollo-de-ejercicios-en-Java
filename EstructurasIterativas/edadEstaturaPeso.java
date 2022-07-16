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
public class edadEstaturaPeso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Se tiene una secuencia de enteros terminada en cero, que corresponde a la edad,
peso y estatura de una muestra de hombres y mujeres mayores de 18 años. Con
base en dicha secuencia se desea realizar un estudio a fin de conocer:
 Edad promedio de todas las personas en la muestra.
 Peso promedio de todas las personas en la muestra.
 Estatura promedio de todas las personas en la muestra.
 Cuántas personas hay con edad entre los 18 y 25 años.
 Cuántas personas son mayores a 36 años.
 Cuál es el promedio de peso de las personas con edades entre 18 y 35
años.*/
        // entrada
        Scanner entrada =new Scanner(System.in);
        int numero;
        float peso;
       float altura;
       float hombres=0;
       float alturaHombres=0;
       float cantHombres=0;
       float pesoHombres =0;
       float pesoMujeres=0;
       float alturaMujeres=0;
       float cantMujeres=0;
       float promedioPesoH=0;
       float promedioAlturaH=0;
       float promedioPesoM=0;
       float promedioAlturaM=0;
       String genero;
        while (true) {            
            System.out.println("ingrese numero de personas:");
            numero = entrada.nextInt();
            if (numero>0) {
               
                for (int i = 1; i < numero; i++) {
                    System.out.println("ingrese el peso en (KG)");
                    peso= entrada.nextFloat();
                    System.out.println("ingresa la altura en (Metros)");
                    altura= entrada.nextFloat();
                    while (true) {                        
                        System.out.println("ingrese el genero"
                        + "M - F:");
                        genero= entrada.next();
                        if (genero.equalsIgnoreCase("M")) {
                            pesoHombres+= peso;
                            alturaHombres+=altura;
                            cantHombres++;
                            {break;}
                            
                        }else if (genero.equalsIgnoreCase("F")) {
                            pesoMujeres+= peso;
                            alturaMujeres+= altura;
                            cantMujeres++;
                            {break;}
                        }
                        else{
                            System.out.println("El genero no es "
                            + "correcto.ingrese nuevamente.");
                        }
                        
                    }
                     
                }
                if (cantHombres> 0) {
                    
                    promedioPesoH= pesoHombres/cantHombres;
                    promedioAlturaH =alturaHombres / cantHombres;
                    
                }
                if (cantMujeres> 0) {
                    
                    promedioPesoM=pesoHombres/cantMujeres;
                    promedioAlturaM=alturaMujeres/cantMujeres;
                    
                    
                }
                
                System.out.println("los datos ingresados, los promedios son"
                + "\n promedio peso de hombres:"+promedioPesoH+"\n"
                + "\n promedio altura de hombres:"+promedioAlturaH+"\n"
                + "\n promedio peso de mujeres:"+promedioPesoM+"\n"
                + "\n promedio altura de mujeres:"+promedioAlturaM+"\n");
                {break;}
            }
            if (numero>0) {
                System.out.println("perfecto");
            } else {
                System.out.println("El numero no es correcto."
                + "ingrese nuevamente.");
            }
        }
       
       
       
       
       
    }
    
}
