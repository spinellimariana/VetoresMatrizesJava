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
public class Exe09produto2vetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random();
        int tamanho;
        System.out.println("***MULTIPLICANDO CADA ELEMENTO DE A PELO CORRESPONDENTE EM B***");
        System.out.print("Digite o tamanho do vetor:");
        tamanho = scanner.nextInt();

        int[] a = new int[tamanho];
        int[] b = new int[a.length];
        int[] c = new int[a.length];
        System.out.println("\nNúmeros armazenados no Vetor A e no Vetor B: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = aleatorio.nextInt(100) + 1;
            b[i] = aleatorio.nextInt(100) + 1;
            c[i] = a[i] * b[i];
            System.out.println("Vetor A [" + i + "] = " + a[i]);
            System.out.println("Vetor B [" + i + "] = " + b[i]);
        }
        System.out.println();
        System.out.println("\nProduto dos números armazenados em cada um das posições dos Vetores A e B:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Vetor C [" + i + "] = " + c[i]);
        }
    }
}
