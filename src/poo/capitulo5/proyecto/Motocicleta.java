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
public class Motocicleta extends VehiculoConMotor {

    private String categoria;

    public Motocicleta() {

    }

    public Motocicleta(int año, String modelo, String categoria, String color, double precio, String marca) {
        this.año = año;
        this.modelo = modelo;
        this.categoria = categoria;
        this.color = color;
        this.precio = precio;
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

        return "*-Información de la moto-*" + super.presentarInfo() + 
                "\nCategoría: " + categoria + "\nPrecio " + precio;
    }
}
