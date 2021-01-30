/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alplista4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Exe24colunaParImpar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int linhas, colunas;
        System.out.println("**DIFERENCIANDO COLUNA PAR E COLUNA ÍMPAR**");
        System.out.print("Digite o número de linhas:");
        linhas = entrada.nextInt();
        System.out.print("Digite o número de colunas:");
        colunas = entrada.nextInt();

        int[][] matriz = new int[linhas][colunas];
        System.out.println();
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (c % 2 == 0) {
                    matriz[l][c] = 4;  //se a coluna for par
                } else {
                    matriz[l][c] = 7; //se a coluna for ímpar
                }
                System.out.println("Matriz [" + l + "][" + c + "] = " + matriz[l][c]);
            }
        }
        System.out.println("\nValores Armazenados: ");
        for (int[] vetor : matriz) {
            for (int item : vetor) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

    }

}
