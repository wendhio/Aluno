package ch03.Exer03_13;

public class InvoiceTest
{
    public static void main(String[] args)
    {
        Invoice i = new Invoice("011.527.080-90", "Informática",
                500, 199.90);

        System.out.printf("Numero: %s\nDescrição: %s\nQuantidade: %d\n"
                + "Preço: %s\nTotal: %s\n", i.getNum(), i.getDes(),
                i.getQuant(), i.getPreco(), i.getInvoiceAmount());

        i.setPreco(100.00);
        i.setQuant(3);

        System.out.println("-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;");
        System.out.printf("Numero: %s\nDescrição: %s\nQuantidade: %d\n"
                + "Preço: %s\nTotal: %s\n", i.getNum(), i.getDes(),
                i.getQuant(), i.getPreco(), i.getInvoiceAmount());
    }
}
