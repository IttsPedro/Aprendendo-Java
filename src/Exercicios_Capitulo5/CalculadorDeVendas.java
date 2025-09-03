package Exercicios_Capitulo5;

import java.util.Scanner;

public class CalculadorDeVendas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalDeVendas = 0.0;

        System.out.println("Sistema de vendas - Loja Online");
        System.out.println("-------------------------------");
        System.out.println("Produto 1: R$2.98");
        System.out.println("Produto 2: R$4.50");
        System.out.println("Produto 3: R$9.98");
        System.out.println("Produto 4: R$5.49");
        System.out.println("Produto 5: R$6.87");
        System.out.println("Digite 0 para sair");

        while (true){
            System.out.print("Número do produto: ");
            int produto = input.nextInt();

            if (produto == 0)
                break;

            if (produto < 1 || produto > 5){
                System.out.println("Produto Inválido!");
                continue;
            }

            System.out.println("Quantidade: ");
            int quantidade = input.nextInt();

            if (quantidade < 0){
                System.out.println("Quantidade deve ser maior que zero");
                continue;
            }
            double preco;
            switch (produto){
                case 1: preco = 2.98; break;
                case 2: preco = 4.50; break;
                case 3: preco = 9.98; break;
                case 4: preco = 4.49; break;
                case 5: preco = 6.87; break;
                default: preco = 0.0;
            }

            double subtotal = preco * quantidade;
            totalDeVendas += subtotal;

            System.out.printf(" - Produto %d%n - Quantidade: %d%n - Subtotal: $%.2f%n", produto, quantidade, subtotal);
        }
        System.out.println("%n-------------------------------");
        System.out.printf("Total de vendas: $%.2f%n", totalDeVendas);

        input.close();
    }
}
