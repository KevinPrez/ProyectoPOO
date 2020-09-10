/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.capitulo5.proyecto;

/**
 *
 * @author pc ponce
 */
public abstract class VehiculoConMotor extends Vehiculo {
    protected int año;
    protected String modelo;
    
    @Override
    public String presentarInfo(){
        String info = "El vehículo "+modelo+"\nAño: "+año;
        
        return info;
    }
}
