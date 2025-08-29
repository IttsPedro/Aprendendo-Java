package Exercicios_Capitulo5;
import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int y;
        int x;
        int smallers;

        System.out.print("How many numbers will you be comparing ?: ");
        x = input.nextInt();

        System.out.print("Enter first number: ");
        smallers = input.nextInt();

        for (int i = 2; i <= x; i++) {
            System.out.print("Enter other numbers to compare: ");
            y = input.nextInt();

            if (y < smallers)
                smallers = y;
        }

        System.out.printf("O menor número de todos é: %d%n",smallers);
    }
}
