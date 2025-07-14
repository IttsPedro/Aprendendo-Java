package Exercicios_Capitulo3;
// Programa de loja de suprimentos de informática
// Exercício Invoice.java
public class Invoice
{
    // variáveis de instância
    private String number, description;
    private int quantity; // quantidade comprada de um item
    private double ItemPrice; // preço por item

    //criando um construtor da classe
    //iniciando as variáveis de instância
    public Invoice (String number, String description, int quantity, double ItemPrice)
    {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.ItemPrice = ItemPrice;

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

    public void setItemPrice(double ItemPrice)
    {
        if (ItemPrice > 0.0)
            this.ItemPrice = ItemPrice;
    }

    public double getItemprice()
    {
        return ItemPrice;
    }

    public double getGetInvoiceAmount()
    {
        return ItemPrice * quantity;
    }
}

