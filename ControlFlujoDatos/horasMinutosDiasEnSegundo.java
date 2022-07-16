/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ControlFlujoDatos;

import java.util.Scanner;

public class horasMinutosDiasEnSegundo {

        // proceso
    public static int calcularSegundos(int dias, int horas, int minutos){
int TotalSegundos=0;
TotalSegundos += minutos*60;
TotalSegundos += horas * 60*60;
TotalSegundos += dias * 24 * 60 +60;
        return TotalSegundos;
}
    public static void main(String[] args) {
        //Cree un algoritmo que tome por entrada las horas y minutos de un día y dé como
//resultado su equivalente en segundos.
// entrada


 int TotalSegundos;

 int minutos ;
 int dias ;
 int horas;
 int resultado;
 Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la cantidad de dias: ");
        dias = entrada.nextInt();
        System.out.println("ingrese la cantidad de horas:");
        horas= entrada.nextByte();
        System.out.println("ingrese la cantidad de minutos");
        minutos= entrada.nextInt();
        
        // salida
        TotalSegundos = calcularSegundos(dias, horas, minutos);
         
        System.out.println("la cantidad de segundo es de: "+ TotalSegundos);
    
         
        
 
 
    }
    
}
