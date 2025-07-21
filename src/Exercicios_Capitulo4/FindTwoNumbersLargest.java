package Exercicios_Capitulo4;
import java.util.Scanner;

public class FindTwoNumbersLargest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int largest;
        int secondLargest;
        int counter = 1;
        int number;


        System.out.print("Enter first number: ");
        number = input.nextInt();
        largest = number;
        counter++;

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
           counter++;

          while (counter <= 10)
          {
              System.out.printf("Digite o " + counter + "° número: ");
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

              counter++;
          }
        System.out.println("O maior número é: " + largest);
        System.out.println("O segundo maior número é: " + secondLargest);
    }
}
