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
public class Exe03vetorMaior {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho;
        System.out.println("**MAIOR VALOR DO VETOR**");
        System.out.print("Digite o tamanho do vetor:");
        tamanho = leitor.nextInt();

        int[] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número:");
            vetor[i] = leitor.nextInt();
        }
        System.out.print("\nValores armazenados no vetor: ");
        for (int item : vetor) {
            System.out.print(item + " ");
        }
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println("\n\nO maior número armazenado no vetor é: " + maior);
    }
}
