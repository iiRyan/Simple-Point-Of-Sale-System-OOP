package com.pos;

public class InvoiceItem extends Item {

    private Storage storage = new Storage();

    public InvoiceItem(String code, int quantity) {
        try {
            storage.starter();
            Item item = storage.findByCode(code);
            this.setCode(code);
            this.setDescription(item.getDescription());
            this.setUPrice((item.getUPrice() * quantity));
            this.setQuantity(quantity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "InvoiceItem [" + ", storage=" + storage + "]" + super.toString();
    }

}
