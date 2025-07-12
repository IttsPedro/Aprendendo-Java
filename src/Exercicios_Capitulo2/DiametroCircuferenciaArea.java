package Exercicios_Capitulo2;
import  java.util.Scanner;

public class DiametroCircuferenciaArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        int raio = input.nextInt();

        System.out.printf("Diâmetro %d%n ", 2 * raio);
        System.out.printf("Circunferência %d%n ", 2 * 3,14159 * raio);
        System.out.printf("Área %d%n ", 3,14159 * raio * raio);
    }
}
