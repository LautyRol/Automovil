/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.vehiculo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PUPY
 */
public class VehiculoC {

    //Atributos
    private int nrounidad;
    private String marca;
    private String Modelo;
    private int ano;
    private String patente;
    private Color color;
    private int puertas;
    private float contkm;
    private String estado;
    private TipoCombustible combustible;

    //Costructores
    public VehiculoC(int nrounidad, String marca, String Modelo, int ano,
            String patente, String color, String tipocombustible, int puertas,
            float contkm, String estado, int codigo, String nombre) {
        this.nrounidad = nrounidad;
        this.marca = marca;
        this.Modelo = Modelo;
        this.ano = ano;
        this.patente = patente;
        this.puertas = puertas;
        this.contkm = contkm;
        this.estado = estado;
        this.combustible = new TipoCombustible(codigo, tipocombustible);
        this.color = new Color(codigo, nombre);
    }

    public VehiculoC() {
        this.nrounidad = 0;
        this.marca = "";
        this.Modelo = "";
        this.ano = 0;
        this.patente = "";
        this.puertas = 0;
        this.contkm = 0;
        this.estado = "";
        combustible = new TipoCombustible();
        color = new Color();
    }

    VehiculoC(int i, String honda, String civic, int i0, String olfj85, String verde, String gasolero, int i1, int i2, String alquilado, int i3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Getters y Setters
    public int getNrounidad() {
        return nrounidad;
    }

    public void setNrounidad(int nrounidad) {
        this.nrounidad = nrounidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = ComprobarMarca(marca);
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color.getNombre();
    }

    public void setColor(String color) {
        this.color.setNombre(color);
    }

    public String getTipocombustible() {
        return combustible.getCombustible();
    }

    public void setTipocombustible(String tipocombustible) {
        this.combustible.setCombustible(tipocombustible);
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public float getContkm() {
        return contkm;
    }

    public void setContkm(float contkm) {
        this.contkm = contkm;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    private String ComprobarMarca(String marca) {
        boolean bandera = false;
        final String[] arreglo_marcas = {"Toyota", "Ford", "Fiat", "Jeep", "Kia", "Bmw", "Audi", "Citroen", "Subaru", "Honda"};
        for (int i = 0; i < 12; i++) {
            if (marca == arreglo_marcas[i]) {
                bandera = true;

            }
        }
        if (bandera) {
            return marca;
        } else {
            return "Esa marca no existe";
        }
    }

    //Metodos Propios:
    public float calcularkm(float cantKmRealizada) {
        return this.contkm + cantKmRealizada;

    }

    public boolean pagaImpuestos(int anioActual) {
        int antiguedad = 0;
        antiguedad = anioActual - this.ano;
        return antiguedad <= 10;

    }

    public String toString() {
        return "Numero de Unidad: " + nrounidad + "|Marca: " + marca
                + "|Modelos: " + Modelo + "|Año: " + ano + "|Patente: " + patente
                + "|Color: " + color + "|Tipo de Combustible: " + combustible
                + "|Puertas: " + puertas + "|Cantidad de Kilometros: " + contkm
                + "|Estado: " + estado;
    }

    public String GuardarNuevo() throws SQLException {
        try {
            //1. Registrar el driver: 
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            //2. Obtener una conexión a Derby: 
            Connection cnn = DriverManager.getConnection("jdbc:derby://(localdb)/servidor/Vehiculo", "Automovil1", "Color", "ColorXAutomovil"); 
            
            //3. Crear una sentencia: 
            Statement stmt = cnn.createStatement();
            //ejecutar la sentencia y obtener un conjunto de resultados:
            ResultSet rs = stmt.executeQuery("SELECT * FROM Usuarios"); 
            
            //4. Recorrer filas: 
            while (rs.next()) {
                
            //5. Acceder a cada campo de la fila: 
                int id = rs.getInt("id_usuario");
                String usuario = rs.getString("nombre");
                String pass = rs.getString("password");
                System.out.println("ID:" + id + " |Usuario: "
                        + usuario + " " + "|Password: " + pass);
            }
            //6. Liberar recursos: 
            rs.close();
            stmt.close();
            
            //7. cerrar conexión 
            cnn.close();
        } catch (ClassNotFoundException cnf) {
            System.out.println("Driver no encontrado!");
        } catch (SQLException e) {
            System.out.println("No se pudo conectar con DERBY");
        }
        return "Operacion exitosa";
    }
}
