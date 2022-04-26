package aula03;

import java.util.ArrayList;
import java.util.Random;

public class Ex_FisherYates {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList<>();
        lista.add(1.2f); lista.add(4.3f); lista.add(6.1f); lista.add(-7.7f);
        lista.add(0.4f); lista.add(-8.8f); lista.add(9.0f); lista .add(3.3f);
        System.out.println("\nLista original: ");
        visualizarArrayList(lista);
        aleatorizar(lista);
        System.out.println("\nLista anterior aleatorizada com o algoritmo de Fisher-Yates: ");
        visualizarArrayList(lista);

    }

    public static void aleatorizar(ArrayList lista) {
        ArrayList listaTemp = new ArrayList<>();
        Random rnd = new Random();
        while(lista.size() > 1){
            // Selecionamos aleatoriamente uma posicao da lista inicial:
            int postAleat = rnd.nextInt(lista.size());
            // Adicionamos o elemento sorteado no final da lista auxiliar:
            listaTemp.add(lista.get(postAleat));
            //eliminamos o elemento da lista original:
            lista.remove(postAleat);
        }
        //adicionamos o único restante no final da lista adicional:
        listaTemp.add(lista.get(0));
        lista.clear(); // limpamos a lista original
        //por ultimo, passamos todos os elementos da lista adicional para a lista original
        for (int i = 0; i < listaTemp.size(); i++) {
            lista.add(listaTemp.get(i));

        }

    }

    public static void visualizarArrayList(ArrayList lista) {

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i)+ "  | |  ");

        }
        System.out.println();
    }



}
