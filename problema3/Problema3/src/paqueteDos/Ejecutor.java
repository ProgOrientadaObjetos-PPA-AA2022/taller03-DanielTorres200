/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteDos;
import paqueteUno.InstitucionesEducativas;
/**
 *
 * @author spart
 */
public class Ejecutor {
    public static void main(String[] args) {
    InstitucionesEducativas  inst1 = new InstitucionesEducativas();
    InstitucionesEducativas  inst2 = new InstitucionesEducativas();
    
    System.out.println("\tInstitutos Educativos\n");
    System.out.println("Instituto Educativo N.-1");
    inst1.establecerNombres("Instituto Educativo Fiscomisional La Dolorosa");
    inst1.establecerTipoInstitucion("Publica");
    inst1.establecerNumeroAlumnos(300);
    inst1.establecerNumeroDocentes(55);
    inst1.establecerNumeroSedes(1);
    inst1.establecerGastosEstudiante(15);
    inst1.establecerPresupuesto(10000);
    
    System.out.printf("\nNombre: %s. \nTipo de Institucion: %s.\nNumero de Alunmos: %.2f.\n"
            + "Numeros de Docentes: %.2f.\nNumero de Sedes: %.2f.\nGastos proyectado por estudiante: %.2f.\nPresupuesto: %.2f.\n",inst1.obtenerNombres()
            ,inst1.obtenerTipoInstitucion(),inst1.obtenerNumeroAlumnos(),inst1.obtenerNumeroDocentes(),
            inst1.obtenerNumeroSedes(),inst1.obtenerGastosEstudiantes(),inst1.obtenerPresupuesto());
    
    
   
    System.out.println("\nInstituto Educativo N.-2");
    inst2.establecerNombres("Instituto Superior Tecnológico Daniel Álvarez Burneo");
    inst2.establecerTipoInstitucion("Publico");
    inst2.establecerNumeroAlumnos(450);
    inst2.establecerNumeroDocentes(68);
    inst2.establecerNumeroSedes(2);
    inst2.establecerGastosEstudiante(50);
    inst2.establecerPresupuesto(50000);
    
    System.out.printf("\nNombre: %s. \nTipo de Institucion: %s.\nNumero de Alunmos: %.2f.\n"
            + "Numeros de Docentes: %.2f.\nNumero de Sedes: %.2f.\nGastos proyectado por estudiante: %.2f.\nPresupuesto: %.2f.",inst2.obtenerNombres()
            ,inst2.obtenerTipoInstitucion(),inst2.obtenerNumeroAlumnos(),inst2.obtenerNumeroDocentes(),
            inst2.obtenerNumeroSedes(),inst2.obtenerGastosEstudiantes(),inst2.obtenerPresupuesto());
    
    }
}
