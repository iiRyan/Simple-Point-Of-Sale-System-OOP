package com.sposs;

// Create new class for Item and make this class derived it.
public class InvoiceItem {
    private String description;
    private String code;
    private float uPrice; // unit price
    private int quantity;
    private float total = 0;
    private Storage storage;

    public InvoiceItem() {
        storage = new Storage();
    }

    public void buyAnItem(String code, int quantity) {
        try {
            StorageItem item = storage.findByCode(code);

            this.code = item.getCode();
            this.description = item.getDescription();
            this.uPrice = item.getuPrice() * quantity;
            this.quantity = quantity;
            this.total += this.uPrice;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "InvoiceItem [description=" + description + ", code=" + code + ", uPrice=" + uPrice + ", quantity="
                + quantity + ", total=" + total + ", storage=" + storage + "]";
    }

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    public float getuPrice() {
        return uPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public Storage getStorage() {
        return storage;
    }

    public float getTotal() {
        return total;
    }

}
