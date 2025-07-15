package Exercicios_Capitulo3;
// Exercício 3.14 Date.java
public class Date
{
    private int dia, mes, ano;

    public Date (int dia, int mes, int ano )
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public void setDia(int dia)
    {
        this.dia = dia;
    }

    public void setMes(int mes)
    {
        this.mes = mes;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public int getDia()
    {
        return dia;
    }

    public int getMes()
    {
        return mes;
    }

    public int getAno()
    {
        return ano;
    }

    public void displayDate()
    {
        System.out.printf("%d / %d / %d %n", getDia(), getMes(), getAno());
    }
}
