/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alplista4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Exe16paresImpares {

    static Scanner leitor = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        System.out.println("***ORGANIZANDO EM PARES PRIMEIRO E IMPARES DEPOIS***");
        int t = tamanho();
        int[] vetor = criaVetor(t);
        System.out.println("\n***ORDEM INICIAL***");
        imprimir(vetor);
        vetor = paresImpares(vetor);
        System.out.println("\n***ORDEM FINAL***");
        imprimir(vetor);

    }

    static int tamanho() {
        int tamanho;
        System.out.println("\n**FUNÇÃO TAMANHO**");
        System.out.print("Digite o tamanho do vetor:");
        tamanho = leitor.nextInt();
        return tamanho;
    }

    static int[] criaVetor(int t) {
        int[] vetor = new int[t];
        System.out.println("\n**CRIANDO O PREENCHENDO O VETOR**");
        System.out.println("O vetor está sendo preenchido com números aleatórios!");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(50) + 1;
        }
        return vetor;
    }

    static int[] paresImpares(int[] vetor) {
        System.out.println("\nEstamos organizando a ordem...");
        int contador = 0;
        ArrayList<Integer> impares = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                pares.add(vetor[i]);
            } else {
                impares.add(vetor[i]);
            }
        }
        for (int i = 0; i < pares.size(); i++) {
            vetor[contador] = pares.get(i);
            contador++;
        }
        for (int i = 0; i < impares.size(); i++) {
            vetor[contador] = impares.get(i);
            contador++;
        }
        return vetor;
    }

    static void imprimir(int[] vetor) {
        System.out.print("Valores armazenados no vetor: ");
        for (int item : vetor) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
