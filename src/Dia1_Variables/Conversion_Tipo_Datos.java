package Dia1_Variables;

import java.util.Scanner;

public class Conversion_Tipo_Datos
{
    public static void main(String[] args)
    {
        //Conversion de tipos de datos
        var sc = new Scanner(System.in);
        System.out.print("Numero 1: ");
        var num1 = sc.nextLine();

        System.out.print("Numero 2: ");
        var num2 = sc.nextLine();
        
        var resultado = Integer.parseInt(num1)+Integer.parseInt(num2); //Se parsea de String a Int para poder hacer operaciones.
        System.out.println("resultado de suma aritmetica = " + resultado);

        System.out.println("resultado de concatenacion = " + num1+num2);
    }
}
