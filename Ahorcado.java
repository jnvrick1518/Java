/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char palabra[] = {'a','r','b','o','l'};
        char adivinado[] = new char [5];
        int entos = 5;
        char resp = 'x';
        for (int i = 0; i < palabra.length; i++) {
            do {
                System.out.println("Introduce la "+ (i + 1) +"ª letra.");
                resp = sc.next().charAt(0);
                if (resp != palabra[i]) {
                    entos--;
                    System.out.println("Incorrecto, te quedan "+ entos +" intentos");
                }
            } while (resp != palabra[i]);
        }
    }
    
}
