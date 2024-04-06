package pl.edu.agh.mwo.invoice.product;

import pl.edu.agh.mwo.invoice.DefaultPrinter;
import pl.edu.agh.mwo.invoice.Invoice;

import java.math.BigDecimal;

public class Main {
    private static final int POT_PRICE = 10;
    
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new DefaultPrinter());
        invoice.addProduct(new OtherProduct("Doniczka", new BigDecimal(POT_PRICE)), 2);
        System.out.println(invoice.printInvoice());
    }
}
