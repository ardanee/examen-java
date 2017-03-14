/**
 * Created by Kkrot on 13/03/2017.
 */
package com.estuardo;

public class Empleado {
    public String nombre;
    public Double sueldoBase;
    public Double comisiones;
    public Double minutosTarde;
    public Double salarioRecibir;
    private Double descuento;

    public Empleado(String nombre, Double sueldoBase, Double comisiones) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.comisiones = comisiones;
    }

    public void setMinutosTarde(Double minutos) {
        Double porcentaje = 0.0;
        this.minutosTarde = minutos;
        if (minutosTarde >= 1 && minutosTarde < 16) {
            porcentaje = 0.5;
        } else if (minutosTarde >= 16 && minutosTarde < 30) {
            porcentaje = 0.75;
        } else if (minutosTarde >= 30 && minutosTarde < 60) {
            porcentaje = 1.0;
        } else if (minutosTarde >= 60) {
            porcentaje = 1.5;
        }
        descuento = sueldoBase * (porcentaje / 100);
        salarioRecibir = sueldoBase - descuento + comisiones;
    }


    public void print() {
        System.out.println("");
        System.out.println("**************************");
        System.out.println("*INFORMACION DEL EMPLEADO*");
        System.out.println("**************************");
        System.out.println("Nombre: " + nombre);
        System.out.println("Minutos Tarde: " + minutosTarde);
        System.out.println("Salario Base; " + sueldoBase);
        System.out.println("Comisiones: " + comisiones);
        System.out.println("Descuento: " + descuento);
        System.out.println("Liquido a Recibir: " + salarioRecibir);
    }
}
