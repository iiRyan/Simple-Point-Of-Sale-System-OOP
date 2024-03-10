package com.sposs;

import java.time.LocalDate;
import java.util.List;

public class Invoice {
    private String username;
    private LocalDate transactionDate;
    private List<Item> invoiceItemsList;
    private float total = 0;
    private static int id = 1;

    public Invoice(String username, LocalDate transactionDate, List<Item> invoiceItemsList) {
        this.username = username;
        this.transactionDate = transactionDate;
        this.invoiceItemsList = invoiceItemsList;
        id++;
    }

    public float getTotal() {
        return total;
    }

    public float sumTotal() {
        for (Item item : invoiceItemsList) {
            total += item.getUPrice();
        }
        return this.total;
    }

    public static int getId() {
        return id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getTransactionDate() {
        return this.transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public List<Item> getItemsList() {
        return this.invoiceItemsList;
    }

    public void setItemsList(List<Item> invoiceItemsList) {
        this.invoiceItemsList = invoiceItemsList;
    }

    @Override
    public String toString() {
        return "Invoice [username=" + username + ", transactionDate=" + transactionDate + ", invoiceItemsList="
                + invoiceItemsList + "]";
    }

    public Invoice() {
    }

}
