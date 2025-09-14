package Exercicios_Capitulo5;

public class TriplePitagoras {
    public static void main(String[] args) {

        System.out.println("Triplos de Pitágoras");
        int counter = 0;

        for (int side1 = 1; side1 <= 500; side1++){
            for (int side2 = side1; side2 <= 500; side2++){
                for (int hipotenusa = side2; hipotenusa <= 500; hipotenusa++){

                    if (side1 * side1 + side2 * side2 == hipotenusa * hipotenusa){
                        System.out.printf("%d\t%d\t%d\n", side1, side2, hipotenusa);
                        counter++;
                    }
                }
            }
        }
        System.out.println("Total dos triplos encontrados: " + counter);
    }
}
