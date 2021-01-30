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
public class Exe06vetorProduto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho;
        double produto = 1;
        System.out.println("**PRODUTO DOS VALORES DO VETOR**");
        System.out.print("Digite o tamanho do vetor:");
        tamanho = leitor.nextInt();

        int[] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número:");
            vetor[i] = leitor.nextInt();
            produto = produto * vetor[i];
        }
        System.out.print("\nValores armazenados no vetor: ");
        for (int item : vetor) {
            System.out.print(item + " ");
        }
        System.out.printf("\n\nO produto de todos os valores digitados é: " + produto);
        System.out.println();
    }
}
