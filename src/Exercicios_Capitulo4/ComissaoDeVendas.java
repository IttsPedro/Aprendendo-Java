package Exercicios_Capitulo4;
import java.util.Scanner;

public class ComissaoDeVendas
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double item1Price = 239.99;
        double item2Price = 129.75;
        double item3Price = 99.95;
        double item4Price = 350.89;
        double totalSales = 0;
        int itemSold;

        System.out.print("Enter number item price (-1 to quit)");
        itemSold = input.nextInt();

        while (itemSold != -1 )
        {
            if (itemSold == 1)
                totalSales = totalSales + item1Price;
            else if (itemSold == 2)
                totalSales = totalSales + item2Price;
            else if (itemSold == 3)
                totalSales = totalSales + item3Price;
            else if (itemSold == 4)
                totalSales = totalSales + item4Price;
            else
                System.out.print("Invalid item number!");

            System.out.println("Enter number item price (-1 to quit)");
            itemSold = input.nextInt();
        }
        double baseSalary = 200;
        double rateCommission = 0.09;
        double commission = baseSalary * rateCommission;
        double totalSalary = baseSalary + commission;

        System.out.printf("Total sales: R$ %.2f%n", totalSales);
        System.out.printf("Base salary: R$ %.2f%n", baseSalary);
        System.out.printf("Commission (9%%): R$ %.2f%n", commission);
        System.out.printf("Total earnings: R$ %.2f%n", totalSalary);
    }
}
