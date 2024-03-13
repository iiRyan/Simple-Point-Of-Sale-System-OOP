
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pos.Invoice;
import com.pos.InvoiceItem;
import com.pos.Item;
import com.pos.PrintItem;
import com.pos.Storage;
import com.pos.StorageItem;

public class App {
    public static void main(String[] args) throws Exception {
        // startTheStore();
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
        printStoreHeader();

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

    public static void printStoreHeader() {
        String stars = "**";
        String welcome = "WELCOME TO THE STORE!";
        String bottomLine = "";

        String header = String.format("%-20s %-40s %s ", stars, welcome, stars);
        System.out.println(header);
        String content = String.format("| %8s |%n | %-40s | %n | %-408s |%n", "TEST", "TEST2", "TEST3");
        System.out.println(content);
        for (int i = 0; i < header.length(); i++) {
            bottomLine += "*";

        }
        System.out.print(bottomLine);
    }
}