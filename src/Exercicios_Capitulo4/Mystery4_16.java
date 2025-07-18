package Exercicios_Capitulo4;

public class Mystery4_16
{
    public static void main(String[] args)
    {
//      criara um loop infinito de 1
        int x = 1;
        int total = 0;

        while (x <= 10)
        {
            int y = x * x;
            System.out.println(y);
            total += y;
        }
        System.out.printf("Total is %d%n", total);
    }
}
