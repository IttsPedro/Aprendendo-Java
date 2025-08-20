package Exercicios_Capitulo5;

public class Exercise5_3 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 20) {
            System.out.print(i);

            if (i % 5 == 0)
                System.out.println();
            else
                System.out.print('\t');

            ++i;
        }

        for(i = 1; i <= 20; i++) {
            System.out.print(i);

            if (i % 5 == 0)
                System.out.println();
            else
                System.out.print('\t');
        }
    }
}
