package com.sposs;

// Create new class for Item and make this class derived it.
public class InvoiceItem {
    private String description;
    private String code;
    private float uPrice; // unit price
    private int quantity;

    private Storage storage;

    public InvoiceItem() {
        storage = new Storage();
    }

    public InvoiceItem(String code, int quantity) {
        try {
            StorageItem item = storage.findByCode(code);

            this.code = item.getCode();
            this.description = item.getDescription();
            this.uPrice = item.getuPrice();
            this.quantity = (int) (quantity * uPrice);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
