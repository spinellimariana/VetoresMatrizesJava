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
public class Exe01imprimeVetor {

    static Scanner leitor = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        int tamanho;
        System.out.println("**IMPRIMINDO O VETOR**");
        System.out.print("Digite o tamanho do vetor:");
        tamanho = leitor.nextInt();

        int[] vetor = new int[tamanho];
        System.out.println("\n**VALORES ARMAZENADOS NO VETOR**");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(100) + 1;
            System.out.println("Vetor[" + i + "] = " + vetor[i]);
        }
        System.out.println("\n**IMPRIMINDO NO MODELO FOR-EACH**");
        System.out.print("Valores armazenados no vetor: ");
        for (int item : vetor) {
            System.out.print(item + " ");
        }
        System.out.println();

    }

}
