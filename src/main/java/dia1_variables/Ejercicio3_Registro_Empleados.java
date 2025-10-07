package main.java.dia1_variables;

import java.util.Scanner;

public class Ejercicio3_Registro_Empleados {
    public static void main(String[] args) {
        //Inicializar variables
        String nombre;
        int edad;
        float sueldo;
        boolean empleadoConfianza;
        Scanner sc = new Scanner(System.in);
        //Pedir datos
        System.out.print("Proporciona tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("Proporciona tu edad: ");
        edad = sc.nextInt();
        System.out.print("Proporciona tu sueldo: ");
        sueldo = sc.nextFloat();
        System.out.print("¿Eres un empleado de confianza? (true/false): )");
        empleadoConfianza = sc.nextBoolean();
        //Imprimir datos
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Empleado de confianza: " + empleadoConfianza);
    }

}

