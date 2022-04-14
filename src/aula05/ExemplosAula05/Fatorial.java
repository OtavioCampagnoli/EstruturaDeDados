package aula05.ExemplosAula05;

public class Fatorial {

    public static void main(String[] args) {
        System.out.println("Fatorial: " + fatorial(5));
        System.out.println("Fatorial: " + fatorial(1));
        System.out.println("Fatorial: " + fatorial(0));
    }

    public static long fatorial(long n) {
        long fat = 1;

        if (n != 1 && n != 0) {
            fat = n * fatorial(n - 1);
        }

        return fat;
    }
}
