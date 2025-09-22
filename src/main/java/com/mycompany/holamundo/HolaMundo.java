
package com.mycompany.holamundo;

/**
 *
 * @author seba
 */

import java.util.Scanner;

public class HolaMundo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
        String separacion = "-----------------";
        
        
        System.out.println("Hola, Java");       
  
        
        
        System.out.print("Ingrese su nombre: ");
        String name = sc.next();
        
        System.out.print("Ingrese su edad: ");
        int age = sc.nextInt();
 
        System.out.print("Ingrese su altura(en centimetros): ");
        double length = sc.nextDouble();
        
        System.out.print("Sos estudiante? (responda con 'true' or 'false'): ");
        boolean student = sc.nextBoolean();
     
        
        System.out.println(separacion);
        System.out.println("_name: " + name);
        System.out.println("_age: " + age);
        System.out.println("_length: " + length);
        System.out.println("_student: " + student);
        System.out.println(separacion);
        
        
        System.out.println("Ahora se le solicitarán números para realizar las operaciones ariméticas básica");
        
        System.out.print("Ingrese el primer numero");
        num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo numero");
        num2 = sc.nextInt();
        
        System.out.println(separacion);
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(separacion);
        
        System.out.println("Nombre : Juan Pérez\nEdad : 30 años\nDirección : \"Calle falsa 123\" ");
        
        /*
        Analiza el siguiente código y responde: ¿Cuáles son expresiones y cuáles son 
        instrucciones? Explica la diferencia en un breve párrafo.  
        int x = 10; // Línea 1  
        x = x + 5; // Línea 2  
        System.out.println(x); // Línea 3 
        */
        
        System.out.println("En el ejercicio 7, la linea 1 sería una instruccion,"
                + " ya que le pide a la máquina que cree una variable entera llamada x\nEn la linea 2"
                + "hay una instruccion en la primer parte donde se le asigna un valor a la variable x"
                + "Luego hay una expresión \"x + 5\" "
                + "La línea 3 es una instruccion.");
        System.out.println("La diferencia entre estas es que la instruccion se enfoca en"
                + " realizar una accion, y la expresión se enfoca en crear un valor,"
                + " y la expresion siempre se encuentra dentro de una instruccion. ");
        
        
        /*EJERCICIO 8 */
        
        Scanner scanner = new Scanner(System.in);

        // DIVISION CON ENTEROS
        
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // para validar que se pueda dividir
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
        } else {
            int resultado = numero1 / numero2;
            System.out.println("Resultado de la división entera: " + resultado);
        }
        
        
        // DIVISION CON DECIMALES
        System.out.print("Ingrese el primer número: ");
        double numero3 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero4 = scanner.nextDouble();

        if (numero4 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
        } else {
            double resultado = numero3 / numero4;
            System.out.println("Resultado de la división con decimales: " + resultado);
        }
        
        /* Ejercicio 9*/
        System.out.print("Ingresa tu nombre: "); 
        String nombreN = scanner.nextLine();
        System.out.println("Hola, " + nombreN); 

        System.out.println("El error que tenia era que intentaba leer un numero entero "
                + "y guradarlo en una variable tipo string.\n Para corregirlo solo cambié \"nextInt()\" por \"nextLine()\" ");
        
        /* Ejecricio 10 */
        System.out.println("El valor de resultado es 2. Esto ocurre por que al dividir un numero entero por otro, nos devuelve un entero, y se eliminan los decimales.");
}

    }
