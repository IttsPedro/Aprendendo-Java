package Exemplos_Capitulo5;

public class Sum
{
    public static void main(String[] args)
    {
        int total = 0;

        // total de inteiros pares de 2 a 20
        for (int number = 2; number <= 20; number += 2)
            total += number;

        System.out.printf("Sum is %d%n", total);
    }
} // fim da classe
