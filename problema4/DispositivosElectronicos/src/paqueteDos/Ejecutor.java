/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteDos;
import paqueteUno.DispositivosElectronicos;
/**
 *
 * @author spart
 */
public class Ejecutor {
    public static void main(String[] args) {
        DispositivosElectronicos de1 = new DispositivosElectronicos();
        DispositivosElectronicos de2 = new DispositivosElectronicos();
        
        
    System.out.println("\tDispositivos Electronicos\n");
    System.out.println("DispositivoElctronico N.-1");
    de1.establecerSistemaOperativo("Android");
    de1.establecerTamañoPantalla(6.15);
    de1.establecerCostoInicial(400);
    de1.establecerPorcentajeIVA(12);
    de1.establecerCostoInicialIVA(1);
    de1.establecerCostoFinal(1);
    de1.establecerDireccionMac("h24ur8t5");
    de1.establecerInformacionIMEI("184731630291734");
    
    System.out.printf("\nSistema Operativo: %s. \nTamaño de Pantalla: %.2f.\nCosto Inicial: %.2f.\n"
            + "IVA en porcentaje: %.2f.\nIVA del costo Inicial: %.2f.\nCosto Final: %.2f.\nDireccion Mac: %s.\nInformacion IMEI: %s.\n",de1.obtenerSistemaOperativo()
            ,de1.obtenerTamañoPantalla(),de1.obtenerCostoInicial(),de1.obtenerPorcentajeIVA(),
            de1.obtenerCostoInicialIVA(),de1.obtenerCostoFinal(),de1.obtenerDireccionMac(),de1.obtenerInformacionIMEI());
    

    System.out.println("\n\nDispositivoElctronico N.-2");
    de2.establecerSistemaOperativo("IOS");
    de2.establecerTamañoPantalla(7.0);
    de2.establecerCostoInicial(1100);
    de2.establecerPorcentajeIVA(12);
    de2.establecerCostoInicialIVA(1);
    de2.establecerCostoFinal(1);
    de2.establecerDireccionMac("ut56r34e");
    de2.establecerInformacionIMEI("957432173456043");
    
    System.out.printf("\nSistema Operativo: %s. \nTamaño de Pantalla: %.2f.\nCosto Inicial: %.2f.\n"
            + "IVA en porcentaje: %.2f.\nIVA del costo Inicial: %.2f.\nCosto Final: %.2f.\nDireccion Mac: %s.\nInformacion IMEI: %s.",de2.obtenerSistemaOperativo()
            ,de2.obtenerTamañoPantalla(),de2.obtenerCostoInicial(),de2.obtenerPorcentajeIVA(),
            de2.obtenerCostoInicialIVA(),de2.obtenerCostoFinal(),de2.obtenerDireccionMac(),de2.obtenerInformacionIMEI());
        }
}
