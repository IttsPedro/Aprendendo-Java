package Exemplos_Capitulo5;
// Figura 5.1: While.java
// Repetição controlada por contador com a instrução de repetição while

public class WhileCounter
{
    public static void main(String[] args)
    {
        int counter = 1; // declara e inicializa a variável de controle

        while (counter <= 10)
        {
            System.out.printf("%d ", counter); // condição de continuação de loop
            ++counter; // variável de controle de incremento
        }

        System.out.println();
    }
}
