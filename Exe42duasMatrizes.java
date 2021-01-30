package alplista4;


import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public class Exe42duasMatrizes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random();
        int linhasA, colunasA, linhasB, colunasB, maiorA, maiorB;
        System.out.println("**PRODUTO ENTRE OS MAIORES NÚMEROS DE DUAS MATRIZES");
        System.out.print("Digite o número de linhas da matriz A:");
        linhasA = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz A:");
        colunasA = scanner.nextInt();
        System.out.print("\nDigite o número de linhas da matriz B:");
        linhasB = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz B:");
        colunasB = scanner.nextInt();
        int[][] a = new int[linhasA][colunasA];
        int[][] b = new int[linhasB][colunasB];
        for (int l = 0; l < a.length; l++) {
            for (int c = 0; c < a[l].length; c++) {
                a[l][c] = aleatorio.nextInt(100) + 1;
            }
        }
        for (int l = 0; l < b.length; l++) {
            for (int c = 0; c < b[l].length; c++) {
                b[l][c] = aleatorio.nextInt(100) + 1;
            }
        }
        maiorA = maiorNumA(a);
        maiorB = maiorNumB(b);
        System.out.println("\nO maior número armazenado na Matriz A é: " + maiorA);
        System.out.println("\nO maior número armazenado na Matriz B é: " + maiorB);
        System.out.println("\nO produto do maior número contido em A pelo maior número contido em B é = " + maiorA*maiorB);
        System.out.println("\nValores Armazenados na matriz A: ");
        for (int[] vetor : a) {
            for (int item : vetor) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
        System.out.println("\nValores Armazenados na matriz B: ");
        for (int[] vetor : b) {
            for (int item : vetor) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }

    static int maiorNumA(int[][] a) {
        int maiorA = a[0][0];
        for (int l = 0; l < a.length; l++) {
            for (int c = 0; c < a[l].length; c++) {
                if (a[l][c] > maiorA) {
                    maiorA = a[l][c];
                }
            }
        }
        return maiorA;
    }

    static int maiorNumB(int[][] b) {
        int maiorB = b[0][0];
        for (int l = 0; l < b.length; l++) {
            for (int c = 0; c < b[l].length; c++) {
                if (b[l][c] > maiorB) {
                    maiorB = b[l][c];
                }
            }
        }
        return maiorB;
    }
}
