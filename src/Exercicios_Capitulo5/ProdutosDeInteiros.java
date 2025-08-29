package Exercicios_Capitulo5;

public class ProdutosDeInteiros {
    public static void main(String[] args) {

        int produto = 1;

        for (int i = 1; i <= 15; i += 2){
            produto *= i;
        }
        System.out.printf("O valor do produto dos inteiros de 1 a 15 é: %d%n", produto);
    }
}
