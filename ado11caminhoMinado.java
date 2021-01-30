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
public class ado11caminhoMinado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanho, bombas, posicao, contador = 0, pontos = 0;
        boolean errou = false;

        System.out.println("**CAMINHO MINADO**");
        System.out.println();

        do {
            System.out.print("Informe o tamanho do caminho: ");
            tamanho = entrada.nextInt();
        } while (tamanho <= 1);

        System.out.println();

        do {
            System.out.print("Informe a quantidade de bombas: ");
            bombas = entrada.nextInt();
        } while (bombas <= 0 || bombas >= tamanho);

        int caminho[] = new int[tamanho];

        for (int i = 0; i < caminho.length; i++) {
            caminho[i] = 0;
        }
        
        do {
            posicao = (int) (Math.random() * (tamanho));
            if (caminho[posicao] == 0) {
                caminho[posicao] = -1;
                contador = contador + 1;
            }
        } while (contador < bombas);

        //imprimeCaminho(caminho);

        //LAÇO PRINCIPAL:
        do {
            for (int i = 0; i < caminho.length; i++) {
                if (caminho[i] == 0 || caminho[i] == -1) {
                    System.out.print(" _ ");
                } else {
                    System.out.print(" x ");
                }
            }
            System.out.println();
            
            for (int i = 0; i < caminho.length; i++) {
                System.out.print("[" + i + "]");
            }
            System.out.println();
            do {
                System.out.print("\nInforme uma posição:");
                posicao = entrada.nextInt();
            } while (caminho[posicao] == 1);
           
            
            if (caminho[posicao] == -1) {
                errou = true;
            } else {
                caminho[posicao] = 1;
                pontos = pontos + 1;
                
                if (posicao == 0) {
                    if (caminho[posicao + 1] == -1) {
                        System.out.println("CUIDADO: bomba próxima!");
                        System.out.println();
                    }
                } else if (posicao == (tamanho - 1)) {
                    if (caminho[tamanho - 2] == -1) {
                        System.out.println("CUIDADO: bomba próxima!");
                        System.out.println();
                    }
                } else if (caminho[posicao - 1] == -1 || caminho[posicao + 1] == -1) {
                    System.out.println("CUIDADO: bomba próxima!");
                    System.out.println();
                }
            }
        } while (!errou && pontos < (tamanho - bombas));

//PERDEU
        if (errou) {
            for (int i = 0; i < caminho.length; i++) {
                if (caminho[i] == 0) {
                    System.out.print(" _ ");
                } else if (caminho[i] == 1) {
                    System.out.print(" x ");
                } else {
                    System.out.print(" b ");
                }
            }
            System.out.println();
            
            for (int i = 0; i < caminho.length; i++) {
                System.out.print("[" + i + "]");
            }
            System.out.println();
            System.out.println("\nGAME OVER!");
            System.out.println("Pontuação: " + pontos + "/" + (tamanho - bombas));

//GANHOU
        } else {
            for (int i = 0; i < caminho.length; i++) {
                if (caminho[i] == 1) {
                    System.out.print(" x ");
                } else if (caminho[i] == -1) {
                    System.out.print(" b ");
                }
            }
            System.out.println();
            
            for (int i = 0; i < caminho.length; i++) {
                System.out.print("[" + i + "]");
            }
            System.out.println();
            System.out.println("\nParabéns, você? ganhou o jogo!");
            System.out.println("Pontuação: " + pontos + "/" + (tamanho - bombas));
        }
    }

    static void imprimeCaminho(int[] vetor) {
        System.out.println("\n**IMPRIMINDO NO MODELO FOR-EACH**");
        System.out.print("Valores armazenados no vetor: ");
        for (int item : vetor) {
            System.out.print(item + " ");
        }
        System.out.println();

    }
    
}
