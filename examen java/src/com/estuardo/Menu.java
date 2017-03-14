package com.estuardo;

import java.util.Scanner;

/**
 * Created by Kkrot on 13/03/2017.
 */
public class Menu {
    String nombre;
    Double sueldoBase, minutosTarde, comisiones;
    Scanner entradaEscaner;
    Empleado e;

    public Menu() {
        mostrarMenu();
    }

    public void mostrarMenu() {
        int opcion = 0;
        System.out.println("");
        System.out.println("****************");
        System.out.println("*MENU PRINCIPAL*");
        System.out.println("****************");
        System.out.println("Seleccione una opcion");
        System.out.println("1. Crear nuevo Empleado");
        System.out.println("2. Ingresar minutos tarde");
        System.out.println("3. Mostrar informacion");
        Scanner entradaEscaner = new Scanner(System.in);
        opcion = Integer.parseInt(entradaEscaner.nextLine());
        if (opcion == 1) {
            e = crearEmpleado();
            mostrarMenu();
        } else if (opcion == 2) {
            tardanza(e);
            mostrarMenu();
        } else if (opcion == 3) {
            imprimir(e);
            mostrarMenu();
        }
    }

    public Empleado crearEmpleado() {
        System.out.println("Para crear un nuevo empleado ingrese los siguientes datos");
        System.out.println("");

        Empleado e;
        nombre = "";
        System.out.println("Nombre");
        entradaEscaner = new Scanner(System.in);
        nombre = entradaEscaner.nextLine();
        sueldoBase = 0.0;
        System.out.println("Sueldo base");
        entradaEscaner = new Scanner(System.in);
        sueldoBase = Double.parseDouble(entradaEscaner.nextLine());
        comisiones = 0.0;
        System.out.println("Comisiones");
        entradaEscaner = new Scanner(System.in);
        comisiones = Double.parseDouble(entradaEscaner.nextLine());

        e = new Empleado(nombre, sueldoBase, comisiones);
        System.out.println("¡Se creó el empleado correctamente!");
        System.out.println("");
        return e;
    }

    private void tardanza(Empleado e) {
        if (e == null) {
            System.out.println("Primero debe crear un empleado");
            System.out.println("");
        } else {
            minutosTarde = 0.0;
            System.out.println("Ingrese la tardanza en minutos para el empleado " + e.nombre);
            entradaEscaner = new Scanner(System.in);
            minutosTarde = Double.parseDouble(entradaEscaner.nextLine());
            e.setMinutosTarde(minutosTarde);
            System.out.println("¡Se colocó el tiempo correctamente!");
            System.out.println("");
        }
    }

    private void imprimir(Empleado e) {
        if (e == null) {
            System.out.println("Primero debe crear un empleado");
            System.out.println("");
        } else {
            e.print();
        }
    }
}
