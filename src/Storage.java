import java.io.File;
import java.util.*;

public class Storage {
    List<storageItem> itemsList;
    HelperClass helperClass = new HelperClass();

    public Storage() {

    }

    public void loadItemsFromFile() throws Exception {
        Scanner src = new Scanner(new File("D:/Java/Practic/coreJava/src/SuperMarket.txt"));
        itemsList = new ArrayList<>();

        while (src.hasNextLine()) {
            String line = src.nextLine();
            itemsList.add(new storageItem(line));
        }
        System.out.println(itemsList.size());
        src.close();

    }

}
