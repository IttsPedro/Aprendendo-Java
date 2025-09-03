package Exercicios_Capitulo5;

public class CalculandoPi {
    public static void main(String[] args) {

        double pi = 0;
        int counter = 0;

        for (int i = 1; i <= 200000; i++){
            if (i % 2 == 1){
                pi = pi + 4.0 / (2 * i - 1);

            }else{
                pi = pi - 4.0 / (2 * i - 1);
            }

            if (counter == 0 && pi > 3.14159 && pi < 3.142){
                counter = i;
            }
        }

        System.out.println("Valor de PI: " + pi);
        System.out.println("Termos necessários para 3.14159: " + counter);
    }
}