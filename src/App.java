
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sposs.Invoice;
import com.sposs.InvoiceItem;
import com.sposs.Item;
import com.sposs.PrintItem;
import com.sposs.Storage;
import com.sposs.StorageItem;

public class App {
    public static void main(String[] args) throws Exception {
        // startTheStore();
        List<Item> invoiceItems = new ArrayList<>();
        PrintItem printer = new PrintItem();

        Storage theStorage = new Storage();
        // Initialize the Store
        theStorage.starter();
        // List the Item in the Store
        printer.printItems(theStorage.findAll());

        InvoiceItem invoiceItem = new InvoiceItem("2", 4);
        InvoiceItem invoiceItem1 = new InvoiceItem("3", 4);
        InvoiceItem invoiceItem2 = new InvoiceItem("4", 4);
        InvoiceItem invoiceItem3 = new InvoiceItem("20", 4);
        InvoiceItem invoiceItem4 = new InvoiceItem("19", 4);

        invoiceItems.add(invoiceItem1);
        invoiceItems.add(invoiceItem2);
        invoiceItems.add(invoiceItem3);
        invoiceItems.add(invoiceItem);
        invoiceItems.add(invoiceItem4);

        Invoice theInvoice = new Invoice("Rayan", LocalDate.now(), invoiceItems);

        printer.printInvoice(theInvoice);
        printer.printTotal(theInvoice.sumTotal());
    }

    public static void startTheStore() throws Exception {
        Storage theStorage = new Storage();
        Scanner input = new Scanner(System.in);
        PrintItem printer = new PrintItem();
        Invoice invoice = null;
        List<InvoiceItem> invoiceItemsList = new ArrayList<>();
        InvoiceItem invoiceItem = null;
        StorageItem storageItem = null;
        // Initialize the Store
        theStorage.starter();
        // List the Item in the Store
        printer.printItems(theStorage.findAll());

        System.out.print("Please Enter the Item's code and the Quantity you would like to Buy \n  * or 0 to exit \n");
        String code = "";
        String line = "";
        int qty = 0;
        while (!(line = input.nextLine()).equals("x")) {
            System.out.print("Pleas Enter the Code: ");
            code = input.next();
            System.out.print("Pleas Enter the Quantity: ");
            qty = input.nextInt();

            if (!code.equals("0")) {
                invoiceItem = new InvoiceItem(code, qty);
                invoiceItemsList.add(invoiceItem);
            }
        }

    }

}