package main.java.dia1_variables;

import java.util.Scanner;

public class VariablesPorConsola {
    public static void main(String[] args) {

        //Introducir valores por consola
        var sc = new Scanner(System.in); //in - input - entrada de datos

        System.out.println("Introduce tu nombre: ");
        var nombre = sc.nextLine();

        System.out.println(nombre);
    }

}
