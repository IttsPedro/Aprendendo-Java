package Exercicios_Capitulo4;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number bigger than 0: ");
        int number = input.nextInt();

        while (number < 0)
        {
            System.out.print("Enter a non-negative number: ");
            number = input.nextInt();
        }

        long factorial = 1;
        int counter = 1;

        while (counter <= number)
        {
            factorial = factorial * counter;
            counter++;
        }
        System.out.println(number + "! = " + factorial);
    }
}
