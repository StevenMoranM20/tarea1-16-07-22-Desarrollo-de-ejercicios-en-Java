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
public class numeroHorasPermanecioAutomovil {
    public static void main(String[] args) {
        /* En un estacionamiento el monto a pagar se calcula multiplicando el número de
horas que permaneció el automóvil dentro del estacionamiento por Bs. 4 y se
incrementa esta cantidad en Bs. 2,50 por cada media hora adicional.
Ahora se desea que usted elabore un algoritmo que a partir de la hora de entrada
y la hora de salida de un vehículo (las mismas corresponden a un mismo día)
calcule el monto a pagar por el dueño del vehículo.
La entrada vendrá dada por dos enteros positivos el primero representa las horas
y el segundo los minutos, además por último se debe leer un carácter (A o P) que
indica si la hora es AM o PM */
        // entrada 
        int numerohoras= 0;
        double precioTotal=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("La cantidad de Horas");
        numerohoras = entrada.nextInt();
        //proceso 
        precioTotal=calcularPrecio(numerohoras);
        System.out.println("Total a pagar: " + precioTotal);
        
    }
    public static double calcularPrecio(int horas){
        double precio;
        double  precioResto;
        int restoHoras;
        int dias;
        if (horas<=24) {
            if (horas<=3) {
                precio=horas*15;
            }
            else{
                precio=(3*20)+((horas-3)*15);
                if (precio>= 250) {
                    precio= 250;
                }
            }
            
    
        }else
        {
        dias= horas/24;
        restoHoras=horas%24;
        precioResto= restoHoras*15;
            if (precioResto>=250) {
                precioResto=250;
            }
            precio=dias*250+precioResto;
        }
        return precio;
    }
    
}
