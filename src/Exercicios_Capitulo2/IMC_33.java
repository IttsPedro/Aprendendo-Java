package Exercicios_Capitulo2;
import java.util.Scanner;

public class IMC_33
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double peso;
        double altura;
        double imc;

        System.out.print("Entre com o seu peso: ");
        peso = input.nextDouble();

        System.out.print("Entre com a sua altura: ");
        altura = input.nextDouble();

        imc = peso / (altura * altura);

        if (imc < 18.5 )
            System.out.printf("%f Underweight:", imc);

        if (imc > 18.5 )
            System.out.printf("%f Normal:", imc);

        if (imc >= 25 )
            System.out.printf("%f Overweight:", imc);

        if (imc > 31 )
            System.out.printf("%f Obesity:", imc);

    }
}