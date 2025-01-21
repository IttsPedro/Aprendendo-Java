package Exercicios_Capitulo3;
// Exercício 3.14: DateTest.java
public class DateTest
{
    public static void main(String[] args)
    {
        Date date = new Date(27,12,1998);

        date.displayDate();

        date.setDia(12);
        date.setMês(04);
        date.setAno(2000);

        date.displayDate();

    }
}
