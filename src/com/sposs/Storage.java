package com.sposs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Storage {
    List<Item> itemsList;

    public Storage() {
        itemsList = new ArrayList<>();

    }

    public void starter() throws Exception {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter the FIle Path: ");
        // String path = input.nextLine();
        loadItemsFromFile("D:/Java/Practic/coreJava/src/SuperMarket.txt");
    }

    public Item findByCode(String code) throws Exception {
        Item targetItem = null;
        for (Item item : itemsList) {
            if (item.getCode().equals(code)) {
                targetItem = item;
            }
        }
        return targetItem;
    }

    public List<Item> findAll() {
        return itemsList;
    }

    // This method load Items form the target file.
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
