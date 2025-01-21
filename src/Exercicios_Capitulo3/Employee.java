package Exercicios_Capitulo3;
// Exercício 3.13: Employee
public class Employee
{
    // variáveis de instâncias
    private String nome;
    private String sobrenome;
    private double salario;

    // construtor
    public Employee(String nome, String sobrenome, double salario)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salario > 0) {
            this.salario = salario;
        }
    }

    // método set e get
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }

    public void setSalario(double salario)
    {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public String getNome()
    {
        return nome;
    }

    public String getSobrenome()
    {
        return sobrenome;
    }

    public double getSalario()
    {
        return salario;
    }
}
