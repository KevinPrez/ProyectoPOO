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
public class Bicicleta extends VehiculoSinMotor {

    private String material;

    public Bicicleta() {
    }

    public Bicicleta(String material, String tipo, String color, String marca, double precio) {
        this.material = material;
        this.tipo = tipo;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        
        return "\n-*Informacion de la bici*-" + super.presentarInfo() + 
                "\n\nMaterial: " + material + "\n\nPrecio: " + precio;
    }
}
