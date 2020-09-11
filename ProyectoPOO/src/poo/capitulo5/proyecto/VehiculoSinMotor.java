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
public abstract class VehiculoSinMotor extends Vehiculo {

    protected String tipo;

    @Override
    public String presentarInfo() {
         
        return "\nMarca " + marca + "\nColor " + color + "\nTipo: " + tipo;
    }
}
