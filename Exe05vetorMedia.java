/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alplista4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Exe05vetorMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho;
        double soma = 0, media = 0;
        System.out.println("**MÉDIA VALORES DO VETOR**");
        System.out.print("Digite o tamanho do vetor:");
        tamanho = leitor.nextInt();

        int[] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número:");
            vetor[i] = leitor.nextInt();
            soma = soma + vetor[i];
        }
        System.out.print("\nValores armazenados no vetor: ");
        for (int item : vetor) {
            System.out.print(item + " ");
        }
        media = soma/vetor.length;
        System.out.printf("\n\nA média dos valores digitados é: " + media);
        System.out.println();
    }
    
}
