package aula08.pilha;

public class testePilhaDin {
    public static void main(String[] args) {

        int cont = 0;

        try {
            Pilha P = new Pilha();
            int i = 9999999;
            while (true) {
                P.push(i++);
                System.out.println(P.top());
                cont++;

            }

        } catch (OutOfMemoryError e) {
            System.out.println("Com" + cont + "registro deu o erro" + e.toString());
        }
    }
}
