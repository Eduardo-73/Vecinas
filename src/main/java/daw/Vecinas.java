/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Vecinas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] vecinas = new int[5][5];
        rellenarMatriz(vecinas);
        mostrarMatriz(vecinas);
        System.out.print("\n" + mostrarVecinas(vecinas, 4, 1));
    }

    private static void rellenarMatriz(int[][] matrix) {
        Random rd = new Random();
        int numAleatorio = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rd.nextInt(11, 99);
            }
        }
    }

    private static void mostrarMatriz(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
        }
    }

    private static ArrayList<Integer> mostrarVecinas(int[][] matrix,
            int fila, int columna) {
        ArrayList<Integer> vecinas = new ArrayList<>();
        System.out.println("");
        System.out.print("\nNúmero elegido [" + matrix[fila][columna] + "]");
        for (int i = (fila - 1); i <= (fila + 1); i++) {
            if (!(i < 0 || (i >= matrix.length))) {
                for (int j = (columna - 1); j <= (columna + 1); j++) {
                    if (!(j < 0 || (j >= matrix[i].length))) {
                        if (!((i == fila) && (j == columna))) {
                            vecinas.add(matrix[i][j]);
                        }
                    }
                }
            }
        }
        return vecinas;
    }
}
