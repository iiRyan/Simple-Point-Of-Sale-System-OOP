
import java.util.*;

import com.sposs.Storage;
import com.sposs.StorageItem;

public class App {
    public static void main(String[] args) throws Exception {

        Storage storage = new Storage();
        // storage.starter();
        storage.printItems(storage.findByCode("4"));

    }

}