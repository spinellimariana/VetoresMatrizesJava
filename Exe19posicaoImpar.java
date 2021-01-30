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
public class Exe19posicaoImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho, contador = 1;
        System.out.println("***IMPRIMINDO SÓ AS POSIÇÕES ÍMPARES***");
        System.out.print("\nDigite o tamanho do vetor:");
        tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da " + contador + "a posição do vetor:");
            vetor[i] = scanner.nextInt();
            contador++;
        }
        /*considerando 0 como a 1a posição conforme o enunciado pede, as posições originalmente pares passam a 
        constar como ímpares. Por isso, no if do laço abaixo considerei o resto == 0 porque, na verdade, estamos 
        buscando as posições pares*/

        System.out.println("\nValores armazenados nas posições ímpares:");
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Vetor [" + (i + 1) + "] = " + vetor[i]);
            }
        }
    }

}
