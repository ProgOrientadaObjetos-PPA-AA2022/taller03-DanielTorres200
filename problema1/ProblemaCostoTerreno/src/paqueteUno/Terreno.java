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
public class Terreno {
   
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    

    public void establecerCosto_Terreno( ){
        costo_terreno = area * valorMetroCuadrado;
    }
    public void establecerAncho(double c ){
        ancho = c;
    }
    public void establecerLargo(double c ){
        largo = c;
    }
    public void establecerArea( ){
        area = ancho * largo;
    }
    public void establecerValorMetroCuadrado(double c ){
        valorMetroCuadrado = c;
    }
    
    
    public double obtenerCosto_Terreno(){
        return costo_terreno;
    }
    public double obtenerAncho(){
        return ancho;
    }
    public double obtenerLargo(){
        return largo;
    }
    public double obtenerArea(){
        return area;
    }
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }   
}
