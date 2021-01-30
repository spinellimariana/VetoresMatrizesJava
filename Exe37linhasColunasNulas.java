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
public class Exe37linhasColunasNulas {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int[]v = tamanhoMatriz();
        int [][] m = criaMatriz(v);
        System.out.println("Linhas nulas: " + linhasNulas(m));
        System.out.println("Colunas nulas: " + colunasNulas(m));
        imprimeForEach(m);
    }

    static int[] tamanhoMatriz() {
        /*Funções só retornam uma "coisa". Para retornar o número de linhas e colunas da matriz
        pela mesma função é preciso criar um vetor para abrigar essas duas variáveis numéricas*/
        System.out.println("\n**TAMANHO DA MATRIZ**");
        int[] vetorTamanho = new int[2];
        System.out.print("Digite o número de linhas:");
        vetorTamanho[0] = entrada.nextInt();
        System.out.print("Digite o número de colunas: ");
        vetorTamanho[1] = entrada.nextInt();
        return vetorTamanho;
    }

    static int[][] criaMatriz(int[] v) {
        System.out.println("\n**CRIANDO E PREENCHENDO A MATRIZ**");
        int[][] matriz = new int[v[0]][v[1]];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.print("Digite um número");
                matriz[l][c] = entrada.nextInt();
            }
        }
        return matriz;
    }

    static int linhasNulas(int[][] mL) {
        int zeros = 0, linhas = 0;
        System.out.println("\n**CONTANDO LINHAS NULAS**");
        for (int l = 0; l < mL.length; l++) {
            zeros = 0;
            for (int c = 0; c < mL[l].length; c++) {
                if (mL[l][c] == 0) {
                    zeros++;
                };
            }
            if (zeros == mL[l].length) {
                linhas++;
            }
        }
        return linhas;
    }

    static int colunasNulas(int[][] mC) {
        int zeros = 0, colunas = 0;
        System.out.println("\n**CONTANDO COLUNAS NULAS**");
        for (int c = 0; c < mC.length; c++) {
            zeros = 0;
            for (int l = 0; l < mC[c].length; l++) {
                if (mC[l][c] == 0) {
                    zeros++;
                }
            }
            if (zeros == mC[c].length) {
                colunas++;
            }
        }
        return colunas;
    }

    static void imprimeForEach(int[][] mP) {
        System.out.println("\n**IMPRIMINDO A MATRIZ**");
        System.out.println("Valores Armazenados: ");
        for (int[] vetor : mP) {
            for (int item : vetor) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }   

}
