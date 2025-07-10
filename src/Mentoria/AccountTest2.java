package Mentoria;

public class AccountTest2 {
    public static void main(String[] args) {
        String name = "Pedro Rodrigues";
        int length = name.length();
        int counter = 0;
        char numberLetter = 'r';

        for (int i = 0; i < length; i++) {
//            System.out.println(i);
            char charAt = name.charAt(i);
            System.out.println(charAt);
        }
        for (int i = length - 1; i >= 0; i--) {
//            System.out.println(i);
            char charAt = name.charAt(i);
            System.out.println(charAt);
        }
        // Exercício
        for (int i = 0; i < length; i += 2)
        {
            char charAt = name.charAt(i);
            System.out.println(charAt);
        }

        for (int i = 0; i < length; i++)
        {
            char charAt = name.charAt(i);

            if (Character.toLowerCase(charAt) == Character.toLowerCase(numberLetter)) {
                    counter++;
            }
        }

        System.out.println("This letter " + numberLetter + " appears " + counter + " times ");

        }
    }