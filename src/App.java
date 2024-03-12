
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
        startTheStore();
        // List<Item> invoiceItems = new ArrayList<>();
        // PrintItem printer = new PrintItem();

        // Storage theStorage = new Storage();
        // // Initialize the Store
        // theStorage.starter();
        // // List the Item in the Store
        // printer.printItems(theStorage.findAll());

        // InvoiceItem invoiceItem = new InvoiceItem("2", 4);
        // InvoiceItem invoiceItem1 = new InvoiceItem("3", 2);
        // InvoiceItem invoiceItem2 = new InvoiceItem("4", 1);
        // InvoiceItem invoiceItem3 = new InvoiceItem("20", 4);
        // InvoiceItem invoiceItem4 = new InvoiceItem("19", 3);

        // invoiceItems.add(invoiceItem1);
        // invoiceItems.add(invoiceItem2);
        // invoiceItems.add(invoiceItem3);
        // invoiceItems.add(invoiceItem);
        // invoiceItems.add(invoiceItem4);

        // Invoice theInvoice = new Invoice("Rayan", LocalDate.now(), invoiceItems);

        // printer.printInvoice(theInvoice);
        // printer.printTotal(theInvoice.sumTotal(), theInvoice.getTotalQty());

    }

    public static void startTheStore() throws Exception {

        Scanner input = new Scanner(System.in);
        Storage theStorage = new Storage();
        String line;

        while (!(line = input.nextLine()).equals("x")) {
            System.out.println("in while");
        }
        System.out.println("Thank You! Come Again");
    }

}