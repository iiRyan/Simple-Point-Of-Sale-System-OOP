package com.sposs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Storage {
    List<Item> itemsList;

    public Storage() {
        itemsList = new ArrayList<>();
        try {
            starter();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void starter() throws Exception {
        // You can get the path from the user , just uncomment the three next lines.
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
        if (path != null) {
            try {
                Scanner src = new Scanner(
                        new File(path));
                String line = "";
                // add StorageItem to the itemsList.
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
        } else {
            System.out.println("The given Path is empty");
        }

    }

}
