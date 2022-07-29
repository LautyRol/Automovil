/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

/**
 *
 * @author PUPY
 */
public class TipoCombustible {
    //Atributos:
    private int codigo;
    private String combustible;
    
    
    //Constructores:

    public TipoCombustible(int codigo, String combustible) {
        this.codigo = codigo;
        this.combustible = combustible;
    }
    
     public TipoCombustible() {
        this.codigo = 0;
        this.combustible = "";
    
}
     //Getters y Setters:

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
     
    //Metodos propios:

    public String toString() {
        return "TipoCombustible{" + "codigo=" + codigo + ", combustible=" + combustible + '}';
    }
            
    
}
