package Exercicios_Capitulo4;
import java.util.Scanner;

public class FindTwoNumbersLargest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int largest;
        int secondLargest;
        int count = 1;
        int number;


        System.out.print("Enter first number: ");
        number = input.nextInt();
        largest = number;

        System.out.print("Enter second number: ");
        number = input.nextInt();

         if (number > largest)
         {
             secondLargest = largest;
             largest = number;
         }
          else
          {
              secondLargest = number;
          }
           count = 3;

          while (count <= 10)
          {
              System.out.printf("Digite o " + count + "° número: ");
              number = input.nextInt();

              if (number > largest)
              {
                  secondLargest = largest;
                  largest = number;
              }
              else if (number > secondLargest)
              {
                  secondLargest = number;
              }

              count++;
          }
        System.out.println("O maior número é: " + largest);
        System.out.println("O segundo maior número é: " + secondLargest);
    }
}
