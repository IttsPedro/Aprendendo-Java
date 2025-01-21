package Exercicios_Capitulo3;

public class InvoiceTest
{
    public static void main(String[] args)
    {

        Invoice compras = new Invoice("001","placa mae xp1" , 500 , 199.90);

        System.out.printf("\nNumero: %s \nDescrição: %s \nQuantidade: %s \nPreço: %s \nTotal: %s" ,
                compras.getNumber() ,
                compras.getDescription() ,
                compras.getQuantity() ,
                compras.getItemprice() ,
                compras.getGetInvoiceAmount());

    }
}
