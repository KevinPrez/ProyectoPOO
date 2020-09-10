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
public abstract class VehiculoSinMotor extends Vehiculo{
    protected String tipo;
    
    
    @Override
    public String presentarInfo(){
        String info = "La bicicleta es de tipo: "+tipo;
        
        return info;
    }
}
