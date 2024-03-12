package com.sposs;

import java.time.LocalDate;
import java.util.List;

public class Invoice {
    private String username;
    private LocalDate transactionDate;
    private List<Item> invoiceItemsList;
    private float totalPrice = 0;
    private static int id = 1;
    private int totalQty = 0;

    public Invoice(String username, LocalDate transactionDate, List<Item> invoiceItemsList) {
        this.username = username;
        this.transactionDate = transactionDate;
        this.invoiceItemsList = invoiceItemsList;
        id++;
    }

    public float getTotal() {
        return totalPrice;
    }

    public int getTotalQty() {
        for (Item item : invoiceItemsList) {
            totalQty += item.getQuantity();
        }
        return this.totalQty;
    }

    public float sumTotal() {
        for (Item item : invoiceItemsList) {
            totalPrice += item.getUPrice();
        }
        return this.totalPrice;
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
