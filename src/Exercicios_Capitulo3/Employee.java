package Exercicios_Capitulo3;
// Exercício 3.13: Employee
public class Employee {
    // variáveis de instâncias
    private String name;
    private String lastName;
    private double monthlySalary;

    // construtor
    public Employee(String name, String lastName, double monthlySalary) {
        this.name = name;
        this.lastName = lastName;
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary)
    {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
    }

    public double getAnnualSalary()
    {
        return monthlySalary * 12;
    }

    public void giveRaise()
    {
        monthlySalary = monthlySalary * 1.10;
    }

}
