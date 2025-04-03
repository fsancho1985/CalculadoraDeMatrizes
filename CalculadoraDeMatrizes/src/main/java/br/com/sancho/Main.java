package br.com.sancho;


import br.com.sancho.entities.CriadorDeMatrizes;
import br.com.sancho.entities.Matriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Qual será o tamanho da matriz a ser preenchida?");
//        int tamanho = scan.nextInt();
//
//        int[][] elementos = new int[tamanho][tamanho];
//
//        System.out.println("Informe os elementos da matriz:");
//        for (int linha = 0; linha < tamanho; linha++) {
//            for (int coluna = 0; coluna < tamanho; coluna++) {
//                elementos[linha][coluna] = scan.nextInt();
//            }
//            scan.nextLine();
//        }
//
//        Matriz matriz = new Matriz(elementos);
//        System.out.println();
//        matriz.imprimir();
//        matriz.matrizTransposta();
//        matriz.matrizOposta();

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o tamanho das matrizes a serem criadas: ");
        int t = scan.nextInt();
        scan.nextLine();

        CriadorDeMatrizes criador = new CriadorDeMatrizes();

        System.out.println("Criando Matriz A: ");
        Matriz matrizA = criador.criarMatriz(t);

        System.out.println("Criando Matriz B: ");
        Matriz matrizB = criador.criarMatriz(t);

        matrizA.imprimir();
        matrizA.matrizOposta();
        matrizA.matrizTransposta();

        matrizB.imprimir();
        matrizB.matrizOposta();
        matrizB.matrizTransposta();

        somaMatrizes(matrizA.getTamanho(),matrizA, matrizB ).imprimir();
        subtracaoMatrizes(matrizA.getTamanho(), matrizA, matrizB).imprimir();
        multiplicacaoMatrizes(matrizA.getTamanho(), matrizA, matrizB).imprimir();

        criador.fecharScanner();
    }

    public static Matriz somaMatrizes(int tamanhoMatrizes, Matriz matrizA, Matriz matrizB) {

        int [][] elementos = new int[tamanhoMatrizes][tamanhoMatrizes];

        for (int i = 0; i < tamanhoMatrizes; i++) {
            for (int j = 0; j < tamanhoMatrizes; j++) {
                elementos[i][j] = (matrizA.getValor(i,j) + matrizB.getValor(i,j));
            }
        }

        return new Matriz(elementos);

    }

    public static Matriz subtracaoMatrizes(int tamanhoMatrizes, Matriz matrizA, Matriz matrizB) {

        int [][] elementos = new int[tamanhoMatrizes][tamanhoMatrizes];

        for (int i = 0; i < tamanhoMatrizes; i++) {
            for (int j = 0; j < tamanhoMatrizes; j++) {
                elementos[i][j] = (matrizA.getValor(i,j) - matrizB.getValor(i,j));
            }
        }

        return new Matriz(elementos);

    }

    public static Matriz multiplicacaoMatrizes(int tamanhoMatrizes, Matriz matrizA, Matriz matrizB) {

        int [][] elementos = new int[tamanhoMatrizes][tamanhoMatrizes];

        for (int i = 0; i < tamanhoMatrizes; i++) {
            for (int j = 0; j < tamanhoMatrizes; j++) {
                elementos[i][j] = 0;

                for (int k = 0; k < tamanhoMatrizes; k++) {
                    elementos[i][j] += matrizA.getValor(i,k) * matrizB.getValor(k,j);
                }
            }
        }

        return new Matriz(elementos);

    }

}