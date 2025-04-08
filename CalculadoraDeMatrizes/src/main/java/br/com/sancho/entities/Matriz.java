package br.com.sancho.entities;

public class Matriz {
    private double[][] matriz;
    private int tamanho;

    public Matriz(int tamanho) {
        this.tamanho = tamanho;
        this.matriz = new double[tamanho][tamanho];
    }

    public Matriz(double[][] elementos) {
        this.tamanho = elementos.length;
        this.matriz = elementos;
    }

    public void setValor(int linha, int coluna, double valor) {
        matriz[linha][coluna] = valor;
    }

    public double getValor(int linha, int coluna) {
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

    public double calcularDeterminante() {
        if (tamanho == 1) {
            return matriz[0][0];
        }

        if (tamanho == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }

        int determinante = 0;

        for (int j = 0; j < tamanho; j++) {
            double[][] submatriz = new double[tamanho - 1][tamanho - 1];

            for (int i = 1; i < tamanho; i++) {
                int colSub = 0;
                for (int k = 0; k < tamanho; k++) {
                    if (k != j) {
                        submatriz[i - 1][colSub] = matriz[i][k];
                        colSub++;
                    }
                }
            }

            Matriz subMatriz = new Matriz(submatriz);

            int sinal = (j % 2 == 0) ? 1 : -1;
            determinante += sinal * matriz[0][j] * subMatriz.calcularDeterminante();
        }

        return determinante;
    }

}
