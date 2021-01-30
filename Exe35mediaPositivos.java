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
public class Exe35mediaPositivos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int linhas, colunas;
        double media, controle = 0, soma = 0;
        System.out.println("**MÉDIA DOS ELEMENTOS POSITIVOS**");
        System.out.print("Digite o número de linhas:");
        linhas = entrada.nextInt();
        System.out.print("Digite o número de colunas:");
        colunas = entrada.nextInt();
        int[][] matriz = new int[linhas][colunas];
        
        System.out.println("\nPreencha a matriz!");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.print("Digite um número:");
                matriz[l][c] = entrada.nextInt();
                if (matriz[l][c] > 0) {
                    soma = soma + matriz[l][c];
                    controle++;
                }
            }
        }
        media = soma / controle;
        System.out.printf("\nA média dos valores positivos inseridos na matriz é: %.2f", media);
        System.out.println("\n\nValores armazenados na Matriz: ");
        for (int[] vetor : matriz) {
            for (int item : vetor) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

    }

}
