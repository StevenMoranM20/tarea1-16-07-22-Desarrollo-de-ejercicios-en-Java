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
public class descuentoClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*En un almacén se hace un 20% de descuento a los clientes cuya compra supere
        los Bs 1000, se desea que realice un algoritmo el cual tome por entrada el monto a
        pagar por el cliente y arroje como salida el monto aplicando el descuento de ser
        necesario*/
    // entrada
    float compra;
    float descuento = 0;
    float TotalFinal;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese cun valor de compra:");
        compra=entrada.nextFloat();
        //proceso
        if (compra < 1000) {
            descuento=(float)(compra*.10);
        }else if (compra>=1000 && compra<4000) {
            descuento =(float) (compra*.15);
        }else if (compra >= 4000 && compra <=10000) {
            descuento=(float)(compra*.25);
        }else{
            System.out.println("No tiene descuento");
        }
        TotalFinal=compra-descuento;
        //salida 
        System.out.println("el desuento es: " + descuento);
        System.out.println("total final a pagar es: "+ TotalFinal);
        
    
    }
    
}
