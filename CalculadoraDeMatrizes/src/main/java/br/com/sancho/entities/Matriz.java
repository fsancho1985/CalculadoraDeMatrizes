package br.com.sancho.entities;

public class Matriz {
    private int[][] matriz;
    private int tamanho;

    public Matriz(int tamanho) {
        this.tamanho = tamanho;
        this.matriz = new int[tamanho][tamanho];
    }

    public Matriz(int[][] elementos) {
        this.tamanho = elementos.length;
        this.matriz = elementos;
    }

    public void setValor(int linha, int coluna, int valor) {
        matriz[linha][coluna] = valor;
    }

    public int getValor(int linha, int coluna) {
        return matriz[linha][coluna];
    }

    public int getTamanho() { return this.tamanho;}

    public void imprimir() {
        System.out.println("Esta é a matriz que você informou");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public void matrizTransposta() {
        System.out.println("Matriz Tranposta");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public void matrizOposta() {
        System.out.println("Matriz Oposta");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j]*(-1) + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }



}
