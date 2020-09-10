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
public class Cliente extends Persona{
    private String email;
    private ArrayList <Vehiculo> vehiculosReservados = new ArrayList<>();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    @Override
    public boolean esCedulaValida(String cedula) {
        return super.esCedulaValida(cedula);
    }
    
    public void agregarVehiculoReservado(Vehiculo vehicle){
        vehiculosReservados.add(vehicle);
    }
    
}
