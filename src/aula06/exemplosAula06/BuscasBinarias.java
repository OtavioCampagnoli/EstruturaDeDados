package aula06.exemplosAula06;
import javax.swing.JOptionPane;

public class BuscasBinarias {

    public static void main(String[] args) {
        new BuscasBinarias(); // para chamar o m�todo construtor a seguir
        // desta forma os m�todos n�o precisam ser static
    }

    public BuscasBinarias() {  //m�todo construtor principal
        String paisesB[] = {"Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "Fran�a",
            "Inglaterra", "Turquia", "Uruguai", "Venezuela"};
        String x = JOptionPane.showInputDialog("Digite o pa�s que deseja encontrar");
        int indice = buscaBinariaEmListaCrescente(paisesB, x);
        JOptionPane.showMessageDialog(null, x + " encontrado na posi��o " + indice);

        //... completar aqui a chamada a buscaBinariaEmListaDecrescente com o vetor que est� ordenado de maior a menor
        //...
    }

    public int buscaBinariaEmListaCrescente(String paises[], String x) {
        int inicio, fim, centro; //melhor chamar de centro, em lugar de pivo
        inicio = 0;
        fim = paises.length - 1;  // a posi��o final � o tamanho do vetor de pa�ses - 1
        while (inicio <= fim) {
            centro = (inicio + fim) / 2;
            if (x.compareTo(paises[centro]) ==0) { //encontramos o pa�s procurado
                return centro;
            } else if (x.compareTo(paises[centro]) > 0) {  //procurar no trecho superior
                inicio = centro + 1;
            } else if (x.compareTo(paises[centro]) < 0) {  //procurar no trecho inferior
                fim = centro - 1;
            }
        }
        return -1;  //n�o foi encontrado o pa�s
    }

    public int buscaBinariaEmListaDecrescente(String paises[], String x) {
        //... completar a l�gica, parecida com a anterior, mas o operador do if mudar�
        //...
        return -1;
    }

}
