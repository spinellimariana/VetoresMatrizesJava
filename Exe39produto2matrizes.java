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
public class Exe39produto2matrizes {
            /*multiplicação de matrizes de acordo com o conceito matemático, ou seja, NxM e MxP.
        O número de colunas da 1a matriz precisa ser igual ao número de linhas da 2a matriz*/

    static Scanner entrada = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        System.out.println("**PRODUTO DE DUAS MATRIZES**");
        int[] v = tamanhoMatriz();
        int[][] mA = criaMatrizA(v);
        int[][] mB = criaMatrizB(v);
        int[][] produto = produtoMatriz(mA, mB, v);
        imprimeMatrizes(mA, mB, produto);
    }

    static int[] tamanhoMatriz() {
        /*Funções só retornam uma "coisa". Para retornar o número de linhas e colunas da matriz
        pela mesma função é preciso criar um vetor para abrigar essas variáveis numéricas.
         Aqui estou criando duas matrizes NxM e MxP então preciso de um vetor que armazene 3 números*/
        System.out.println("\n**TAMANHO DA MATRIZ**");
        int[] vetorTamanho = new int[3];
        System.out.print("Digite o número de linhas da Matriz A:");
        vetorTamanho[0] = entrada.nextInt();
        System.out.print("Digite o número de colunas da Matriz A e o número de linhas da Matriz B: ");
        vetorTamanho[1] = entrada.nextInt();
        System.out.print("Digite o número de colunas da Matriz B:");
        vetorTamanho[2] = entrada.nextInt();
        return vetorTamanho;
    }
//preenchi as matrizes com números aleatórios de 1 a 10 para facilitar na hora de rodar o programa
    static int[][] criaMatrizA(int[] v) {
        System.out.println("\n**CRIANDO E PREENCHENDO A MATRIZ A**");
        System.out.println("A matriz está sendo preenchida com números aleatórios!");
        int[][] matrizA = new int[v[0]][v[1]];
        for (int l = 0; l < matrizA.length; l++) {
            for (int c = 0; c < matrizA[l].length; c++) {
                matrizA[l][c] = aleatorio.nextInt(10) + 1;
            }
        }
        return matrizA;
    }

    static int[][] criaMatrizB(int[] v) {
        System.out.println("\n**CRIANDO E PREENCHENDO A MATRIZ B**");
        System.out.println("A matriz está sendo preenchida com números aleatórios!");
        int[][] matrizB = new int[v[1]][v[2]];
        for (int l = 0; l < matrizB.length; l++) {
            for (int c = 0; c < matrizB[l].length; c++) {
                matrizB[l][c] = aleatorio.nextInt(10) + 1;
            }
        }
        return matrizB;
    }

    static int[][] produtoMatriz(int[][] a, int[][] b, int[] v) {
        //colunas de A = linhas de B
        int soma = 0;
        int[][] matrizProduto = new int[v[0]][v[2]];
        for (int i = 0; i < a.length; i++) {
            //
            for (int j = 0; j < b[0].length; j++) {
                //
                soma = 0;
                for (int k = 0; k < a[0].length; k++) {
                    //
                    //
                    soma = soma + (a[i][k] * b[k][j]);
                }
                matrizProduto[i][j] = soma;
            }
        }
        return matrizProduto;
    }

    //imprimi utilizando for each para facilitar a vizualização na hora da impressão do programa.
    static void imprimeMatrizes(int[][] matrizA, int[][] matrizB, int[][] matrizP) {
        System.out.println("\n**IMPRIMINDO A MATRIZ**");
        System.out.println("\nValores Armazenados na Matriz A: ");
        for (int[] vetor : matrizA) {
            for (int item : vetor) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
        System.out.println("\nValores Armazenados na Matriz B: ");
        for (int[] vetor : matrizB) {
            for (int item : vetor) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
        System.out.println("\nMatriz A x B: ");
        for (int[] vetor : matrizP) {
            for (int item : vetor) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }

}
