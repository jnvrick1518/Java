/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;

import java.util.Arrays;

/**
 *
 * @author MEDAC
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) { // Forma 1 de mostrar la matriz
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < matriz.length; i++) { // Forma 2 de mostrar la matriz
            System.out.println(Arrays.toString(matriz[i]));
        }
        matriz[1][1] = 5;
        for (int i = 0; i < matriz.length; i++) { // Forma 2 de mostrar la matriz
            System.out.println(Arrays.toString(matriz[i]));
        }
        
        // ej 1
        
        int cont = 1;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = cont++;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        
        // conozco el valor
        
        int[][] conocido = {{1,2,3},{4,5,6},{7,8,9}};
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        
        // ejercicio 2
        
        char [][] tabla = new char[4][2];
        
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = 'A'; 
            }
        }
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }
        
        // ejercicio 3
        
        tabla[(int)(Math.random() * 4)][(int)(Math.random()*2)] = 'B';
        
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }
    }
    
}
