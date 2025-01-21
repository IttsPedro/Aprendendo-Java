package Exercicios_Capitulo2;
import java.util.Scanner;

public class ComparandoInteiro
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        if (number1 > number2)
            System.out.printf("%d is Largers%n", number1);

        if (number2 > number1)
            System.out.printf("%d is Largers%n", number2);

        if (number1 == number2)
            System.out.printf("Theses numbers are equal");

    }
}

