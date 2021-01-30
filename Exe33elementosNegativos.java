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
public class Exe33elementosNegativos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean negativo = false;
        int linhas, colunas;
        System.out.println("**MOSTRANDO POSIÇÃO DOS NÚMEROS NEGATIVOS**");
        System.out.print("Digite o número de linhas:");
        linhas = entrada.nextInt();
        System.out.print("Digite o número de colunas:");
        colunas = entrada.nextInt();
        System.out.println();
        int[][] matriz = new int[linhas][colunas];

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.print("Digite um número: ");
                matriz[l][c] = entrada.nextInt();
                if (matriz[l][c] < 0) {
                    negativo = true;
                }
            }
        }
        if (negativo == false) {
            System.out.println("\nNão existem números negativos armazenados nessa matriz!");
        } else {
            System.out.println("\nNúmeros negativos armazenados na matriz:");
        }
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (matriz[l][c] < 0) {
                    System.out.println("\nElemento negativo posicionado na linha " + l + " coluna " + c);
                    System.out.println("Matriz [" + l + "][" + c + "] = " + matriz[l][c]);
                    negativo = true;
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
