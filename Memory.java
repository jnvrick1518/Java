/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Memory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] tablero = {{"pez","elefante"},{"perro","gato"},{"elefante","pez"},{"gato","perro"}};
        // mostrar(tablero);
        String[][] tableroJugar = new String [4][2];
        rellenar(tableroJugar);
        // mostrar(tableroJugar);
        jugar(tablero, tableroJugar);
    }

    private static void mostrar(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }
    }

    private static void rellenar(String[][] tableroJugar) {
        for (int i = 0; i < tableroJugar.length; i++) {
            Arrays.fill(tableroJugar[i], "___");
        }
    }

    private static void jugar(String[][] tablero, String[][] tableroJugar) {
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        Scanner sc = new Scanner(System.in);
        int aciertos = 0;
        do {
            System.out.println("Introduce la coordenada x de la primera posición");
            x1 = sc.nextInt();
            System.out.println("Introduce la coordenada y de la primera posición");
            y1 = sc.nextInt();
            System.out.println("Introduce la coordenada x de la segunda posición");
            x2 = sc.nextInt();
            System.out.println("Introduce la coordenada y de la segunda posición");
            y2 = sc.nextInt();
            if (tablero[x1][y1].equals(tablero[x2][y2])) {
                tableroJugar[x1][y1] = tablero[x1][y1];
                tableroJugar[x2][y2] = tablero[x2][y2];
                aciertos++;
            } else {
                System.out.println("Error");
            }
            mostrar(tableroJugar);
        } while (aciertos<4);
    }
    
}
