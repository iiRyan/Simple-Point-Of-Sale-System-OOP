package com.sposs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Storage {
    List<StorageItem> itemsList;
    PrintItem printer;

    public Storage() {
        itemsList = new ArrayList<>();
        printer = new PrintItem();

    }

    public void starter() throws Exception {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter the FIle Path: ");
        // String path = input.nextLine();
        loadItemsFromFile("C:/V3/https---github.com-iiRyan-Simple-Point-Of-Sale-System/src/SuperMarket.txt");
    }

    public StorageItem findByCode(String code) throws Exception {
        StorageItem targetItem = null;
        starter();
        for (StorageItem item : itemsList) {
            if (item.getCode().equals(code)) {
                targetItem = item;
            }
        }
        return targetItem;
    }

    public List<StorageItem> findAll() {
        return itemsList;
    }

    public void loadItemsFromFile(String path) throws Exception {
        try {
            Scanner src = new Scanner(
                    new File(path));
            String line = "";

            while (src.hasNextLine()) {
                line = src.nextLine();
                itemsList.add(new StorageItem(line));
            }
            src.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

}
