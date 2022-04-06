package aula06.exerciciosAula06;

/**
 * exercicio01
 */

public class Exercicio1 {
    public static void main(String[] args) {
        double numeros[] = { 0, 1, 2, 3 };
        System.out.println("Vetor original:");
        imprimirVetor(numeros);
        System.out.println("");

        System.out.println("Vetor embaralhado:");
        aleatorizar(numeros);
    }

    public static void aleatorizar(double[] numeros) {
        int n = numeros.length;

        int i = 0;
        while (n > 1) {
            int posAleat = (int) (Math.random() * n);
            double temp = numeros[i];
            numeros[i] = numeros[posAleat];
            numeros[posAleat] = temp;
            i++;
            n--;
        }

        imprimirVetor(numeros);
    }

    private static void imprimirVetor(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
