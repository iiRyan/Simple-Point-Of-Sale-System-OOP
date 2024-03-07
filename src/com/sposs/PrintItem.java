package com.sposs;

import java.util.List;

public class PrintItem {
    private int length;

    public void header() {
        String header = String.format("| %2s | %-40s | %6s | %3s |", "ID", "Description", "Price", "Qty");
        this.length = header.length();
        separation();
        System.out.println(header);

    }

    public void body(List<StorageItem> itemsList) {
        String body = "";
        for (StorageItem item : itemsList) {
            body = String.format("| %2s | %-40s | %6.2f | %3d |", item.getCode(), item.getDescription(),
                    item.getuPrice(), item.getQuantity());
            System.out.println(body);
        }
    }

    public void body(StorageItem item) {
        String body = "";

        body = String.format("| %2s | %-40s | %6.2f | %3d |", item.getCode(), item.getDescription(),
                item.getuPrice(), item.getQuantity());
        System.out.println(body);

    }

    public void separation() {
        String header = "";
        for (int i = 0; i < length; i++) {
            header += "-";
        }
        System.out.println(header);
    }

    public void printItems(List<StorageItem> itemsList) {
        header();
        separation();
        body(itemsList);
        separation();
    }

    public void printTotal(float total) {
        String printTotal = String.format("%3s", "Total: " + total + "$");
        System.out.println(printTotal);
        separation();
    }
}
