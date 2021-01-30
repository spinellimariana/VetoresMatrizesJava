/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADOs;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ado4exe03vetorUniao {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int t = tamanhoVetor();
        int[] v1 = preencheVetor1(t);
        int[] v2 = preencheVetor2(v1);
        vetorUniao(v1, v2);
    }

    static int tamanhoVetor() {
        int tamanho;
        System.out.println("Digite o tamanho do vetor: ");
        tamanho = leitor.nextInt();
        return tamanho;
    }

    static int[] preencheVetor1(int tamanho) {
        System.out.println("**CRIA E PREENCHE O 1o VETOR**");
        int[] vetor1 = new int[tamanho];
        for (int i = 0; i < vetor1.length; i++) {
            System.out.printf("Digite o valor de vetor[%d]: ", i);
            vetor1[i] = leitor.nextInt();
        }
        System.out.println();
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Vetor 1 [" + i + "] = " + vetor1[i]);
        }
        System.out.println();
        return vetor1;
    }
    static int[] preencheVetor2(int[] vetor1) {
        System.out.println("**CRIA E PREENCHE O 2o VETOR**");
        int[] vetor2 = new int[vetor1.length];
        for (int i = 0; i < vetor2.length; i++) {
            System.out.printf("Digite o valor de vetor[%d]: ", i);
            vetor2[i] = leitor.nextInt();

        }
        System.out.println();
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Vetor 2 [" + i + "] = " + vetor2[i]);
        }
        System.out.println();
        return vetor2;
    }

    static int[] vetorUniao(int[] vetor1, int[] vetor2) {
        System.out.println("**JUNTADO OS VETORES NO 3o VETOR**");
        int[] vetorU = new int[vetor1.length + vetor2.length];
        for (int i = 0, j = 0; i < vetorU.length; i += 2, j++) {
            vetorU[i] = vetor1[j];
            vetorU[i + 1] = vetor2[j];
        }
        for (int i = 0; i < vetorU.length; i++) {
            System.out.println("Vetor 1 + 2 [" + i + "] = " + vetorU[i]);
        }
        System.out.println();
        return vetorU;
    }

}
