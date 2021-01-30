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
public class Exe15ordemCrescente {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random aleatorio = new Random();
        int tamanho, auxiliar = 0;
        System.out.println("**COLOCANDO UM VETOR EM ORDEM CRESCENTE**");
        System.out.print("Digite o tamanho do vetor:");
        tamanho = leitor.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(100) + 1;
            System.out.println("Vetor Original[" + i + "] = " + vetor[i]);
        }
        for (int j = 0; j < vetor.length; j++) {
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    auxiliar = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = auxiliar;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor Reorganizado[" + i + "] = " + vetor[i]);
        }
    }
}
