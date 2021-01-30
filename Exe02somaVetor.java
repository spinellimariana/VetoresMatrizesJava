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
public class Exe02somaVetor {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
     
        double soma = 0;
        int tamanho;
        System.out.println("**SOMANDO VALORES DO VETOR**");
        System.out.print("Digite o tamanho do vetor:");
        tamanho = leitor.nextInt();

        double[] vetor = new double[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número:");
            vetor[i] = leitor.nextDouble();
            soma = soma + vetor[i];
        }
        System.out.print("\nValores armazenados no vetor: ");
        for (double item : vetor) {
            System.out.print(item + ", ");
        }
        System.out.printf("\n\nSoma dos valores digitados é: %.2f\n", soma);
    }

}
