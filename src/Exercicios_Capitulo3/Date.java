package Exercicios_Capitulo3;
// Exercício 3.14 Date.java
public class Date
{
    private int dia, mês, ano;

    public Date (int dia, int mês, int ano )
    {
        this.dia = dia;
        this.mês = mês;
        this.ano = ano;

    }

    public void setDia(int dia)
    {
        this.dia = dia;
    }

    public void setMês(int mês)
    {
        this.mês = mês;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public int getDia()
    {
        return dia;
    }

    public int getMês()
    {
        return mês;
    }

    public int getAno()
    {
        return ano;
    }

    public void displayDate()
    {
        System.out.printf("%d / %d / %d %n", getDia(), getMês(), getAno());
    }
}
