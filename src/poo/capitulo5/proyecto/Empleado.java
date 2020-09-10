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
public class Empleado extends Persona {
    private double sueldo;

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
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
    
    public String realizarProforma(){
        String proforma="El empleado: "+nombre+"\nNúmero de cédula: "+numCedula;
        
        
        return proforma;
    }

    @Override
    public boolean esCedulaValida(String cedula) {
        return super.esCedulaValida(cedula); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
