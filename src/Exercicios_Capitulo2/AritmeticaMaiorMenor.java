package Exercicios_Capitulo2;
import java.util.Scanner;

public class AritmeticaMaiorMenor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int soma;
        int media;
        int produto;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        number3 = input.nextInt();

        soma = number1 + number2 + number3;
        produto = number1 * number2 * number3;
        media = soma / 3;

        System.out.printf("Soma is %d%n", soma);
        System.out.printf("Produto is %d%n", produto);
        System.out.printf("Média is %d%n", media);

        System.out.println("Comparação entre inteiros menor");

        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);

        if (number1 < number3)
            System.out.printf("%d < %d%n", number1, number3);

        if (number2 < number1)
            System.out.printf("%d < %d%n", number2, number1);

        if (number2 < number3)
            System.out.printf("%d < %d%n", number2, number3);

        if (number3 < number1)
            System.out.printf("%d < %d%n", number3, number1);

        if (number3 < number2)
            System.out.printf("%d < %d%n", number3,number2);

        if (number1 > number2)
            System.out.printf("%d < %d%n", number1, number2);

        if (number1 > number3)
            System.out.printf("%d < %d%n", number1, number3);

        if (number2 > number1)
            System.out.printf("%d < %d%n", number2, number1);

        if (number2 > number3)
            System.out.printf("%d < %d%n", number2, number3);

        if (number3 > number1)
            System.out.printf("%d < %d%n", number3, number1);

        if (number3 > number2)
            System.out.printf("%d < %d%n", number3,number2);
    }
}
