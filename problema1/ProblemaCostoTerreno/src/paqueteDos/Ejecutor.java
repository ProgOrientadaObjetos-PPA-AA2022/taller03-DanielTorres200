/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteDos;
import paqueteUno.Terreno;
/**
 *
 * @author spart
 */
public class Ejecutor {
    public static void main(String[] args) {
    Terreno cost = new Terreno();
    Terreno cost2 = new Terreno();
    
    System.out.println("\tTerrenos Rectangulares\n");
    System.out.println("Costo del Terreno N.-1");
    cost.establecerAncho(40);
    cost.establecerValorMetroCuadrado(75.50);
    cost.establecerLargo(80);
    cost.establecerArea();
    cost.establecerCosto_Terreno();
    
    System.out.printf("\nAncho: %.2f. \nLargo: %.2f.\nArea: %.2f.\n"
            + "Valor por metro cuadrado: %.2f.\nCosto del terreno: %.2f.\n",cost.obtenerAncho()
            ,cost.obtenerLargo(),cost.obtenerArea(),cost.obtenerValorMetroCuadrado(),cost.obtenerCosto_Terreno());
    
    
        System.out.println("\n\nCosto del Terreno N.-2");
    cost2.establecerAncho(80);
    cost2.establecerValorMetroCuadrado(151);
    cost2.establecerLargo(160);
    cost2.establecerArea();
    cost2.establecerCosto_Terreno();
    
    System.out.printf("\nAncho: %.2f. \nLargo: %.2f.\nArea: %.2f.\n"
            + "Valor por metro cuadrado: %.2f.\nCosto del terreno: %.2f.",cost2.obtenerAncho()
            ,cost2.obtenerLargo(),cost2.obtenerArea(),cost2.obtenerValorMetroCuadrado(),cost2.obtenerCosto_Terreno());
   
    }
}

