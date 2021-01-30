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
public class Exe10multiplicaImpar {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho, numero, produto = 1, contador = 1;
        System.out.println("***MULTIPLICANDO UM NÚMERO PELOS ELEMENTOS ÍMPARES DO VETOR***");
        System.out.print("Digite o tamanho do vetor:");
        tamanho = leitor.nextInt();
        System.out.print("Digite um número: ");
        numero = leitor.nextInt();

        int[] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da " + contador + "a posição do vetor:");
            vetor[i] = leitor.nextInt();
            contador++;
        }
        System.out.println();
        System.out.println("Imprimindo o produto das posições ímpares pelo número digitado: ");
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 1) {
                produto = numero * vetor[i];
                System.out.println("Posição " + i + ": " + vetor[i] + " x " + numero + " = " + produto);
            }
        }
    }

}
