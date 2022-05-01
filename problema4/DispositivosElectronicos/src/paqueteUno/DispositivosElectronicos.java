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
public class DispositivosElectronicos {

    /**
     * @param args the command line arguments
     */
    private String sistemaOperativo ;
    private double tamañoPantalla;
    private double costoInicial;
    private double porcentajeIVA;
    private double costoInicialIVA;
    private double costoFinal;
    private String direccionMac;
    private String informacionIMEI; 
    
    public void establecerSistemaOperativo(String c){
        sistemaOperativo = c;
    }
    public void establecerTamañoPantalla(double c){
        tamañoPantalla = c;
    }
    public void establecerCostoInicial(double c){
        costoInicial = c;
    }
    public void establecerPorcentajeIVA(double c){
        porcentajeIVA = c;
    }
    public void establecerCostoInicialIVA(double c){
        costoInicialIVA = (costoInicial *12) / 100;
    }
    public void establecerCostoFinal(double c){
        costoFinal = costoInicial + costoInicialIVA;
    }
    public void establecerDireccionMac(String c){
        direccionMac = c;
    }
    public void establecerInformacionIMEI(String d){
        informacionIMEI = d;
    }
    
    
    
    public String obtenerSistemaOperativo(){
        return sistemaOperativo;
    }
    public double obtenerTamañoPantalla(){
        return tamañoPantalla;
    }
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    public double obtenerPorcentajeIVA(){
        return porcentajeIVA;
    }
    public double obtenerCostoInicialIVA(){
        return costoInicialIVA;
    }
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    public String obtenerDireccionMac(){
        return direccionMac;
    }
    public String obtenerInformacionIMEI(){
        return informacionIMEI;
    }
}
