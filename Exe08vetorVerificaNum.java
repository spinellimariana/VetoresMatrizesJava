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
public class Exe08vetorVerificaNum {

    static Scanner leitor = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        System.out.println("**PROCURANDO UM NÚMERO NO VETOR**");
        int tam = tamanho();
        int[] v = criaVetor(tam);
        int num = numero();
        procuraNum(v, num);
        imprimir(v, num);

    }

    static int tamanho() {
        int tamanho;
        System.out.print("Digite o tamanho do vetor:");
        tamanho = leitor.nextInt();
        return tamanho;
    }

    static int[] criaVetor(int t) {
        System.out.println("\n**CRIANDO A PREENCHENDO O VETOR**");
        System.out.println("O vetor está sendo preenchidos com números aleatórios!");
        int[] vetor = new int[t];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(100) + 1;
        }
        return vetor;
    }

    static int numero() {
        int n;
        do {
            System.out.print("\nDigite um número de 1 a 100: ");
            n = leitor.nextInt();
            if (n <= 0 || n > 100) {
                System.out.println("Número inválido. Tente novamente!");
            }
        } while (n <= 0 || n > 100);
        return n;
    }

    static void procuraNum(int[] v, int n) {
        System.out.println("\n**PROCURANDO O NÚMERO**");
        boolean achou = false;
        for (int i = 0; i < v.length; i++) {
            if (n == v[i]) {
                achou = true;
                System.out.println("\nO número ESTÁ presente na posição " + i + " do vetor!");
            }
        }
        if (achou == false) {
            System.out.println("\nO número NÃO ESTÁ presente no vetor!");
        }
    }

    static void imprimir(int[] vetor, int numero) {
        System.out.println("\nValores armazenados no vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor[" + i + "] = " + vetor[i]);
            if (numero == vetor[i]) {
                System.out.print(" <---- ACHOU!!!");
            }
            System.out.println();
        }
    }

}
