package main.java.dia1_variables;

import java.util.Scanner;

public class Ejercicio1_DetalleLibro {
        /*
        Se solicita introducir inforamcion del siguiente libro:

        -Proporciona el titulo
        -Proporciona el autor

         Despues se debe mandar a imprimir:
         <titulo> fué escrito por <autor>

         */
    public static void main(String[] args) {
//Variables
        var sc = new Scanner(System.in);
        String title,author;

// Solicitar datos
        System.out.print("Introduce el nombre del libro:");
        title = sc.nextLine();

        System.out.print("Introduce el autor del libro:");
        author = sc.nextLine();

// Imprimir
        System.out.println("El nombre del libro es: "+title+", su autor es: "+author);
    }
}
