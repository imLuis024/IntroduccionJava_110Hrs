/*
    Ejemplo: Presentación

    En este ejemplo se te solicitarán varios valores para presentarte.

    Sin embargo, deberás convertir los valores al tipo de dato solicitado:

    - nombre  -> String
    - edad    -> int
    - hijoUnico -> boolean
    - bebidaFavorita -> String
    - precioBebidaFavorita -> float

    Al final se debe imprimir cada valor.
*/

package main.java.dia1_variables;

import java.util.Scanner;

public class Ejercicio2_PresentacionADetalle {
    public static void main(String[] args) {
        //Inicializar variables
        String nombre, edad, hijoUnico, bebidaFavorita, precioBebidaFavorita;
        Scanner sc = new Scanner(System.in);

        //Pedir datos
        System.out.print("Ingresa tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingresa tu edad: ");
        edad = sc.nextLine();
        System.out.print("¿Eres hijo único? true/false: ");
        hijoUnico = sc.nextLine();
        System.out.print("Ingresa tu bebida favorita: ");
        bebidaFavorita = sc.nextLine();
        System.out.print("Ingresa el precio de bebida  favorita: ");
        precioBebidaFavorita = sc.nextLine();
        //Imprimir tipo de datos sin conversion
        System.out.println("---Datos sin convertir---");
        System.out.println("Tipo de dato nombre: " + ((Object) nombre).getClass().getSimpleName());

        System.out.println("Tipo de dato edad: " + ((Object) edad).getClass().getSimpleName());

        System.out.println("Tipo de dato hijoUnico: " + ((Object) hijoUnico).getClass().getSimpleName());

        System.out.println("Tipo de dato bebidaFavorita: " + ((Object) bebidaFavorita).getClass().getSimpleName());

        System.out.println("Tipo de dato precioBebidaFavorita: " + ((Object) precioBebidaFavorita).getClass().getSimpleName());

        //Logica (para convertir al tipo de dato solicitado)
        var edadInt = Integer.parseInt(edad);
        var hijoUnicoBoolean = Boolean.parseBoolean(hijoUnico);
        var precioBebidaFavoritaFloat = Float.parseFloat(precioBebidaFavorita);

        //Imprimir tipo de datos convertidos
        System.out.println("---Datos Convertidos---");
        System.out.println("Tipo de dato nombre: " + ((Object) nombre).getClass().getSimpleName());

        System.out.println("Tipo de dato edad: " + ((Object) edadInt).getClass().getSimpleName());

        System.out.println("Tipo de dato hijoUnico: " + ((Object) hijoUnicoBoolean).getClass().getSimpleName());

        System.out.println("Tipo de dato bebidaFavorita: " + ((Object) bebidaFavorita).getClass().getSimpleName());

        System.out.println("Tipo de dato precioBebidaFavorita: " + ((Object) precioBebidaFavoritaFloat).getClass().getSimpleName());

        //Imprimir DATOS
        System.out.println("---Datos Recibidos---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edadInt);
        System.out.println("Hijo Unico: " + hijoUnicoBoolean);
        System.out.println("Tipo de bedida favorita: " + bebidaFavorita);
        System.out.println("Precio de bedida favorita: " + precioBebidaFavorita);




    }
}
