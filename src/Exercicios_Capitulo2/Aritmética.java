package Exercicios_Capitulo2;
import java.util.Scanner;

public class Aritmética
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;
        int plus;
        int difference;
        int divide;


        System.out.print("Enter fist integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;
        plus = number1 * number2;
        difference = number1 % number2;
        divide = number1 / number2;

        System.out.printf("Sum is %d%n ", sum);
        System.out.printf("Plus is %d%n ", plus);
        System.out.printf("Difference is %d%n ", difference);
        System.out.printf("Divide is %d%n ", divide);
    }
}

