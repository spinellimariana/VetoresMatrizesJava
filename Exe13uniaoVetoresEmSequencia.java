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
public class Exe13uniaoVetoresEmSequencia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random aleatorio = new Random();
        int tamanho;
        System.out.println("***JUNTANDO 2 VETORES EM UM 3o - EM SEQUÊNCIA***");
        System.out.println("\nDigite o tamanho do vetor: ");
        tamanho = leitor.nextInt();

        int[] a = new int[tamanho];
        int[] b = new int[a.length];
        int[] uniao = new int[a.length + b.length];
        
        //preenhendo os vetores A e B aleatoramente usando o random
        for (int i = 0; i < a.length; i++) {
            a[i] = aleatorio.nextInt(100) + 1;
            b[i] = aleatorio.nextInt(100) + 1;
        }
        //imprimindo os valores de A
        System.out.print("\nValores armazenados no Vetor A: ");
        for (int item : a) {
            System.out.print(item + "  ");
        }
        //imprimindo os valores de B
        System.out.println();
        System.out.print("\nValores armazenados no Vetor B: ");
        for (int item : b) {
            System.out.print(item + "  ");
        }
        //juntando os vetores A e B em um terceiro vetor
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            uniao[k] = a[i];
            k++;
        }
        for (int i = 0; i < b.length; i++) {
            uniao[k] = b[i];
            k++;
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
