import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Storage {
    List<storageItem> itemsList = new ArrayList<>();
    PrintItem printer;

    public Storage() {
        itemsList = new ArrayList<>();
        printer = new PrintItem();
    }

    public storageItem findByCode(String code) throws Exception {
        storageItem targetItem = null;
        for (storageItem item : itemsList) {
            if (item.getCode().equals(code)) {
                targetItem = item;
            }
        }
        return targetItem;
    }

    public void loadItemsFromFile(String path) throws Exception {
        try {
            Scanner src = new Scanner(
                    new File(path));
            String line = "";

            while (src.hasNextLine()) {
                line = src.nextLine();
                itemsList.add(new storageItem(line));
            }
            src.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

    public void printItems() {
        printer.printHeader();
        printer.printBody(itemsList);
    }

    public void printItems(storageItem items) {
        printer.printHeader();
        printer.printBody(items);
    }
}
