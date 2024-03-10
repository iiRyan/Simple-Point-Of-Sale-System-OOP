package com.sposs;

import java.util.List;

public class PrintItem {
    private int length = 50;

    public void header() {
        String header = String.format("| %2s | %-40s | %6s | %3s |", "ID", "Description", "Price", "Qty");
        this.length = header.length();
        separation();
        System.out.println(header);

    }

    public void body(List<Item> itemsList) {
        String body = "";
        for (Item item : itemsList) {
            body = String.format("| %2s | %-40s | %6.2f | %3d |", item.getCode(), item.getDescription(),
                    item.getUPrice(), item.getQuantity());
            System.out.println(body);
        }
        separation();
    }

    public void body(Item item) {
        String body = "";

        body = String.format("| %2s | %-40s | %6.2f | %3d |", item.getCode(), item.getDescription(),
                item.getUPrice(), item.getQuantity());
        System.out.println(body);

    }

    public void separation() {
        String header = "";
        for (int i = 0; i < length; i++) {
            header += "-";
        }
        System.out.println(header);
    }

    public void printItems(List<Item> itemsList) {
        header();
        separation();
        body(itemsList);

    }

    public void printTotal(float total) {
        String printTotal = String.format("%3s", "Total: " + total + "$");
        System.out.println(printTotal);
        separation();
    }

    public void printInvoice(Invoice invoice) {
        separation();
        String printBody = "";
        printBody = String.format("| Invoice Number:  %s %n", Invoice.getId());
        printBody += String.format("| Customer Name:  %s %n", invoice.getUsername());
        printBody += String.format("| Transaction Date:  %s", invoice.getTransactionDate());
        System.out.println(printBody);

        printItems(invoice.getItemsList());
    }

}
