/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alplista4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Exe36diagonalPrincipal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int linhas, colunas;
        System.out.println("**IMPRINDO OS ELEMENTOS DA DIAGONAL PRINCIPAL**");
        System.out.print("Digite o número de linhas:");
        linhas = entrada.nextInt();
        System.out.print("Digite o número de colunas:");
        colunas = entrada.nextInt();
        System.out.println();
        int[][] matriz = new int[linhas][colunas];

        System.out.println("\nValores armazenados na diagonal principal da matriz:");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                matriz[l][c] = aleatorio.nextInt(100) + 1;
                if (l == c) {
                    System.out.println("Matriz [" + l + "][" + c + "] = " + matriz[l][c]);
                }
            }
        }
        System.out.println("\n\nValores armazenados na Matriz: ");
        for (int[] vetor : matriz) {
            for (int item : vetor) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }
}
