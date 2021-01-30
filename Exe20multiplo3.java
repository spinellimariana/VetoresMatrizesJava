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
public class Exe20multiplo3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random aleatorio = new Random();
        int tamanho;
        boolean nenhum = true, nenhum2 = true;
        System.out.println("**MÚLTIPLOS DE 3**");
        System.out.print("Digite o tamanho do vetor: ");
        tamanho = leitor.nextInt();
        int[] vetor = new int[tamanho];
        ArrayList<Integer> multiplos3 = new ArrayList<>();

        /*como não sei quantos múltiplos de 3 serão inseridos no vetor inicial, na maioria das vezes o segundo vetor
que iria abrigar apenas os múltiplos de 3 precisa ter um tamanho menor. Como esse tamanho seria volátil usei
o ArrayList para controlar*/
//preenchendo imprimindo o vetor originário com números aleatórios - utilizando Random.
        System.out.println();
        System.out.println("\n**IMPRIMINDO TODAS AS POSIÇÕES DO VETOR ORIGINÁRIO**");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(100) + 1;
            System.out.println("Vetor[" + i + "] = " + vetor[i]);
        }
        System.out.println();

//verificando quais números sorteados no vetor original são múltimos de 3 e adcionando no ArrayList.
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 3 == 0) {
                multiplos3.add(vetor[i]);
                nenhum2 = false;
            }
        }
        System.out.println("\n**IMPRIMINDO TODAS AS POSIÇÕES DO VETOR MÚLTIPLOS DE 3**");
        for (int i = 0; i < multiplos3.size(); i++) {
            System.out.println("Vetor Multiplos de 3[" + i + "] = " + multiplos3.get(i));
        }
        if (nenhum2 == true) {
            System.out.println("Não existem múltiplos de 3 no vetor originário!");
        }
        System.out.println();
        System.out.println("\n**IMPRIMINDO SOMENTE AS POSIÇÕES ÍMPARES DO VETOR MúLTIPLOS DE 3**");
        for (int i = 0; i < multiplos3.size(); i++) {
            if (i % 2 != 0) {
                System.out.println("Vetor Multiplos de 3[" + i + "] = " + multiplos3.get(i));
                nenhum = false;
            }
        }
        if (nenhum == true) {
            System.out.println("Não existe nenhum elemento inserido em uma posição ímpar!");
        }
        System.out.println();

    }

}
