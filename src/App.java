
import java.util.*;

import com.sposs.InvoiceItem;
import com.sposs.PrintItem;
import com.sposs.Storage;
import com.sposs.StorageItem;

public class App {
    public static void main(String[] args) throws Exception {

        InvoiceItem invoiceItem = new InvoiceItem();
        PrintItem printItem = new PrintItem();
        Storage storage = new Storage();

        storage.starter();

        invoiceItem.buyAnItem("2", 1);
        invoiceItem.buyAnItem("1", 1);
        printItem.printTotal(invoiceItem.getTotal());

    }

}