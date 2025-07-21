package Exercicios_Capitulo4;
import java.util.Scanner;

public class CalculadorSalario
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double hourWorked;
        double hourlyWage;
        double grossPay;
        double overtimeHours;
        double regularPay;
        double overtimePay;
        int employeeCount = 1;

        while (employeeCount <= 3) {

            System.out.print("Enter hours worked: ");
            hourWorked = input.nextDouble();

            System.out.print("Enter hourly wage: ");
            hourlyWage = input.nextDouble();

            if (hourWorked <= 40)
                grossPay = hourWorked * hourlyWage;

            else
            {
                regularPay = 40 * hourlyWage;
                overtimeHours = hourWorked - 40;
                overtimePay = overtimeHours * (hourlyWage * 1.5);
                grossPay = regularPay + overtimePay;

            }

            System.out.printf("Employee %d gross pay: %.2f%n", employeeCount, grossPay);
            employeeCount++;
        }
    }
}
