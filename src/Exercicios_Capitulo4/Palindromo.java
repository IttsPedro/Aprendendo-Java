package Exercicios_Capitulo4;
import java.util.Scanner;

public class Palindromo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number = 0;
        int digit1, digit2, digit3, digit4, digit5;
        boolean isValid;

        isValid = false;

        while (!isValid)
        {
            System.out.print("Enter a five digit integer: ");
            number = input.nextInt();

            if (number >= 10000 && number <= 99999)
            {
                isValid = true;
            }
            else
            {
                System.out.println("Incorrect, please enter exactly five digits: ");
            }
        }
        digit5 = number % 10;
        digit4 = (number / 10) % 10;
        digit3 = (number / 100) % 10;
        digit2 = (number / 1000) % 10;
        digit1 = number / 10000;

        if (digit1 == digit5 && digit2 == digit4)
        {
            System.out.println(number + " is a Palindrome ");
        }
        else
        {
            System.out.print(number + " isn't a Palindrome ");
        }
    }
}
