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
public class Exe28somaElemLinha {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("**SOMA DOS ELEMENTOS DE CADA LINHA DA MATRIZ**");
        int[] v = tamanhoMatriz();
        int[][] m = criaMatriz(v);
        somaElementosLinha(m);
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
        Random aleatorio = new Random();
        System.out.println("\n**CRIANDO E PREENCHENDO A MATRIZ**");
        System.out.println("A matriz está sendo preenchida com números aleatórios!");
        int[][] matriz = new int[v[0]][v[1]];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                matriz[l][c] = aleatorio.nextInt(50) + 1;
            }
        }
        return matriz;
    }

    static int somaElementosLinha(int m[][]) {
        int soma = 0, contador = 0;
        System.out.println("\n**SOMANDO CADA LINHA**");
        for (int l = 0; l < m.length; l++) {
            contador = 0;
            soma = 0;
            for (int c = 0; c < m[l].length; c++) {
                soma = soma + m[l][c];
                contador++;
            }
            if (contador == m[l].length) {
                System.out.printf("Soma dos elementos da linha [%d] = %d \n", l, soma);
            }
        }
        return soma;
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
