package Exercicios_Capitulo5;

public class InterestModificado {
    public static void main(String[] args) {
        double amount;
        double rate = 1;
        double principal = 1000.0;
        int year;

        for (rate = 0.05; rate <= 0.10; rate += 0.01) {
            System.out.println();
            System.out.printf("Taxa de juros: %.2f%%%n", rate * 100);
            System.out.printf("%s%20s %n", "Year", "Amount on deposit");

            for (year = 1; year <= 10; year++) {

                amount = principal * Math.pow(1.0 + rate, year);

                System.out.printf("%4d%,20.2f%n", year, amount);
            }
        }
    }
}
