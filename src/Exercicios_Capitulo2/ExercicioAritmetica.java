package Exercicios_Capitulo2;
import java.util.Scanner;

public class ExercicioAritmetica
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int soma;
        int produto;
        int diferença;
        int quociente;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        soma = number1 + number2;
        produto = number1 * number2;
        diferença = number1 % number2;
        quociente = number1 / number2;

        System.out.printf("Sum is %d%n", soma);
        System.out.printf("Produto is %d%n", produto);
        System.out.printf("Diferença is %d%n",diferença);
        System.out.printf("Quociente is %d%n", quociente);

    }
}
