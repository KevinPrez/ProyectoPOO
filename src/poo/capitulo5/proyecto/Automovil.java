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
public class Automovil extends VehiculoConMotor {

    private int numAsientos;

    public Automovil() {

    }

    public Automovil(int año, String modelo, int numAsientos, String color, String marca, double precio) {
        this.año = año;
        this.modelo = modelo;
        this.numAsientos = numAsientos;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String presentarInfo() {
        String info = super.presentarInfo() + "\nEl automóvil cuenta con: " + numAsientos + " asientos.";

        return info;
    }
}
