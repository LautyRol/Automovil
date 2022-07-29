/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

/**
 *
 * @author PUPY
 */
public class Ejecutable {
    public static void main(String[] args){
        //Crear una vehiculo con los valores por defecto:
        VehiculoC v1 = new VehiculoC();
        //Asignar los valores de los atributos del objeto
        v1.setNrounidad(3);
        v1.setMarca("toyota");
        v1.setModelo("etios");
        v1.setAno(2014);
        v1.setPatente("xv45kd");
        v1.setColor("rojo");
        v1.setTipocombustible("super");
        v1.setPuertas(4);
        v1.setContkm(1000);
        v1.setEstado("disponible");
        //Crear un vehiculo con valores enviados como parámetros:
        VehiculoC v2 = new VehiculoC(9,"honda","civic",2017,"olfj85","verde",
                "gasolero",2,3450,"alquilado",77);
        //Mostrar el estado de los vehiculos:
        System.out.println("Vehiculo v1: " + v1.toString());
        System.out.println("Vehiculo v2: " + v2.toString());
        if(v1.pagaImpuestos(2022)){
            System.out.println("Su vehiculo paga impuestos");
            
        }
        
        //Muestra la cantidad de km del vehiculo 1:
        System.out.println("La cantidad de km de su vehiculo es la siguiente: " + v1.calcularkm(348907));
        
        
        
    }
    
    
}