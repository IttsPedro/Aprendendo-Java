package Exercicios_Capitulo5;

public class TrianguloPrint {
    public static void main(String[] args) {
        firstTriangulo();
        secondTriangulo();
        thirdTriangulo();
        fouthTriangulo();
    }

    public static void firstTriangulo() {
        for (int line = 1; line <= 10; line++) {
            for (int stars = 1; stars <= line; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void secondTriangulo() {
        for (int line = 1; line <= 10; line++) {
            for (int stars = 10; stars >= line; stars--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void thirdTriangulo() {
        for (int line = 1; line <= 10; line++) {
            for (int spaces = 1; spaces < line; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 10; stars >= line; stars--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void fouthTriangulo(){
        for (int line = 1; line <= 10; line++){
            for (int spaces = 9; spaces >= line; spaces--){
                System.out.print(" ");
            }
            for (int stars = 1; stars <= line; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
