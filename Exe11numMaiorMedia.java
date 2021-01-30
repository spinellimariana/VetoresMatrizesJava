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
public class Exe11numMaiorMedia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho;
        double soma = 0, media, contador = 0;
        boolean maior = false;
        
        System.out.println("**NÚMERO MAIORES QUE A MÉDIA DAS POSIÇÕES PARES DO VETOR**");
        System.out.print("Digite o tamanho do vetor:");
        tamanho = leitor.nextInt();
        double[] vetor = new double[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número:");
            vetor[i] = leitor.nextInt();
            if (i % 2 == 0) {
                soma = soma + vetor[i];
                contador++;
            }
        }
        System.out.print("\nValores armazenados no vetor: ");
        for (double item : vetor) {
            System.out.print(item + "  ");
        }
        
        media = soma / contador;
        System.out.println();
        System.out.printf("\nMédia dos valores armazenados nas posições pares do vetor é = %.2f", media);
        System.out.println("\n\nSão números maiores que a média dos elementos das posições pares: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println("Vetor [" + i + "] = " + vetor[i]);
                maior = true;
            }
        }
        if (maior == false) {
            System.out.println("Nenhum número é maior que a média!");
        }
    }

}
