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
public class InstitucionesEducativas {

    /**
     * @param args the command line arguments
     */
    private String nombres;
    private String tipoInstitucion;
    private double numeroAlumnos;
    private double numeroDocentes;
    private double numeroSedes;
    private double gastoEstudiante;
    private double presupuesto;
    
    public void establecerNombres(String i){
        nombres = i;
    }
    public void establecerTipoInstitucion(String i){
        tipoInstitucion = i;
    }
    public void establecerNumeroAlumnos(double c){
       numeroAlumnos = c;
    }
    public void establecerNumeroDocentes(double c){
        numeroDocentes = c;
    }
    public void establecerNumeroSedes(double c){
        numeroSedes = c;
    }
    public void establecerGastosEstudiante(double c){
        gastoEstudiante = c;
    }
    public void establecerPresupuesto(double c){
        presupuesto = numeroAlumnos * gastoEstudiante;
    }
    
    
    
    public String obtenerNombres(){
        return nombres;
    }
    public String obtenerTipoInstitucion(){
        return tipoInstitucion;
    }
    public double obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
    public double obtenerNumeroDocentes(){
        return numeroDocentes;
    }
    public double obtenerNumeroSedes(){
        return numeroSedes;
    }
    public double obtenerGastosEstudiantes(){
        return gastoEstudiante;
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
