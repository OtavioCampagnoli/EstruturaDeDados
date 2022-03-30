package aula05.exercicioAula05;

public class RGM27702839OtavioHenriqueMoreiraCampagnoli {
        
    public static void main(String[] args) {

        Trabalhador trab[] = new Trabalhador [7];
        trab[0] = new Trabalhador("Larrissa", 1500f, 'F');
        trab[1] = new Trabalhador("Ana", 2000f, 'F');
        trab[2] = new Trabalhador("Antonio", 1500f, 'M');
        trab[3] = new Trabalhador("Jefferson", 6000f, 'M');
        trab[4] = new Trabalhador("Otavio", 8500f, 'M');
        trab[5] = new Trabalhador("Lucas", 45000, 'M');
        trab[6] = new Trabalhador("Julia", 45000, 'F');
            


        // Exibir lista não ordenada
        System.out.println("Vetor ainda não ordenado:");
        imprimirVetor(trab);
        System.out.println();

        // Ordenação salário descrescente - exercício 01
        quickSortSalario(trab, 0, trab.length - 1);
        System.out.println("Exercício 1 - Vetor ordenado por salário mais alto:");
        imprimirVetor(trab);
        System.out.println();

        // Ordenação alfabética crescente 
        quickSortNome(trab, 0, trab.length - 1);
        System.out.println("Exercício 2 - Vetor em ordem alfabética:");
        imprimirVetor(trab);
        System.out.println();
    }

    // métodos

    // impressão de dados
    public static void imprimirVetor(Trabalhador[] trab) {
        for (int i = 0; i < trab.length; i++) {
            System.out.println(trab[i].nome + " " + trab[i].salario);
        }
    }

    // salario descrescente quicksort - Exercicio01
    public static boolean quickSortSalario(Trabalhador vetor[], int inicio, int fim) {
        if (vetor == null)
            return false;
        if (inicio < fim) {
            int posicaoPivo = separarSalario(vetor, inicio, fim);
            quickSortSalario(vetor, inicio, posicaoPivo - 1);
            quickSortSalario(vetor, posicaoPivo + 1, fim);
        }
        return true;
    }

    public static int separarSalario(Trabalhador vetor[], int inicio, int fim) {
        Trabalhador pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i].salario >= pivo.salario)
                i++;
            else if (pivo.salario > vetor[i].salario)
                f--;
            else {
                Trabalhador troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }

    // Nome em ordem alfabética usando quick sort
    public static boolean quickSortNome(Trabalhador vetor[], int inicio, int fim) {
        if (vetor == null)
            return false;
        if (inicio < fim) {
            int posicaoPivo = separarNome(vetor, inicio, fim);
            quickSortNome(vetor, inicio, posicaoPivo - 1);
            quickSortNome(vetor, posicaoPivo + 1, fim);
        }
        return true;
    }

    public static int separarNome(Trabalhador vetor[], int inicio, int fim) {
        Trabalhador pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i].nome.compareToIgnoreCase(pivo.nome) <= 0)
                i++;
            else if (pivo.nome.compareToIgnoreCase(vetor[f].nome) < 0)
                f--;
            else {
                Trabalhador troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}

