package aula06.exerciciosAula06;
public class Exercicio3 {
    public static void main(String[] args) {
        String paisesA[] = { "Ucrânia", "Turquia", "Suíça", "México", "França", "Espanha", "Chile", "Brasil",
                "Argentina" };
        String paisesB[] = { "Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "França", "Inglaterra", "Turquia",
                "Uruguai" };
        String paisesC[] = { "Canadá", "Áustria", "Chile", "Itália", "Portugal", "Grécia",
                "Angola", "Moçambique", "Rússia" };

        // Busca Sequencial
        System.out.println("Brasil foi encontrado na posição: " + (buscaSequencial(paisesA, "Brasil") + 1));

        // Busca Binária Crescente
        System.out.println("França foi encontrado na posição: "
                + (buscaBinariaCrescente(paisesB, "França", 0, paisesB.length) + 1));

        // Busca Binária Decrescente
        System.out.println("Portugal foi encontrado na posição: "
                + (buscaBinariaDecrescente(paisesC, "Portugal", 0, paisesC.length) + 1));

    }

    public static int buscaSequencial(String[] array, String pesquisa) {
        int indexPos = -1;

        for (int i = 0; i < array.length; i++) {
            if (pesquisa.compareToIgnoreCase(array[i]) == 0)
                indexPos = i;
        }

        return indexPos;
    }

    public static int buscaBinariaCrescente(String[] array, String pesquisa, int inicio, int fim) {
        int indexPos = -1;
        int centro = (inicio + fim) / 2;

        if (inicio <= fim) {
            if (pesquisa.compareToIgnoreCase(array[centro]) == 0)
                indexPos = centro;
            else if (pesquisa.compareToIgnoreCase(array[centro]) > 0)
                indexPos = buscaBinariaCrescente(array, pesquisa, centro + 1, fim);
            else if (pesquisa.compareToIgnoreCase(array[centro]) < 0)
                indexPos = buscaBinariaCrescente(array, pesquisa, inicio, centro - 1);
        }

        return indexPos;
    }

    public static int buscaBinariaDecrescente(String[] array, String pesquisa, int inicio, int fim) {
        int indexPos = -1;
        int centro = (inicio + fim) / 2;

        if (inicio <= fim) {
            if (pesquisa.compareToIgnoreCase(array[centro]) == 0)
                indexPos = centro;
            else if (pesquisa.compareToIgnoreCase(array[centro]) < 0)
                indexPos = buscaBinariaCrescente(array, pesquisa, centro + 1, fim);
            else if (pesquisa.compareToIgnoreCase(array[centro]) > 0)
                indexPos = buscaBinariaCrescente(array, pesquisa, inicio, centro - 1);
        }

        return indexPos;
    }
}