package br.com.sancho.entities;

import java.util.Scanner;

public class CriadorDeMatrizes {
    private Scanner scan;

    public CriadorDeMatrizes() {
        this.scan = new Scanner(System.in);
    }

    public Matriz criarMatriz(int t) {

        int [][] elementos = new int[t][t];

        System.out.println("Informe os elementos da matriz:");
        for (int linha = 0; linha < t; linha++) {
            for (int coluna = 0; coluna < t; coluna++) {
                System.out.printf("Elemento [%d][%d]: ", linha, coluna);
                elementos[linha][coluna] = scan.nextInt();
            }
            scan.nextLine();
        }

        return new Matriz(elementos);
    }

    public void fecharScanner() {
        if (scan != null) {
            scan.close();
        }
    }
}


