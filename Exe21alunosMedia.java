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
public class Exe21alunosMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho, contador = 1;
        double soma = 0, media;
        System.out.println("**ALUNOS ACIMA DA MÉDIA**");
        System.out.print("\nTotal de alunos na sala: ");
        tamanho = scanner.nextInt();
        String[] alunos = new String[tamanho];
        int[] notas = new int[alunos.length];

        System.out.println("\nDigite os nomes e as notas dos alunos:");
        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Aluno " + contador + ":");
            alunos[i] = scanner.next();
            do {
                System.out.print("Nota: ");
                notas[i] = scanner.nextInt();
            } while (notas[i] < 0 || notas[i] > 10);
            soma = soma + notas[i];
            contador++;
        }
        System.out.println();
        media = soma / notas.length;
        System.out.println("\nA média da sala é: " + media);
        System.out.println("\nOs alunos acima da média são:");
        for (int i = 0; i < alunos.length; i++) {
            if (notas[i] > media) {
                System.out.println(alunos[i]);
            }
        }
        System.out.println();
        System.out.println("\nNomes dos alunos e suas respectivas notas para conferência: ");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i] + " = " + notas[i]);
        }
    }
}
