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
public class Exe14uniaoVetoresAlternado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random aleatorio = new Random();
        int tamanho;
        System.out.println("***JUNTANDO 2 VETORES EM UM 3o - ALTERNADO***");
        System.out.println("\nDigite o tamanho do vetor: ");
        tamanho = leitor.nextInt();

        int[] a = new int[tamanho];
        int[] b = new int[a.length];
        int[] uniao = new int[a.length + b.length];
        
        //preenchendo aleatoriamente usando o Random
        for (int i = 0; i < a.length; i++) {
            a[i] = aleatorio.nextInt(100) + 1;
            b[i] = aleatorio.nextInt(100) + 1;
        }
        //imprimindo os valores de A em linha
        System.out.print("\nValores armazenados no Vetor A: ");
        for (int item : a) {
            System.out.print(item + "  ");
        }
        //imprimindo os valores de B em linha
        System.out.println();
        System.out.print("\nValores armazenados no Vetor B: ");
        for (int item : b) {
            System.out.print(item + "  ");
        }
        //armazenando os vetores A e B alternadamente no 3o vetor
        for (int i = 0, j = 0; i < uniao.length; i += 2, j++) {
            uniao[i] = a[j];
            uniao[i + 1] = b[j];
        }
        //imprimindo o terceiro vetor
        System.out.println();
        System.out.print("\nValores armazenados no Vetor União: ");
        for (int item : uniao) {
            System.out.print(item + "  ");
        }
        System.out.println();
    }
}
