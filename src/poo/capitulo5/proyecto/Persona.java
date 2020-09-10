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
public abstract class Persona {

    protected String nombre;
    protected String numCedula;



    public boolean esCedulaValida(String cedula) {
        boolean validez = false;
        int cantidad = cedula.length();

        int puesto1 = Integer.parseInt(cedula.substring(0, 1));
        int puesto2 = Integer.parseInt(cedula.substring(1, 2));
        int puesto3 = Integer.parseInt(cedula.substring(2, 3));
        int puesto4 = Integer.parseInt(cedula.substring(3, 4));
        int puesto5 = Integer.parseInt(cedula.substring(4, 5));
        int puesto6 = Integer.parseInt(cedula.substring(5, 6));
        int puesto7 = Integer.parseInt(cedula.substring(6, 7));
        int puesto8 = Integer.parseInt(cedula.substring(7, 8));
        int puesto9 = Integer.parseInt(cedula.substring(8, 9));
        int puesto10 = Integer.parseInt(cedula.substring(9, 10));

        int sumaPares = puesto2 + puesto4 + puesto6 + puesto8;

        puesto1 = 2 * puesto1;
        if (puesto1 > 9) {
            puesto1 = puesto1 - 9;
        }
        puesto3 = 2 * puesto3;
        if (puesto3 > 9) {
            puesto3 = puesto3 - 9;
        }
        puesto5 = 2 * puesto5;
        if (puesto5 > 9) {
            puesto5 = puesto5 - 9;
        }
        puesto7 = 2 * puesto7;
        if (puesto7 > 9) {
            puesto7 = puesto7 - 9;
        }
        puesto9 = 2 * puesto9;
        if (puesto9 > 9) {
            puesto9 = puesto9 - 9;
        }

        int sumaImpares = puesto1 + puesto3 + puesto5 + puesto7 + puesto9;

        int sumaTotal = sumaPares + sumaImpares;

        int modulo = sumaTotal % 10;

        int valorVerificador;

        if (modulo >= 1 && modulo <= 9) {
            valorVerificador = 10 - modulo;
        } else {
            valorVerificador = 0;
        }

        int parInicial = Integer.parseInt(cedula.substring(0, 2));

        if (cantidad == 10 && valorVerificador == puesto10 && ((parInicial >= 1 && parInicial <= 24) || parInicial == 30)) {
            validez = true;
        }

        return validez;
    }
}
