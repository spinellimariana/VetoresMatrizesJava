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
public class Exe41funcaoMaiorNumMatriz {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random aleatorio = new Random();
        int linhas, colunas;
        System.out.println("**MAIOR NÚMERO DA MATRIZ**");
        System.out.print("Digite o número de linhas:");
        linhas = leitor.nextInt();
        System.out.print("Digite o número de colunas:");
        colunas = leitor.nextInt();
        int[][] matriz = new int[linhas][colunas];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                matriz[l][c] = aleatorio.nextInt(100) + 1;
            }
        }
        System.out.println("\nO maior número armazenado na matriz é: " + maiorNum(matriz));
        System.out.println("\nValores Armazenados: ");
        for (int[] vetor : matriz) {
            for (int item : vetor) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }

    static int maiorNum(int[][] matriz) {
        int maior = matriz[0][0];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (matriz[l][c] > maior) {
                    maior = matriz[l][c];
                }
            }
        }
        return maior;
    }
}
