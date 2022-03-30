package aula03;

public class Buscas {

	public static void main(String args[]) {
		new Buscas();
	}

	public Buscas() {
		double a[] = { 4.3, 6.1, 0.1, 1.9, 2.4, 7.2, 5.5 }; // vetor desordenado ou nÃ£o
		int pos = buscaSequencial(a, 2.4);
		if (pos != -1) {
			System.out.println("O valor 2.4 foi encontrado na posiÃ§Ã£o " + pos);
		} else {
			System.out.println("O valor 2.4 nÃ£o foi encontrado.");
		}

		pos = buscaSequencial(a, 2.4, 0, 3); // vetor desordenado ou nÃ£o
		if (pos != -1) {
			System.out.println("O valor 2.4 foi encontrado na posiÃ§Ã£o " + pos);
		} else {
			System.out.println("O valor 2.4 nÃ£o foi encontrado nesse trecho do vetor.");
		}

		double b[] = { 4.3, 6.1, 7.1, 8.9, 9.4, 9.6, 10.5 }; // vetor ordenado
		pos = buscaBinaria(b, 9.4);
		if (pos != -1) {
			System.out.println("O valor 9.4 foi encontrado na posiÃ§Ã£o " + pos);
		} else {
			System.out.println("O valor 9.4 nÃ£o foi encontrado no vetor.");
		}

		double c[] = { 4.3, 6.1, 0.1, 1.9, 2.4, 7.2, 5.5, 0, 0, 0 }; // vetor desordenado ou nÃ£o
		System.out.println("Vetor original, com trÃªs posiÃ§Ãµes finais vazias: ");
		visualizaVetor(c, c.length);
		System.out.println("Vetor deslocado para direita, das posiÃ§Ãµes de 3 a 6: ");
		deslocaDireita(c, 3, 6);
		visualizaVetor(c, c.length);
		System.out.println("Vetor deslocado novamente para esquerda, das posiÃ§Ãµes de 4 a 7: : ");
		deslocaEsquerda(c, 4, 7);
		visualizaVetor(c, c.length);
	}

	int buscaSequencial(double vet[], double buscado) {
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == buscado) {
				return i; // encontramos o valor buscado
			}
		}
		return -1; // o item nÃ£o se encontra no vetor
	}

	int buscaSequencial(double vet[], double buscado, int de, int ate) {
		for (int i = de; i <= ate; i++) {
			if (vet[i] == buscado) {
				return i; // encontramos o valor buscado
			}
		}
		return -1; // o item nÃ£o se encontra nesse trecho do vetor
	}

	int buscaBinaria(double vet[], double buscado) {
		int inf = 0; // limite inferior
		int sup = vet.length - 1; // limite superior
		int meio;
		while (inf <= sup) {
			meio = (inf + sup) / 2;
			if (buscado == vet[meio]) {
				return meio;
			}
			if (buscado < vet[meio]) {
				sup = meio - 1;
			} else {
				inf = meio + 1;
			}
		}
		return -1; // o elemento nÃ£o foi encontrado, ou retornar -(inf + 1)
	}

	// ObservaÃ§Ã£o: para os vetores envolvidos com estes algoritmos de deslocamento
	// nÃ£o utilize vet.length e sim uma variÃ¡vel com a quantidade real de itens
	void deslocaDireita(double vet[], int de, int ate) {
		if (de > ate) {
			return;
		}
		if (de < 0) {
			de = 0;
		}
		if (ate > vet.length - 2) {
			ate = vet.length - 2;
		}
		// abre um espaÃ§o e ocupa uma posiÃ§Ã£o no final
		for (int i = ate; i >= de; i--) {
			vet[i + 1] = vet[i];
		}
		vet[de] = 0; // sÃ³ para marcar o item que ficou "vazio"
	}

	void deslocaEsquerda(double vet[], int de, int ate) {
		if (de > ate) {
			return;
		}
		if (de <= 0) {
			de = 1;
		}
		if (ate > vet.length - 1) {
			ate = vet.length - 1;
		}
		// elimina o item na posiÃ§Ã£o (d-1) e desloca os restantes
		for (int i = (de - 1); i < ate; i++) {
			vet[i] = vet[i + 1];
		}
		vet[ate] = 0; // sÃ³ para marcar o item final
	}

	public void visualizaVetor(double vetor[], int N) {
		for (int i = 0; i < N; i++) {
			System.out.print(vetor[i] + "  ||  ");
		}
		System.out.println();
	}

}
