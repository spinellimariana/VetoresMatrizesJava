/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADOs;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ado4exe01vetorCopia {

    public static void main(String[] args) {
        int t = tamanhoVetor();
        int[] v = preencheVetor(t);
        copiaVetor(v);
    }

    static int tamanhoVetor() {
        Scanner leitor = new Scanner(System.in);
        int tamanho;
        System.out.println("Digite o tamanho do vetor: ");
        tamanho = leitor.nextInt();
        return tamanho;

    }

    static int[] preencheVetor(int tamanho) {
        System.out.println("**CRIA E PREENCHE VETOR ALEATORIAMENTE**");
        int[] vetor = new int[tamanho];
        Random aleatorio = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(100) + 1;
            System.out.println("Vetor [" + i + "] = " + vetor[i]);
        }
        System.out.println();
        return vetor;
    }

    static int[] copiaVetor(int[] vetor) {
        System.out.println("**COPIA O VETOR E IMPRIME**");
        int[] vetorCopiador = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            vetorCopiador[i] = vetor[i];
            System.out.println("Vetor Copiador [" + i + "] = " + vetorCopiador[i]);
        }
        System.out.println();
        return vetorCopiador;
    }

    

}
