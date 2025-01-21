package Exercicios_Capitulo3;
// Exercício 3.13: EmployeeTest

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee empregado1 = new Employee("Pedro ", "Rodrigues",3750);
        Employee empregado2 = new Employee("Anna ","Laranja", 1412);

        displaySalary(empregado1);
        displaySalary(empregado2);

        System.out.printf("%nSalários com aumentos aumento de 10 porcento ao mês");
        displaySalary(empregado1);
        displaySalary(empregado2);

    }

    public static void displaySalary (Employee empregado)
    {
        System.out.printf("%n O salário anual do funcionário é %s%s é: %.2f", empregado.getNome(),
                empregado.getSobrenome(), empregado.getSalario());

    }
}
