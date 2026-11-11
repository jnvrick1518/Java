/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class EjerciciosString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera palabra");
        String palabra1 = sc.next();
        System.out.println("Introduce la segunda palabra");
        String palabra2 = sc.next();
        if (palabra1.length() == palabra2.length()) {
            System.out.println("Ambas palabras tienen la misma longitud");
        } else if (palabra1.length() > palabra2.length()) {
            System.out.println("La primera palabra es más larga que la segunda");
        } else if (palabra1.length() < palabra2.length()) {
            System.out.println("La segunda palabra es más larga que la primera");
        }
        
        System.out.println("Ejercicio 2");
        String password = "admin";
        System.out.println("Primera letra es "+ password.charAt(0) +", y la última es "+ password.charAt(password.length() - 1));
        System.out.println("Introduce la contraseña");
        String intento = sc.next();
        System.out.println("Son iguales? "+ intento.equals(password));
        
        System.out.println("Ejercicio 3");
        String palabra = "";
        String frase = "";
        System.out.println("Introducir palabra");
        palabra = sc.next();
        while (!palabra.equalsIgnoreCase("fin")) {
            frase = frase +" "+ palabra;
            System.out.println("Introduce palabra");
            palabra = sc.next();
        }
        System.out.println(frase.trim());
    }
    
}
