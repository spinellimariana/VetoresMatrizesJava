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
public class Exe40matrizProcuraNum {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random aleatorio = new Random();
        int linhas, colunas, numero;
        boolean achou = false;
        System.out.println("**PROCURANDO UM NÚMERO NA MATRIZ**");
        System.out.print("Digite o número de linhas:");
        linhas = leitor.nextInt();
        System.out.print("Digite o número de colunas:");
        colunas = leitor.nextInt();
        do {
            System.out.print("\nDigite um número de 1 a 100: ");
            numero = leitor.nextInt();
            if (numero <= 0 || numero > 100) {
                System.out.println("Número inválido. Tente novamente!");
            }
        } while (numero <= 0 || numero > 100);

        int[][] matriz = new int[linhas][colunas];

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                matriz[l][c] = aleatorio.nextInt(100) + 1;
                if (numero == matriz[l][c]) {
                    achou = true;
                    System.out.println("\nO número ESTÁ presente na posição [" + l + "][" + c + "] da matriz!");
                }
            }
        }
        if (achou == false) {
            System.out.println("\nO número NÃO ESTÁ presente na matriz!");
        }
        System.out.println("\nValores armazenados na matriz: ");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.print("Matriz [" + l + "][" + c + "] = " + matriz[l][c]);
                if (numero == matriz[l][c]) {
                    System.out.print("  <---- ACHOU!");
                    achou = true;
                }
                System.out.println();
            }
        }
    }

}
