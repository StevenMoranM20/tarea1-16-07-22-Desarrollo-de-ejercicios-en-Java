/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ControlFlujoDatos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author STEVEN
 */
public class fechaDiaMesDeUnAño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un algoritmo que reciba una fecha (día y mes) correspondiente al año
//2014 e imprima por pantalla el número de días que han pasado desde el 1 de
//Enero de 2014 hasta la fecha dada.
 // entrada
 
        LocalDate fechaini = LocalDate.parse("2014-01-01");
        LocalDate fechafini = LocalDate.parse("2022-13-07");
        Duration dd = Duration.between(fechaini.atStartOfDay(), fechafini.atStartOfDay());
        System.out.println("dis transcurrido: "+dd.toDays() + " dias");
 //proceso       
        Period pp = Period.between(fechaini,fechafini);
        //salida
        System.out.println("estos son los dias que pasaron " + pp.getDays());
        System.out.println("estos son los mes que pasaron " + pp.getMonths());
        System.out.println("estos son los años que pasaron " + pp.getYears());
    }
    
}
