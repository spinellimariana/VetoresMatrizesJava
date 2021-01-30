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
public class ado4exe02vetorSoma {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int t = tamanhoVetor();
        int[] v1 = preencheVetor1(t);
        int[] v2 = preencheVetor2(v1);
        int[] vS = somaVetor(v1, v2);
        somaTotal(vS);
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

    static int[] somaVetor(int[] vetor1, int[] vetor2) {
        System.out.println("**SOMA E ARMAZENA NO VETOR 3");
        int[] vetorSoma = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
            System.out.println("Vetor Soma [" + i + "] = " + vetorSoma[i]);
        }
        System.out.println();
        return vetorSoma;
    }

    static int somaTotal(int[] vetorSoma) {
        int soma = 0;
        System.out.println("**SOMA TODOS OS VALORES**");
        for (int i = 0; i < vetorSoma.length; i++) {
            soma = soma + vetorSoma[i];
        }
        System.out.println("Soma de todos os valores é: " + soma);
        return soma;
    }

}
