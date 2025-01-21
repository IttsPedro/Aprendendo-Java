package Exercicios_Capitulo3;
// Programa de loja de suprimentos de informática
// Exercício Invoice.java
public class Invoice
{
    // variáveis de instância
    private String number, description;
    private int quantity; // quantidade comprada de um item
    private double Itemprice; // preço por item

    //criando um construtor da classe
    //iniciando as variaveis de instancia

    public Invoice()
    {

    }

    public Invoice (String number, String description, int quantity, double Itemprice)
    {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.Itemprice = Itemprice;

    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getNumber()
    {
        return number;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setQuantity(int quantity)
    {
        if (quantity > 0.0)
            this.quantity = quantity;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setItemprice(double Itemprice)
    {
        if (Itemprice > 0.0)
            this.Itemprice = Itemprice;
    }

    public double getItemprice()
    {
        return Itemprice;
    }

    public double getGetInvoiceAmount()
    {
        return Itemprice * quantity;
    }

}
