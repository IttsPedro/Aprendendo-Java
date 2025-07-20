package Exercicios_Capitulo4;
import java.util.Scanner;

public class LimiteDeCredito
{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);

        int accountNumber;
        int initialBalance;
        int totalCharges;
        int totalCredit;
        int creditLimit;

        System.out.print("Enter account number (-1 to quit): ");
        accountNumber = input.nextInt();

        while (accountNumber != -1)
        {
            System.out.print("Enter initial balance: ");
            initialBalance = input.nextInt();

            System.out.print("Enter total charges: ");
            totalCharges = input.nextInt();

            System.out.print("Enter total credits: ");
            totalCredit = input.nextInt();

            System.out.print("Enter credit limits: ");
            creditLimit = input.nextInt();

            int newBalance = initialBalance + totalCharges - totalCredit;

            System.out.printf("Account is: %d%n", accountNumber);
            System.out.printf("New balance is: %d%n", newBalance);

            if (newBalance > creditLimit)
                System.out.println("Credit limit exceeded ");

            System.out.print("Enter account number (-1 to quit): ");
            accountNumber = input.nextInt();

        }
    }
}
