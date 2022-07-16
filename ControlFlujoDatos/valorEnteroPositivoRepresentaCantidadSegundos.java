/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ControlFlujoDatos;

import java.util.Scanner;

/**
 *
 * @author STEVEN
 */
public class valorEnteroPositivoRepresentaCantidadSegundos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Para un valor entero positivo que representa una cantidad en segundos, indicar
       //su equivalente en minutos, horas y días.
       // entrada
       int segundoIniciales;
       int segundos;
       int minutos;
       int horas;
       int dias = 0;
       
        Scanner entrada= new Scanner(System.in);
        
        System.out.println(" introduce segundos en positivo:");
        segundoIniciales = entrada.nextInt();
        
        // proceso
        minutos = segundoIniciales /60;
        segundos = segundoIniciales % 60;
        horas = minutos / 60;
        minutos = minutos % 24;
        horas = horas % 24;
        // salida
        System.out.println( segundoIniciales+ " los segundos son " + dias + " dias "+ horas + " horas "+
                minutos + " minutos " + segundos + " segundos ");
        
               

    }
    
}
