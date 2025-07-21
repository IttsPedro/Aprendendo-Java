package Exercicios_Capitulo4;
import java.util.Scanner;

public class SquareOfAsterisks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int size;
        int row = 1;
        int col;

        System.out.print("Enter the size of Square (1-20): ");
        size = input.nextInt();
        
        while (row <= size)
        {
            col = 1;
            while (col <= size)
            {
                if (row == 1 || row == size)
                    System.out.printf("*");
                else if (col == 1 || col == size)
                {
                    System.out.printf("*");
                }
                else
                    System.out.printf(" ");

                col++;
            }
            System.out.println();
            row++;
        }
    }
}
