/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteUno;

/**
 *
 * @author spart
 */
public class EquivalenteHoras {

    /**
     * @param args the command line arguments
     */
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    
    public void establecerDias(){
        dias = horas / 24;
    }
    public void establecerHoras(double c){
        horas = c;
    }
    public void establecerMinutos(){
        minutos = horas * 60;
    }
    public void establecerSegundos(){
        segundos = minutos * 60;
    }
    
    
    public double obtenerHoras(){
        return horas;
    }
    public double obtenerDias(){
        return dias;
    }
    public double obtenerMinutos(){
        return minutos;
    }
    public double obtenerSegundos(){
        return segundos;
    }
}
