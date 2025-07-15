package Exercicios_Capitulo3;
// Exercício 3.13: EmployeeTest

public class EmployeeTest
{
    public static void main(String[] args)
    {

        Employee empregado1 = new Employee("Pedro ", "Rodrigues",3750.00);
        Employee empregado2 = new Employee("Anna ","Laranja", 1412.00);

        System.out.println("SALÁRIO SEM O AUMENTO: ");
        displayEmployee(empregado1);
        displayEmployee(empregado2);

        empregado1.setMonthlySalary(empregado1.getMonthlySalary() * 1.10);
        empregado2.setMonthlySalary(empregado2.getMonthlySalary() * 1.10);

        System.out.println("%nAUMENTO DE 10%:");
        displayEmployee(empregado1);
        displayEmployee(empregado2);
    }

    public static void displayEmployee(Employee employeeToDisplay)
    {
        System.out.printf("%s Annual Salary: $%.2f %n", employeeToDisplay.getName(),employeeToDisplay.getMonthlySalary() * 12);
    }
}
