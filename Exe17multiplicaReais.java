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
public class Exe17multiplicaReais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho, contador = 1;
        double numero, produto = 1;
        System.out.println("***MULTIPLICANDO UM NÚMERO PELOS ELEMENTOS DO VETOR***");
        System.out.print("\nDigite o tamanho do vetor:");
        tamanho = leitor.nextInt();
        System.out.print("\nDigite um número: ");
        numero = leitor.nextDouble();

        double[] vetor = new double[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da " + contador + "a posição do vetor:");
            vetor[i] = leitor.nextDouble();
            contador++;
        }

        System.out.println();
        System.out.println("\nImprimindo o produto dos elementos do Vetor pelo número digitado: ");
        for (int i = 0; i < vetor.length; i++) {
            produto = numero * vetor[i];
            System.out.println("Posição " + i + ": " + vetor[i] + " x " + numero + " = " + produto);
        }
    }
    
}
