package aula03;

/**
 * Ex_random.java
 * @author LedÃ³n
 * @version 1.00 2017/2/16
 */

import java.util.*;

public class Ex_random {

	public static void main(String args[]) {
		new Ex_random();
	}

	public Ex_random() {
		// GeraÃ§Ã£o aleatÃ³ria dos itens do vetor:
		float vet[] = new float[10];
		for (int i = 0; i < vet.length; i++) {
			vet[i] = geraFloat();
		}
		System.out.println("\nVetor de 10 elementos gerados aleatoriamente");
		System.out.println("com valores entre 0 e 9,999: \n");
		visualizaVetor(vet);
		System.out.println("\n");

		// Demonstramos o algoritmo de Fisher-Yates para aleatorizar uma lista (com
		// ArrayList):
		ArrayList lista = new ArrayList();
		lista.add(1.2f);
		lista.add(4.3f);
		lista.add(6.1f);
		lista.add(-7.7f);
		lista.add(0.4f);
		lista.add(-8.8f);
		lista.add(9.0f);
		lista.add(3.3f);
		System.out.println("\nLista original:");
		visualizaArrayList(lista);
		aleatorizar(lista);
		System.out.println("\nLista anterior aleatorizada com o algoritmo de Fisher-Yates:");
		visualizaArrayList(lista);
		System.out.println("\n");

	}

	public float geraFloat() {
		// Oracle, nextFloat(): "Retorna o prÃ³ximo valor real pseudo-aleatÃ³rio
		// uniformemente
		// distribuÃ­do entre 0,0 e 1,0 a partir da sequÃªncia deste gerador de nÃºmeros
		// aleatÃ³rios."
		Random rnd = new Random();
		float numero = rnd.nextFloat();
		return (numero * 10);
	}

	public void visualizaVetor(float vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "  ||  ");
		}
		System.out.println();
	}

	public void visualizaArrayList(ArrayList lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + "  ||  ");
		}
		System.out.println();
	}

	public void aleatorizar(ArrayList lista) { // parÃ¢metro por referÃªncia
		// Algoritmo de Fisher-Yates, implementado em Java com ArrayList
		ArrayList listaTemp = new ArrayList(); // criamos uma lista auxiliar adicional
		Random rnd = new Random();
		while (lista.size() > 1) {
			// selecionamos aleatoriamente uma posiÃ§Ã£o da lista inicial:
			int posAleat = rnd.nextInt(lista.size());
			// adicionamos o elemento sorteado no final da lista auxiliar:
			listaTemp.add(lista.get(posAleat));
			// eliminamos o elemento da lista original:
			lista.remove(posAleat);
		}
		// adicionamos o Ãºnico restante no final da lista adicional:
		listaTemp.add(lista.get(0));
		lista.clear(); // limpamos a lista original
		// por Ãºltimo, passamos todos os elementos da lista adicional para a lista
		// original
		for (int i = 0; i < listaTemp.size(); i++) {
			lista.add(listaTemp.get(i));
		}
	}

}