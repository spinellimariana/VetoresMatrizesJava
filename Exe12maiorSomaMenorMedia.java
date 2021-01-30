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
public class Exe12maiorSomaMenorMedia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random aleatorio = new Random();
        int tamanho;
        double somaA = 0, somaB = 0, mediaA = 0, mediaB = 0;
        System.out.println("**MAIOR SOMA E MENOR MÉDIA ENTRE DOIS VETORES**");
        System.out.print("Digite o tamanho do vetor:");
        tamanho = leitor.nextInt();

        int[] a = new int[tamanho];
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = aleatorio.nextInt(100) + 1;
            b[i] = aleatorio.nextInt(100) + 1;
            somaA = somaA + a[i];
            somaB = somaB + b[i];
        }
        System.out.println();
        System.out.print("Valores armazenados no Vetor A: ");
        for (int item : a) {
            System.out.print(item + "  ");
        }
        System.out.println();
        System.out.print("Valores armazenados no Vetor B: ");
        for (int item : b) {
            System.out.print(item + "  ");
        }
        mediaA = somaA / a.length;
        mediaB = somaB / b.length;
        System.out.println();
        System.out.println("\nSOMA do Vetor A: " + somaA);
        System.out.println("SOMA do Vetor B: " + somaB);
        System.out.println("MÉDIA do Vetor A: " + mediaA);
        System.out.println("MÉDIA do Vetor B: " + mediaB);
        System.out.println();
        if (somaA > somaB) {
            System.out.println("Maior soma é a do Vetor A e é igual a: " + somaA);
        } else if (somaB > somaA) {
            System.out.println("Maior soma é a do Vetor B e é igual a: " + somaB);
        } else {
            System.out.println("A soma do Vetor A é igual a soma do Vetor B!");
            System.out.println("Soma Vetor A: " + somaA);
            System.out.println("Soma Vetor B: " + somaB);
        }
        if (mediaA < mediaB) {
            System.out.println("Menor média é a do Vetor A e é igual a: " + mediaA);
        } else if (mediaB < mediaA) {
            System.out.println("Menor média é a do Vetor B e é igual a: " + mediaB);
        } else {
            System.out.println("A média do Vetor A é igual a média do Vetor B!");
            System.out.println("Soma Vetor A: " + somaA);
            System.out.println("Soma Vetor B: " + somaB);
        }
    }
}
