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
public class Exe04vetorMenorNum {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho;
        System.out.println("**MENOR VALOR DO VETOR**");
        System.out.print("Digite o tamanho do vetor:");
        tamanho = leitor.nextInt();

        double[] vetor = new double[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número:");
            vetor[i] = leitor.nextDouble();
        }
        System.out.print("\nValores armazenados no vetor: ");
        for (double item : vetor) {
            System.out.print(item + ", ");
        }
        double menor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            
        }
        System.out.println("\n\nO menor número armazenado no vetor é: " + menor);
    }
}
