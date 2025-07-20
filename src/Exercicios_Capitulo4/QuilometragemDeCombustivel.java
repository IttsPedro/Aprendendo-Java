package Exercicios_Capitulo4;
import java.util.Scanner;

public class QuilometragemDeCombustivel
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int totalKilometers = 0;
        int totalLiters = 0;
        int liters = 0;
        double overallAverage;
        double tripConsumption;

        System.out.print("Enter kilometers driven (-1 to quit): ");
        int kilometers = input.nextInt();

        while (kilometers != -1)
        {
            System.out.print("Enter liters of fuel consumed: ");
            liters = input.nextInt();

            tripConsumption = (double) kilometers / liters;

            totalKilometers = totalKilometers + kilometers;
            totalLiters = totalLiters + liters;

            System.out.println("Consumption for this trip: %.2f km/liter%n"  + tripConsumption);
            System.out.println("Total kilometers: " + totalKilometers);
            System.out.println("Total liters: " + totalLiters);

            overallAverage = (double)  totalKilometers / totalLiters;
            System.out.printf("Overall average consumption: %.2f km/liter%n ", overallAverage);

            System.out.print("Enter kilometers driven (-1 to quit): ");
            kilometers = input.nextInt();
        }
        System.out.println("End of the program...");
    }
}
