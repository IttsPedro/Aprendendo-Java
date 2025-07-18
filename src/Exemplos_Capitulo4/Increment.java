package Exemplos_Capitulo4;
// Figura 4.15: Increment.java
// Operadores de pré-incremento e de pós-incremento.

public class Increment
{
    public static void main(String[] args)
    {
        // demonstra o operador de pós-incremento
        int c = 5;
        System.out.printf("c before post increment: %d%n", c); // imprime 5
        System.out.printf("    post incrementing c: %d%n", c++); // imprime 5
        System.out.printf(" c after post increment: %d%n", c); // imprime 6

        System.out.println();

        // demonstra o operador de pré-incremento
        c = 5;
        System.out.printf(" c before pre increment: %d%n", c); // imprime 5
        System.out.printf("     pre incrementing c: %d%n", ++c); // imprime 6
        System.out.printf("  c after pre increment: %d%n", c); // imprime 6
    }
}// fim da classe


