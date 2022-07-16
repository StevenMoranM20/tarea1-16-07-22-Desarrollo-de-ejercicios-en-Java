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
public class calculenSalarioSemanalPorHorasTrabajadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // entrada 
        double sueldoT=425/15;
        int DTrabajadas;
       double Phora;
        int Hextra;
        int faltas=0;
        String nombre = "";
        double sueldoTotal=0;
        //int Horas;
        //double salario;
        //double PhorasExtra;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese nombre del trabajador:");
        nombre =entrada.next();
        System.out.println("ingrese horas trabajadas");
        DTrabajadas =entrada.nextInt();
         System.out.println(" ingrese horas extras");
         Hextra = entrada.nextInt();
         // proceso
         
         faltas=15-DTrabajadas;
         if (Hextra>10) {
            sueldoT=425-(faltas*425)+(10*50)+(Hextra-10)*60;
        } else {
             sueldoTotal=425-(faltas*400)+ (Hextra*50);
        }
         System.out.println("Nmonbre del trabajador: "+ nombre);
         System.out.println("dias Trabajados: "+ DTrabajadas);
         System.out.println("faltas: "+ faltas);
         System.out.println("horas extras trabajadas:"+ Hextra);
         System.out.println("sueldo total: "+ sueldoT);
        
    }
    
}
