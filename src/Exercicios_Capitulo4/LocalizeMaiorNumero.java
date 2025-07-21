package Exercicios_Capitulo4;
import java.util.Scanner;

public class LocalizeMaiorNumero
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest;

        System.out.print("Enter first number: ");
        largest = input.nextInt();

        while (counter < 10)
        {
            counter++;
            System.out.print("Enter first number: ");
            number = input.nextInt();

            if (number > largest)
                largest = number;
        }
        System.out.printf("Largest number is: %d%n",largest);
    }
}
