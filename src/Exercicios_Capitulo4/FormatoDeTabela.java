package Exercicios_Capitulo4;

public class FormatoDeTabela
{
    public static void main(String[] args)
    {
        int N = 1;

        System.out.printf("N     10*N    100*N    1000*N%n");

        while (N <= 5)
        {
            System.out.printf("%d      %d      %d      %d%n", N, N*10, N*100, N*1000);
            N++;
        }
    }
}
