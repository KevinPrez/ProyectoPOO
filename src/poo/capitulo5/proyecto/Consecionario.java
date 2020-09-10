/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.capitulo5.proyecto;

import java.util.ArrayList;

/**
 *
 * @author pc ponce
 */
public class Consecionario {
    private String nombre = "VehículosKAR";
    private String ubicacion = "Av. Amazonas y 10 de Agosto.";
    private String telefono = "1800 - VEHICUKAR";
    private ArrayList <Vehiculo> vehiculos = new ArrayList <>();
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public String mostrarInfo(){
         return "Encuentranos en: " + ubicacion + "\nContáctanos al: " + telefono;
    }
}
