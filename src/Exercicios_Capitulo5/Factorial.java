package Exercicios_Capitulo5;

public class Factorial {
    public static void main(String[] args) {

        long n = 1;

        System.out.printf("N     Fatorial%n");
        System.out.printf("----  -----------------%n");

        for (long factorial = 1; factorial <= 20; factorial++) {
            n = n * factorial;

            System.out.printf("%2d   %-20d%n", factorial, n);
        }
    }
}
