/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteDos;
import paqueteUno.EquivalenteHoras;
/**
 *
 * @author spart
 */
public class Ejecutor {
    public static void main(String[] args) {
        EquivalenteHoras t1 = new EquivalenteHoras();
        EquivalenteHoras t2 = new EquivalenteHoras();
        double horas = 24;
        t1.establecerHoras(horas);
        if (horas >= 24) {
            t1.establecerDias();
            t1.establecerMinutos();
            t1.establecerSegundos();
        }else if(horas >= 1){
           t1.establecerMinutos(); 
           t1.establecerSegundos();
        }else if(horas >= 0.1){
           t1.establecerSegundos();
        }
        
        System.out.println("\tHoras y su equivalencias\n");
        System.out.printf("Total de Horas: %.2f.\nEquivalencia en Dias: %.2f.\n"
                + "Equivalenciade en Minutos: %.2f.\nEquivalencia en Segundos: %.2f.\n",t1.obtenerHoras()
                ,t1.obtenerDias(),t1.obtenerMinutos(),t1.obtenerSegundos());
        
        
        
        horas = 72;
        t2.establecerHoras(horas);
        if (horas >= 24) {
            t2.establecerDias();
            t2.establecerMinutos();
            t2.establecerSegundos();
        }else if(horas >=1){
           t2.establecerMinutos(); 
           t2.establecerSegundos();
        }else if(horas >= 0.1){
           t2.establecerSegundos();
        }
        
        System.out.printf("\n\nTotal de Horas: %.2f.\nEquivalencia en Dias: %.1f.\n"
                + "Equivalenciade en Minutos: %.2f.\nEquivalencia en Segundos: %.2f.",t2.obtenerHoras()
                ,t2.obtenerDias(),t2.obtenerMinutos(),t2.obtenerSegundos());
    }
}

