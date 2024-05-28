package Single_Reponsibility;

import Single_Reponsibility.with.InvoiceDao;
import Single_Reponsibility.with.InvoicePrinter;
import Single_Reponsibility.without.Invoice;

public class Driver {
    public static void main(String[] args) {
        Marker marker=new Marker("Maker1", "Blue", 2020, 110);
        /*
        Invoice invoice1=new Invoice(marker, 10);
        
        System.out.println(invoice1.calculateTotal());
        invoice1.printInvoice();
        invoice1.saveToDB();

        */

        /**A Class should have only one reason to change */
        Invoice invoice1=new Invoice(marker, 10);
        System.out.println(invoice1.calculateTotal());

        InvoiceDao dao=new InvoiceDao();
        InvoicePrinter print=new InvoicePrinter();

        dao.saveToDB();

        print.printInvoice();


    }
}
