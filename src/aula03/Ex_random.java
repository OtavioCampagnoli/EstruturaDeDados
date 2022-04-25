package aula03;

import java.util.Random;

public class Ex_random {
    public static void main(String[] args) {
        // Geração aleatória de vetor

        float[] vet = new float[10]; // declarando e instanciando um vetor do tipo float com tamanho 10;
        for (int i = 0; i < vet.length; i++) { // percorrendo todos os indicies do vetor com o for
            // para cada verificacao usa o metodo geraFloat();
            vet[i] = geraFloat();
        }

        System.out.println("\nVetor de 10 elementos gerados aleatoriamente");
        System.out.println("com valores entre 0,0 e 9,999: \n");
        visualizaVetor(vet); // Usando método concreto para mostrar o vetor

    }
    // o metodo gera um float aleatório entre 0,0 e 9,999 que é armazenado na variavel n e retorna (n * o tamanho do vetor que foi declarado)
    // nesse caso o vetor possue [10] indicies
    public static float geraFloat() {
        Random rnd = new Random();
        float n = rnd.nextFloat();
        return (n * 10);

    }

    public static void visualizaVetor(float vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + "  ---   ");
        }
        System.out.println();
    }
}
