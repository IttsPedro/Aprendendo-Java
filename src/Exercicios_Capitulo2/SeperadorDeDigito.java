package Exercicios_Capitulo2;
import  java.util.Scanner;

public class SeperadorDeDigito {

public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um número de 5 dígitos: ");
    int numero = entrada.nextInt();

    int digito1 = numero / 10000;
    int digito2 = (numero / 1000) % 10;
    int digito3 = (numero / 100) % 10;
    int digito4 = (numero / 10) % 10;
    int digito5 = numero % 10;

    System.out.println(digito1 + "   " + digito2 + "   " + digito3 + "   " + digito4 + "   " + digito5);

    }
}

